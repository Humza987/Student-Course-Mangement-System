package student_management;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Student {
	String firstname;
	String lastname;
	String fullname;
	private int tuition;
	private Scanner scanner = new Scanner(System.in);
	private boolean Proceed2;
//	public int choice1;
	private ArrayList<String> CoursesEnrolled;
	private ArrayList<String> CoursesOffered;
	private ArrayList<String> CorusesDropped;

	private String choice2;
	private int noc;
	private boolean nextStep;
	private boolean Proceed;
	String[] name = new String[5];
	public boolean Switch = false;


	public Student() {
		this.CoursesEnrolled = new ArrayList<String>();
		this.CoursesOffered = new ArrayList<String>(Arrays.asList("Physics 101", "Engineering 101", "Comp Sci 101", "Calculus 101" ));
		this.CorusesDropped = new ArrayList<String>(Arrays.asList("Drop Physics 101", " Drop Engineering 101", " Drop Comp Sci 101", "Drop Calculus 101" ));
		this.Proceed = false;
		this.Proceed2 = false;
	}

	public void StudentSetup() {
		Switch = false;
		System.out.println("First Name of Student: ");
		this.firstname = scanner.next();
		
		System.out.println("Last Name of Student: ");
		this.lastname = scanner.next();
		this.fullname = firstname+" "+lastname;
		
		System.out.println("Name: " + fullname);
		menu();
	}
	


	public String StudentEmail() {
	//	return String.format("%s.%s@student.edu", firstname, lastname);
		String s = this.firstname+"."+this.lastname+"@student.edu";
		return s;
	}

	public void menu() {
		
		System.out.println("What do you want to do?");
		System.out.println(" 1-Manage Courses \n 2-Check Tuition \n 3-Print Transcript to file");
		Proceed2=false;
		while(!Proceed2) {
			try {
				int choice1 = scanner.nextInt();
				scanner.nextLine();
				if(choice1 == 1) {
					Proceed2 = true;
					enrol();
				}
				if(choice1 == 2) {
					Proceed2 = true;
					tuition();
				}
				if(choice1 == 3) {
					Proceed2 = true;

					System.out.println(toString());
					menu();
				}
				if(choice1 == 4) {
						Switch = true;
						Proceed2 = true;

				//	StudentSetup();
					}
				else {
					System.out.println("Wrong Input! Try Again");
				}
			}
			catch(Exception e) {
					System.out.println("Wrong Input! Try Again");
					scanner.nextLine();
					Proceed2=false;
			}
		}
	}

	public void tuition() {
		this.tuition = noc*800;
		System.out.println("Your tuition is $"+tuition);
		menu();
	}


	public void enrol() {
		System.out.println("Courses Offered:\n Physics 101 \n Engineering 101\n Comp Sci 101 \n Calculus 101\n ($800 for to enrol for each course)");
		System.out.println("Courses Enrolled in: "+CoursesEnrolled+"");
		System.out.println("");		
			Proceed = true;
			System.out.println("Press quit to exit");
			this.choice2 = scanner.nextLine();
		while(Proceed) {
			this.nextStep = false;
		
				if(CorusesDropped.contains(choice2)) {
					CoursesEnrolled.remove(choice2.substring(5));
					nextStep = true;
					noc--;
				}
			
				else if(CoursesOffered.contains(choice2) &&  !CoursesEnrolled.contains(choice2)) {
					CoursesEnrolled.add(choice2);
					nextStep = true;
					noc++;
				}
						
				else if(choice2.equals("quit")) {
					System.exit(0);
				}
				else {
					nextStep=true;
				}

			if(nextStep) {
				System.out.println("Courses Enrolled in:");

			}
			if(nextStep) {
				for(String a: CoursesEnrolled) 	System.out.println(String.format("%s ", a));
				Proceed = false;
			}

		}
			menu();
	}
	public String toString() {
		String s;
		s = "Name: "+fullname+"\nCourses Enrolled: ";
		s+= ""+CoursesEnrolled;
		s+= "\nTuition amount: "+noc*800;
		s+= "\nStudent Email: "+StudentEmail();
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

//public void hasBeen() {
//System.out.println("This user has been previously logged in (all info saved)");
//while(true) {
//}
//}
