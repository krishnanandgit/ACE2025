package smartcity;

public class Main {
    public static void main(String[] args) {
        // Instantiate the service class
        service service = new service();
        
        // Example usage
        int id = service.getId();
        String name = service.getName();
        String description = service.getDescription();
        
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Description: " + description);
    }
}

    public static void main(String[] args) {
        // Create an instance of the Entity class
        Entity entity = new Entity(1, "Example", "This is an example entity");
        
        // Access and modify attributes using getter and setter methods
        System.out.println("ID: " + entity.getId());
        System.out.println("Name: " + entity.getName());
        System.out.println("Description: " + entity.getDescription());
        
        entity.setName("New Name");
        entity.setDescription("New Description");

        System.out.println("\nUpdated values:");
        System.out.println("Name: " + entity.getName());
        System.out.println("Description:
    }
    public class Main {
        public static void main(String[] args) {
            // Creating an instance of IoTDevice
            IoTDevice device1 = new IoTDevice(1, "Smart Bulb", "Control your lights remotely");
            
            // Displaying information about the IoT device
            System.out.println("Device ID: " + device1.getId());
            System.out.println("Device Name: " + device1.getName());
            System.out.println("Device Description: " + device1.getDescription());
            
            // Updating device information
            device1.setName("Smart Thermostat");
            device1.setDescription("Regulate your home temperature from anywhere");
            
            // Displaying updated information
            System.out.println("\nUpdated Device Name: " + device1.getName());
            System.out.println("Updated Device Description: " + device1.getDescription());
        }
    }
    public class Main {
        public static void main(String[] args) {
            // Create an instance of Analytics
            Analytics analytics = new Analytics();
            
            // Set ID and description
            analytics.setId(1);
            analytics.setDescription("Sample analytics data");
            
            // Display ID and description
            System.out.println("ID: " + analytics.getId());
            System.out.println("Description: " + analytics.getDescription());
        }
    }
    public class Main {
        public static void main(String[] args) {
            // Create an incident
            Incident incident = new Incident();
            
            // Set attributes
            incident.setId(1);
            incident.setDate(20240524);
            incident.setDescription("Car accident");
            incident.setLocation("Main Street");
            incident.setCitizenId(12345);
            
            // Retrieve and print incident details
            System.out.println("Incident ID: " + incident.getId());
            System.out.println("Date: " + incident.getDate());
            System.out.println("Description: " + incident.getDescription());
            System.out.println("Location: " + incident.getLocation());
            System.out.println("Citizen ID: " + incident.getCitizenId());
        }
    }
    public class Main {
        public static void main(String[] args) {
            // Creating an instance of Maintenance
            Maintenance maintenance1 = new Maintenance(1, 20240524, 1001, "Routine checkup");

            // Accessing attributes using getter methods
            System.out.println("Maintenance ID: " + maintenance1.getId());
            System.out.println("Date: " + maintenance1.getDate());
            System.out.println("Infrastructure ID: " + maintenance1.getInfrastructureId());
            System.out.println("Description: " + maintenance1.getDescription());

            // Modifying attributes using setter methods
            maintenance1.setDescription("Oil change");
            System.out.println("Updated description: " + maintenance1.getDescription());
        }
    }
    public class Main {
        public static void main(String[] args) {
            // Creating a Permit object
            Permit permit = new Permit(1, 20240101, 20241231, "Example Permit", 123456);
            
            // Displaying permit information
            System.out.println("Permit Information:");
            System.out.println(permit);
            
            // Modifying permit information
            permit.setDescription("Updated Permit");
            permit.setDateExpiry(20250101);
            
            // Displaying updated permit information
            System.out.println("\nUpdated Permit Information:");
            System.out.println(permit);
        }
    }
 // Main.java

    public class Main {
        public static void main(String[] args) {
            // Creating a sample Complaint object
            Complaint complaint1 = new Complaint(1, 20240524, "Loud noise", "123 Main St", 1001);

            // Accessing attributes using getters
            System.out.println("Complaint ID: " + complaint1.getId());
            System.out.println("Date: " + complaint1.getDate());
            System.out.println("Description: " + complaint1.getDescription());
            System.out.println("Location: " + complaint1.getLocation());
            System.out.println("Citizen ID: " + complaint1.getCitizenId());

            // Modifying attributes using setters
            complaint1.setDescription("Vandalism");
            complaint1.setLocation("456 Elm St");

            // Accessing modified attributes
            System.out.println("Modified Description: " + complaint1.getDescription());
            System.out.println("Modified Location: " + complaint1.getLocation());
        }
    }


