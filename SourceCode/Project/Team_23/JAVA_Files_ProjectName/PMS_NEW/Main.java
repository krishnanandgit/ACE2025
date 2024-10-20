import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yy-MM-dd'T'HH:mm");

        RequestUtility requestUtility = new RequestUtility();

        while (true) {
            System.out.println("Enter a number:\n1. Admin\n2. Vehicle Owner\n3. Parking Lot Manager\n4. Submit a Request\n5. Update Request Status\n6. View Open Requests\n7. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (choice) {
                    case 1: // Admin Case
                    case 2: // Vehicle Owner Case
                    case 3: // Parking Lot Manager Case
                        handleUserActions(choice, scanner, formatter);
                        break;
                    case 4:
                        submitRequest(scanner, requestUtility);
                        break;
                    case 5:
                        updateRequestStatus(scanner, requestUtility);
                        break;
                    case 6:
                        viewOpenRequests(requestUtility);
                        break;
                    case 7:
                        System.out.println("Exiting the system...");
                        scanner.close();
                        return;
                    default:
                        throw new IllegalArgumentException("Invalid choice! Please enter a valid number.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

    private static void handleUserActions(int userType, Scanner scanner, DateTimeFormatter formatter) throws Exception {
        String[] userDetails = getUserDetails(scanner, userType);
        String name = userDetails[0];
        String contact = userDetails[1];

        if (userType == 1) {
            Adminn admin = new Adminn(Integer.parseInt(userDetails[2]), name, contact);
            admin.login();
            admin.viewAuditLogs();
            admin.logout();
        } else if (userType == 2) {
            handleVehicleOwnerActions(scanner, name, contact, Integer.parseInt(userDetails[2]));
        } else {
            handleParkingManagerActions(scanner, name, contact, Integer.parseInt(userDetails[2]), formatter);
        }
    }

    private static void handleVehicleOwnerActions(Scanner scanner, String ownerName, String ownerContact, int ownerId) throws Exception {
        System.out.print("Vehicle Type: ");
        String vehicleType = scanner.nextLine();

        VehicleOwner vehicleOwner = new VehicleOwner(ownerId, ownerName, ownerContact, ownerId, vehicleType);
        vehicleOwner.login();
        vehicleOwner.registerVehicle(vehicleType);

        if (promptYesNo(scanner, "Do you want to update your profile?")) {
            vehicleOwner.updateProfile(prompt(scanner, "Update Profile Name: "), prompt(scanner, "Update Profile Contact: "));
        }

        if (promptYesNo(scanner, "Do you want to view your parking history?")) {
            vehicleOwner.viewParkingHistory();
        }
        vehicleOwner.logout();
    }

    private static void handleParkingManagerActions(Scanner scanner, String managerName, String managerContact, int managerId, DateTimeFormatter formatter) throws Exception {
        ParkingLotManager manager = new ParkingLotManager(managerId, managerName, managerContact, managerId, managerId);
        manager.login();
        manager.monitorParkingSlots();

        System.out.println("Calculating Parking Fee:");
        Vehicle vehicle = new Vehicle(prompt(scanner, "Enter Vehicle Type: "), prompt(scanner, "Enter Vehicle License Plate: "));

        LocalDateTime entryTime = LocalDateTime.parse(prompt(scanner, "Enter Entry Time (yy-MM-dd'T'HH:mm): "), formatter);
        LocalDateTime exitTime = LocalDateTime.parse(prompt(scanner, "Enter Exit Time (yy-MM-dd'T'HH:mm): "), formatter);

        double parkingFee = manager.calculateParkingFee(vehicle, entryTime, exitTime);
        System.out.println("Parking Fee: $" + parkingFee);
        manager.logout();
    }

    private static void submitRequest(Scanner scanner, RequestUtility requestUtility) throws InvalidRequestStatusException {
        System.out.println("Submit a Request:");
        Request newRequest = new Request(promptInt(scanner, "Request ID: "), prompt(scanner, "Requester Name: "), LocalDateTime.now(), prompt(scanner, "Description: "));

        requestUtility.makeRequest(newRequest);
    }

    private static void updateRequestStatus(Scanner scanner, RequestUtility requestUtility) throws InvalidRequestStatusException, RequestNotFoundException {
        System.out.println("Update Request Status:");
        requestUtility.updateRequestStatus(promptInt(scanner, "Request ID: "), prompt(scanner, "Resolution: "), prompt(scanner, "Status (Open/Close): "));
    }

    private static void viewOpenRequests(RequestUtility requestUtility) {
        List<Request> openRequests = requestUtility.getOpenRequests();
        if (openRequests.isEmpty()) {
            System.out.println("No open requests.");
        } else {
            System.out.println("Open Requests:");
            openRequests.forEach(req -> System.out.println("Request ID: " + req.getRequestID() + ", Description: " + req.getDescription()));
        }
    }

    private static String[] getUserDetails(Scanner scanner, int userType) throws Exception {
        System.out.println((userType == 1 ? "Admin" : userType == 2 ? "Vehicle Owner" : "Parking Lot Manager") + " Login:");
        return new String[]{prompt(scanner, "Name: "), prompt(scanner, "Contact: "), String.valueOf(promptInt(scanner, "ID: "))};
    }

    private static String prompt(Scanner scanner, String message) {
        System.out.print(message);
        return scanner.nextLine();
    }

    private static int promptInt(Scanner scanner, String message) {
        System.out.print(message);
        int value = scanner.nextInt();
        scanner.nextLine(); // consume newline
        return value;
    }

    private static boolean promptYesNo(Scanner scanner, String message) {
        System.out.print(message + " (yes/no): ");
        return scanner.nextLine().equalsIgnoreCase("yes");
    }
}
