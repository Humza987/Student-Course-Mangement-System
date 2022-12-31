package student_management;
public class Main {
	
// The Manager can initialize student information with the system,
// and add necessary details, they should add grades if needed, performance details
// be able to print a transcript to a file,
	
	
public static void main(String[] args) {
		Student[] students = new Student[5];
		

		for(int i=0; i<students.length; i++) {
			students[i] = new Student();
	
				while(!students[i].Switch) {
					students[i].StudentSetup();
				}
			
		}
	}
}



//for(String n: name) {
//if(n!=null && n.equals(this.firstname)) {
//	hasBeen();
//}
//else {
//	name[non] = this.firstname;
//	non++;
//}
//
//}

//if(students[i].choice1==1) {
//students[i].enrol();
//}
//if(students[i].choice1==2) {
//students[i].tuition();
//}
//if(students[i].choice1==5) {
//students[i].StudentSetup();
//}
//String[] name = new String[5];

//for(int i=0;i<5;i++) {
//students[i] = new Student();
//students[i].StudentSetup();
//
//}

//
//if(choice2.equals("Physics 101") && !CoursesEnrolled.toString().contains(choice2)) {
//	CoursesEnrolled.add(choice2);
//	nextStep = true;
//	noc++;
//}
//else if(choice2.equals("Drop Physics 101") && CoursesEnrolled.toString().contains("Physics 101")) {
//	CoursesEnrolled.remove("Physics 101");
//	nextStep = true;
//	noc--;
//}
//if(choice2.equals("Engineering 101") && !CoursesEnrolled.toString().contains(choice2)) {
//	CoursesEnrolled.add(choice2);
//	nextStep = true;
//	noc++;
//}
//else if(choice2.equals("Drop Engineering 101") && CoursesEnrolled.toString().contains("Engineering 101")) {
//	CoursesEnrolled.remove("Engineering 101");
//	nextStep = true;
//	noc--;
//}
//if(choice2.equals("Computer Science 101") && !CoursesEnrolled.toString().contains(choice2)) {
//	CoursesEnrolled.add(choice2);
//	nextStep = true;
//	noc++;
//}
//else if(choice2.equals("Drop Computer Science 101") && CoursesEnrolled.toString().contains("Computer Science 101")) {
//	CoursesEnrolled.remove("Computer Science 101");
//	nextStep = true;
//	noc--;
//}
//if(choice2.equals("Calculus 101") && !CoursesEnrolled.toString().contains(choice2)) {
//	CoursesEnrolled.add(choice2);
//	nextStep = true;
//	noc++;
//}
//else if(choice2.equals("Drop Calculus 101") && CoursesEnrolled.toString().contains("Calculus 101")) {
//	CoursesEnrolled.remove("Calculus 101");
//	nextStep = true;
//	noc--;
//}