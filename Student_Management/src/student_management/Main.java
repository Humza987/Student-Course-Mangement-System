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
				
				for(int j=0; j<=i; j++) {
					System.out.println(students[j].fullname);
				}
				students[i].newStudent = false;
				
			Back: {			
				if(students[i].Back) {
					students[i].Back = false;
					for(int k=i-1; k>=0; k--) {
						while(!students[k].Back && !students[k].newStudent) {
							students[k].menu();
						}
						students[k].Back = false;
						students[k].newStudent = false;
						if(students[k].newStudent) {
							break Back;
						}
					}
				}
			}
				System.out.println("Create a New Student");
			
			
		}
	}
}
