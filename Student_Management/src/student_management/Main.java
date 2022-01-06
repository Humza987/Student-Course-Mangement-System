package student_management;
public class Main {
// The Manager can intialize student information with the sysem,
// and add nessecary details, they should add grades if needed, performance details
	// be able to print a transcript to a file,
	public static void main(String[] args) {
		Student[] students = new Student[5];
		String[] name = new String[5];
	
		for(int i=0;i<5;i++) {
		students[i] = new Student();
		
	
		
		students[i].StudentSetup();
		for(int j=0; j<i;j++) {
			if(name[j].equals(students[j].firstname)) {
				students[i].hasBeen();
			}
			else {
				name[i] = students[i].firstname;
			}
		}
		if(students[i].choice1==1) {
			students[i].enrol();
		}
		if(students[i].choice1==2) {
			students[i].tuition();
		}
		if(students[i].choice1==5) {
			students[i].StudentSetup();
		}
		}
	}
	
//	for(String n: name) {
//	if(n!=null && n.equals(this.firstname)) {
//		hasBeen();
//	}
//	else {
//		name[non] = this.firstname;
//		non++;
//	}
//
//}

}
