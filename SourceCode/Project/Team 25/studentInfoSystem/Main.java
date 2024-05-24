package studentInfoSystem;
import java.util.Scanner;
import java.io.*;
import java.lang.*;
public class Main {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		//department
		
		System.out.println("Enter department id");
		String id=sc.nextLine();
		System.out.println("Enter department name");
		String name=sc.nextLine();
		System.out.println("Enter name of the HOD");
		String hName=sc.nextLine();
		Department d=new Department(id,name,hName);
		d.display();
		//course
		 System.out.println("Enter course ID:");
	     String courseId = sc.nextLine();
         System.out.println("Enter course name:");
	     String courseName = sc.nextLine();
         System.out.println("Enter credits:");
	     int credits = sc.nextInt();
	     sc.nextLine();
         Course c= new Course(courseId, courseName, credits);
	     c.display();
	     //student
	     System.out.println("Enter student ID:");
	     String studentId = sc.nextLine();
         System.out.println("Enter student name:");
	     String studentName = sc.nextLine();
         System.out.println("Enter student contact:");
	     String studentContact = sc.nextLine();
         System.out.println("Enter department ID:");
	     String departmentId = sc.nextLine();
	     Student s = new Student(studentId, studentName, studentContact, departmentId);
	     s.display();
	     //faculty
	     System.out.println("Enter faculty ID:");
	     String facultyId = sc.nextLine();
         System.out.println("Enter faculty name:");
	     String facultyName = sc.nextLine();
         System.out.println("Enter faculty contact:");
	     String facultyContact = sc.nextLine();
         System.out.println("Enter department ID:");
	     String departmentIdd = sc.nextLine();
         Faculty f = new Faculty(facultyId, facultyName, facultyContact, departmentIdd);
	     f.display();
	     //enrollment
	     System.out.println("Enter student ID:");
	     int student_id = sc.nextInt();
         System.out.println("Enter enrollment ID:");
	     int enrollment_id = sc.nextInt();
	     sc.nextLine();
         System.out.println("Enter course ID:");
	     String course_id = sc.nextLine();
         Enrollment enrollment = new Enrollment(student_id, course_id, enrollment_id);
	     enrollment.display();
	     //fee
	     System.out.println("Enter student ID:");
	     String students_id = sc.nextLine();
         System.out.println("Enter amount:");
	     double amount = sc.nextDouble();
	     sc.nextLine();
         System.out.println("Enter fee ID:");
	     String fee_id = sc.nextLine();
         Fee fee = new Fee(students_id, amount, fee_id);
	     fee.display();
	     //schedule
	     System.out.println("Enter schedule ID:");
	     String sid=sc.nextLine();
	     String ca=courseName;
	     System.out.println("Enter day:");
	     String day=sc.nextLine();
	     System.out.println("Enter time:");
	     String time=sc.nextLine();
	     Schedule sch=new Schedule(sid,ca,day,time);
	     sch.display();
	     //attendance
	     System.out.println("Enter attendance id:");
	     int att_id=sc.nextInt();
	     sc.nextLine();
	     String ssid=studentId;
	     String cid=courseId;
	     System.out.println("Enter date:");
	     String date=sc.nextLine();
	     System.out.println("Enter status:");
	     String status=sc.nextLine();
	     Attendance atten=new Attendance(att_id,ssid,cid,date,status);
	     atten.display();
	     //grade
	     String stu_id=studentId;
	     System.out.println("Enter grade id:");
	     int gid=sc.nextInt();
	     sc.nextLine();
	     String cou_id=courseId;
	     System.out.println("Enter score:");
	     String score=sc.nextLine();
	     Grade g=new Grade(stu_id,gid,cou_id,score);
	     g.display();
	     //transcript
	     String stud_id=studentId;
	     String cour_id=courseId;
	     int gra_id=gid;
	     System.out.println("Enter transcript id:");
	     int trans_id=sc.nextInt();
	     Transcription transcrpt=new Transcription(stud_id,cour_id,trans_id,gra_id);
	     transcrpt.display();
	     
	     
	     
	     
	     
		
		 
	}

}
