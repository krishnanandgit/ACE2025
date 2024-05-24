package Task_scheduling_application;

public class Calender {
    private String calendar_id;
    private String date;
    private String event;
    private String user_id;

    public Calender(String calendar_id, String date, String event, String user_id) {
        this.calendar_id = calendar_id;
        this.date = date;
        this.event = event;
        this.user_id = user_id;
    }

    public String getCalendar_id() {
        return calendar_id;
    }

    public void setCalendar_id(String calendar_id) {
        this.calendar_id = calendar_id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }
    public void Calenderdisplay() {
        System.out.println("Calendar Event details:");
        System.out.println("Calendar ID: " + calendar_id);
        System.out.println("Date: " + date);
        System.out.println("Event: " + event);
        System.out.println("User ID: " + user_id);
    }



}
