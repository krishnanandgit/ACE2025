package java_programs.Fitness_Class_Booking_Platform;

import java.util.Date;

public class Attendance {
    private int attendanceId;
    private User user;
    private FitnessClass fitnessClass;
    private Date date;

    public Attendance(int attendanceId, User user, FitnessClass fitnessClass, Date date) {
        this.attendanceId = attendanceId;
        this.user = user;
        this.fitnessClass = fitnessClass;
        this.date = date;
    }

    public void displayAttendance() {
        System.out.println("Attendance ID: " + attendanceId);
        user.displayUser();
        fitnessClass.displayFitnessClass();
        System.out.println("Date: " + date);
    }
}
