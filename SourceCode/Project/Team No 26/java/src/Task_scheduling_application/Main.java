package Task_scheduling_application;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // user
        System.out.println("Enter the User_id");
        String user_id = sc.nextLine();

        System.out.println("Enter the username");
        String username = sc.nextLine();

        System.out.println("Enter the email");
        String email = sc.nextLine();

        System.out.println("Enter the password");
        String password = sc.nextLine();
        user us = new user(user_id, username, email, password);
        us.displayUser();

        // project
        System.out.println("Enter the project ID");
        String project_id = sc.nextLine();

        System.out.println("Enter the project name");
        String project_name = sc.nextLine();

        System.out.println("Enter the description : ");
        String description = sc.nextLine();


        project pro = new project(project_id, project_name, description);

        pro.Projectdisplay();


        //deadline
        System.out.println("Enter the deadline ID");
        String deadline_id = sc.nextLine();

        System.out.println("Enter the deadline date");
        String date = sc.nextLine();


        DeadLine deadline = new DeadLine(deadline_id, date);
        deadline.Deaddlinedisplay();


        // priority
        System.out.println("Enter the priority ID");
        String priority_id = sc.nextLine();

        System.out.println("Enter the priority level");
        String priority_level = sc.nextLine();


        Priority priority = new Priority(priority_id, priority_level);
        priority.Prioritydisplay();

        // Calender
        System.out.println("Enter the calendar ID");
        String calendar_id = sc.nextLine();

        System.out.println("Enter the date : ");
        String date1 = sc.nextLine();

        System.out.println("Enter the event");
        String event = sc.nextLine();

        System.out.println("Enter the user ID");
        String user_id_copy = user_id;

        Calender calendarEvent = new Calender(calendar_id, date1, event, user_id_copy);
        calendarEvent.Calenderdisplay();


        // report
        System.out.println("Enter the report ID");
        String report_id = sc.nextLine();

        System.out.println("Enter the report name");
        String report_name = sc.nextLine();

        System.out.println("Enter the description");
        String description_r = sc.nextLine();

        String u_id = user_id_copy;

        Report report = new Report(report_id, report_name, description_r, u_id);
        report.Reportdisplay();

        // Notification
        System.out.println("Enter the notification ID");
        String notification_id = sc.nextLine();

        System.out.println("Enter the notification type");
        String notification_type = sc.nextLine();

        System.out.println("Enter the message");
        String message = sc.nextLine();

        String userid = u_id;

        Notification notification = new Notification(notification_id, notification_type, message, userid);
        notification.Notificationdisplay();

      //   Task
        System.out.println("Enter the task_id");
        String task_id = sc.nextLine();
        System.out.println("Enter the task name");
        String task_name = sc.nextLine();
        System.out.println("Enter the task description");
        String description_t = sc.nextLine();

        String deadline_id_copy = deadline_id ;

        String priority_id_copy = priority_id;

        String user__id = userid;

        String project_id_copy = project_id;

        Task task = new Task(task_id,task_name,description_t,deadline_id_copy,priority_id_copy,user__id,project_id_copy);
        task.Taskdisplay();

        // subtask
        System.out.println("Enter the subtask ID");
        String subtask_id = sc.nextLine();

        System.out.println("Enter the subtask name");
        String subtask_name = sc.nextLine();

        System.out.println("Enter the description");
        String description_st = sc.nextLine();

        System.out.println("Enter the task ID");
        String task_id_copy = task_id;

        Subtask subtask = new Subtask(subtask_id, subtask_name, description_st, task_id_copy);

        subtask.Subtaskdisplay();

        // Collaboration
        System.out.println("Enter the collaboration ID");
        String collaboration_id = sc.nextLine();

        String task_id_c= task_id_copy;

        String user___id = user__id;

        Collaboration collaboration = new Collaboration(collaboration_id, task_id_c, user___id);

       collaboration.Collaborationdisplay();


















    }
}
