package student_management;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {
	String firstname;
	String lastname;
	String fullname;
	private int tuition;
	private Scanner scanner = new Scanner(System.in);
	private boolean error;
	public int choice1;
	private ArrayList<String> CoursesEnrolled;
	private String choice2;
	private int noc;
	private boolean nextStep;
	private boolean Proceed;
	String[] name = new String[5];
	private int non;


	public Student() {
		this.CoursesEnrolled = new ArrayList<String>();
		this.Proceed = true;
	}

	public void StudentSetup() {
		System.out.println("First Name of Student: ");
		this.firstname = scanner.nextLine();
		
		System.out.println("Last Name of Student: ");
		this.lastname = scanner.nextLine();
		this.fullname = firstname+" "+lastname;
		
		System.out.println("Name: " + fullname);
		menu();
	}
	
	public void hasBeen() {
		System.out.println("This user has been previously logged in (all info saved)");
		while(true) {
		}
	}

	public String StudentEmail() {
		return String.format("%s.%s@student.edu", firstname, lastname);
	}

	public void menu() {
		
		System.out.println("What do you want to do?");
		System.out.println(" 1-Manage Courses \n 2-Check Tuition \n 3-Print Transcript to file");
		this.choice1 = scanner.nextInt();
		if(choice1 == 1) {
			enrol();
		}
		if(choice1 == 2) {
			tuition();
		}
		if(choice1 == 3) {
			System.out.println(toString());
			menu();
		}
		if(choice1 == 4) {
			StudentSetup();
		}
	}

	public void tuition() {
		this.tuition = noc*800;
		System.out.println("Your tuition is $"+tuition);
		menu();
	}


	public void enrol() {
		System.out.println("Courses Offered:\n Physics 101 \n Engineering 101\n Computer Science 101 \n Calculus 101\n ($800 for to enrol for each course)");
		System.out.println("Courses Enrolled in: "+CoursesEnrolled+"");
		System.out.println("");
		this.choice2 = scanner.nextLine();
		Proceed = true;
		while(Proceed) {
			System.out.println("Press quit to exit");
			this.nextStep = false;
			if(choice2.equals("quit")) {
				Proceed = false;
				break;
			}
			if(choice2.equals("Physics 101") && !CoursesEnrolled.toString().contains(choice2)) {
				CoursesEnrolled.add(choice2);
				nextStep = true;
				noc++;
			}
			else if(choice2.equals("Drop Physics 101") && CoursesEnrolled.toString().contains("Physics 101")) {
				CoursesEnrolled.remove("Physics 101");
				nextStep = true;
				noc--;
			}
			if(choice2.equals("Engineering 101") && !CoursesEnrolled.toString().contains(choice2)) {
				CoursesEnrolled.add(choice2);
				nextStep = true;
				noc++;
			}
			else if(choice2.equals("Drop Engineering 101") && CoursesEnrolled.toString().contains("Engineering 101")) {
				CoursesEnrolled.remove("Engineering 101");
				nextStep = true;
				noc--;
			}
			if(choice2.equals("Computer Science 101") && !CoursesEnrolled.toString().contains(choice2)) {
				CoursesEnrolled.add(choice2);
				nextStep = true;
				noc++;
			}
			else if(choice2.equals("Drop Computer Science 101") && CoursesEnrolled.toString().contains("Computer Science 101")) {
				CoursesEnrolled.remove("Computer Science 101");
				nextStep = true;
				noc--;
			}
			if(choice2.equals("Calculus 101") && !CoursesEnrolled.toString().contains(choice2)) {
				CoursesEnrolled.add(choice2);
				nextStep = true;
				noc++;
			}
			else if(choice2.equals("Drop Calculus 101") && CoursesEnrolled.toString().contains("Calculus 101")) {
				CoursesEnrolled.remove("Calculus 101");
				nextStep = true;
				noc--;
			}

			if(nextStep) {
				System.out.println("Courses Enrolled in:");
			}
			if(nextStep) {
				for(String a: CoursesEnrolled) 	System.out.println(String.format("%s ", a));
			}

			this.choice2 = scanner.nextLine();
		}
		menu();
	}
	public String toString() {
		String s;
		s = "Name: "+fullname+"\nCourses Enrolled: ";
		s+= ""+CoursesEnrolled;
		s+= "\nTuition amount: "+noc*800;
		s+= "\n Student Email: "+StudentEmail();
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
			writer.write(s);
			writer.close();
		}
		catch(Exception e) { 
			e.printStackTrace();
		}

		return s;
	}
}

//System.out.println("Enter Year of Study (Number only) \n 1-Freshman \n 2-Sophmore\n 3-Junior\n 4-Senior");
//do {
//	error = false;
//	try {
//		this.yearOfStudy=scanner.nextInt();
//	}
//	catch(InputMismatchException e) {
//		System.out.println("Wrong Input! Try again");
//		error = true;
//		scanner.next();
//	}
//} while(error);
