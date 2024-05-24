package java_programs.Fitness_Class_Booking_Platform;

import java.util.ArrayList;
import java.util.List;

public class FitnessClass {
    private int classId;
    private String name;
    private Instructor instructor;
    private Schedule schedule;
    private Location location;
    private List<User> attendees;

    public FitnessClass(int classId, String name, Instructor instructor, Schedule schedule, Location location) {
        this.classId = classId;
        this.name = name;
        this.instructor = instructor;
        this.schedule = schedule;
        this.location = location;
        this.attendees = new ArrayList<>();
    }

    public void addAttendee(User user) {
        this.attendees.add(user);
    }

    public void displayFitnessClass() {
        System.out.println("Class ID: " + classId);
        System.out.println("Name: " + name);
        instructor.displayInstructor();
        schedule.displaySchedule();
        location.displayLocation();
        System.out.println("Attendees:");
        for (User attendee : attendees) {
            attendee.displayUser();
        }
    }
}
