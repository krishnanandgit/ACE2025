package java_programs.Fitness_Class_Booking_Platform;

public class Instructor {
    private int instructorId;
    private String name, specialty;

    public Instructor(int instructorId, String name, String specialty) {
        this.instructorId = instructorId;
        this.name = name;
        this.specialty = specialty;
    }

    public void displayInstructor() {
        System.out.println("Instructor ID: " + instructorId);
        System.out.println("Name: " + name);
        System.out.println("Specialty: " + specialty);
    }
}
