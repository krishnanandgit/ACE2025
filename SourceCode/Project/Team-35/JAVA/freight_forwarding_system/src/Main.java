import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Shipment
        System.out.println("Enter the shipment_id :");
        int shipment_ID = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.println("Enter the origin :");
        String origin = sc.nextLine();
        System.out.println("Enter the destination :");
        String destination = sc.nextLine();
        System.out.println("Enter the shipping_date :");
        String shipping_Date = sc.nextLine();
        System.out.println("Enter the arrival_date :");
        String arrival_Date = sc.nextLine();
        System.out.println("Enter the shipment_status :");
        String shipment_Status = sc.nextLine();
        System.out.println("Enter the weight :");
        double weight = sc.nextDouble();
        System.out.println("Enter the volume :");
        double volume = sc.nextDouble();
        System.out.println("Enter the client_id :");
        int client_ID = sc.nextInt();

        Shipment shipment = new Shipment(shipment_ID, origin, destination, shipping_Date, arrival_Date, shipment_Status, weight, volume, client_ID);
        shipment.displayShipment();

        // Container
        System.out.println("Enter the container_ID :");
        int container_ID = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.println("Enter the container_type :");
        String container_Type = sc.nextLine();
        System.out.println("Enter the container_size :");
        String container_Size = sc.nextLine();
        System.out.println("Enter the weight_capacity :");
        double weight_Capacity = sc.nextDouble();
        sc.nextLine(); // consume newline
        System.out.println("Enter the container_status :");
        String container_Status = sc.nextLine();
        System.out.println("Enter the arrival_date :");
        String container_Arrival_Date = sc.nextLine();
        System.out.println("Enter the departure_date :");
        String container_Departure_Date = sc.nextLine();
        System.out.println("Enter the shipment_id :");
        int container_Shipment_ID = sc.nextInt();

        Container container = new Container(container_ID, container_Type, container_Size, weight_Capacity, container_Status, container_Arrival_Date, container_Departure_Date, container_Shipment_ID);
        container.displayContainer();

        // Invoice
        System.out.println("Enter the invoice_ID :");
        int invoice_ID = sc.nextInt();
        System.out.println("Enter the shipment_ID :");
        int invoice_shipment_ID = sc.nextInt();
        System.out.println("Enter the client_ID :");
        int invoice_client_ID = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.println("Enter the amount :");
        Double amount = sc.nextDouble();
        System.out.println("Enter the due_date :");
        String due_Date = sc.nextLine();
        System.out.println("Enter the invoice_Status :");
        String invoice_Status = sc.nextLine();

        Invoice invoice = new Invoice(invoice_ID,invoice_shipment_ID,invoice_client_ID,amount,due_Date,invoice_Status);
        invoice.displayInvoice();

        // Carrier
        System.out.println("Enter the Carrier_ID :");
        int carrier_ID = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.println("Enter the Carrier_Name :");
        String carrier_Name = sc.nextLine();
        System.out.println("Enter the Contact_Info :");
        String contact_Info = sc.nextLine();
        System.out.println("Enter the Address :");
        String address = sc.nextLine();
        System.out.println("Enter the Carrier_Type :");
        String carrier_Type = sc.nextLine();

        Carrier carrier = new Carrier(carrier_ID, carrier_Name, contact_Info, address, carrier_Type);
        carrier.displayCarrier();

        // Booking
        System.out.println("Enter the booking_ID :");
        int booking_ID = sc.nextInt();
        System.out.println("Enter the shipment_ID :");
        int booking_Shipment_ID = sc.nextInt();
        System.out.println("Enter the container_ID :");
        int booking_Container_ID = sc.nextInt();
        System.out.println("Enter the carrier_ID :");
        int booking_Carrier_ID = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.println("Enter the booking_Date :");
        String booking_Date = sc.nextLine();
        System.out.println("Enter the departure_Date :");
        String booking_Departure_Date = sc.nextLine();
        System.out.println("Enter the arrival_Date :");
        String booking_Arrival_Date = sc.nextLine();
        System.out.println("Enter the booking_Status :");
        String booking_Status = sc.nextLine();

        Booking booking = new Booking(booking_ID, booking_Shipment_ID, booking_Container_ID, booking_Carrier_ID, booking_Date, booking_Departure_Date, booking_Arrival_Date, booking_Status);
        booking.displayBooking();

        // Route
        System.out.println("Enter the route_ID :");
        int route_ID = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.println("Enter the origin :");
        String route_Origin = sc.nextLine();
        System.out.println("Enter the destination :");
        String route_Destination = sc.nextLine();
        System.out.println("Enter the distance :");
        double distance = sc.nextDouble();
        sc.nextLine(); // consume newline
        System.out.println("Enter the estimated_Duration :");
        String estimated_Duration = sc.nextLine();

        Route route = new Route(route_ID, route_Origin, route_Destination, distance, estimated_Duration);
        route.displayRoute();

        // Client
        System.out.println("Enter the client_ID :");
        int client_id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.println("Enter the client_Name :");
        String client_name = sc.nextLine();
        System.out.println("Enter the contact_Info :");
        String contact_info = sc.nextLine();
        System.out.println("Enter the address :");
        String client_address = sc.nextLine();

        Client client = new Client(client_id, client_name, contact_info, client_address);
        client.displayClient();

        // Document
        System.out.println("Enter the document_ID :");
        int document_id = sc.nextInt();
        System.out.println("Enter the shipment_ID :");
        int document_shipment_id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.println("Enter the document_Type :");
        String document_type = sc.nextLine();
        System.out.println("Enter the description :");
        String description = sc.nextLine();
        System.out.println("Enter the document_Status :");
        String document_status = sc.nextLine();

        Document doc = new Document(document_id, document_shipment_id, document_type, description, document_status);
        doc.displayDocument();

        // Tracking
        System.out.println("Enter the tracking_Id :");
        int tracking_id = sc.nextInt();
        System.out.println("Enter the shipment_Id :");
        int tracking_shipment_id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.println("Enter the location :");
        String location = sc.nextLine();
        System.out.println("Enter the datetime :");
        String dateTime = sc.nextLine();
        System.out.println("Enter the tracking_Status :");
        String tracking_status = sc.nextLine();

        Tracking tracking = new Tracking(tracking_id, tracking_shipment_id, location, dateTime, tracking_status);
        tracking.displayTracking();

        // Customs
        System.out.println("Enter the customs_ID :");
        int customs_id = sc.nextInt();
        System.out.println("Enter the shipment_ID :");
        int customs_shipment_id = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.println("Enter the declaration_Date :");
        String declaration_date = sc.nextLine();
        System.out.println("Enter the clearance_status :");
        String clearance_status = sc.nextLine();
        System.out.println("Enter the duty_amount :");
        String duty_amount = sc.nextLine();

        Customs customs = new Customs(customs_id, customs_shipment_id, declaration_date, clearance_status, duty_amount);
        customs.displayCustoms();
        sc.close();
    }
}
