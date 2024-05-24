package studentInfoSystem;

public class Schedule {
	String scheduleId;
    String course;
    String day;
    String time;

    public Schedule(String scheduleId,String course, String day, String time) {
        this.scheduleId=scheduleId;
        this.course = course;
        this.day = day;
        this.time = time;
    }
    

    public String getScheduleId() {
        return scheduleId;
    }


    public void setScheduleId(String scheduleId) {
        this.scheduleId = scheduleId;
    }


    public String getCourse() {
        return course;
    }


    public void setCourse(String course) {
        this.course = course;
    }


    public String getDay() {
        return day;
    }


    public void setDay(String day) {
        this.day = day;
    }


    public String getTime() {
        return time;
    }


    public void setTime(String time) {
        this.time = time;
    }


    public void display() {
        System.out.println("Schedule_id:"+scheduleId);
        System.out.println("course:"+course);
        System.out.println("Day: " + day);
        System.out.println("Time: " + time);
    }



}
