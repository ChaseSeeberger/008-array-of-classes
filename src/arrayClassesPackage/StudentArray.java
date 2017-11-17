package arrayClassesPackage;

public class StudentArray {
	Student[] myStudents = new Student[3];

	public void buildArray() {
		myStudents[0] = new Student();
		myStudents[0].setFname("Tyler");
		myStudents[0].setLname("Smith");
		myStudents[0].setYearInSchool(11);		
		myStudents[1] = new Student();
		myStudents[1].setFname("David");
		myStudents[1].setLname("Bridgeman");
		myStudents[1].setYearInSchool(11);	
		myStudents[2] = new Student();
		myStudents[2].setFname("Jake");
		myStudents[2].setLname("Moody");
		myStudents[2].setYearInSchool(12);	
		showArray();
	}
	public void showArray() {
		for (int i=0; i < myStudents.length; i++) {
			System.out.println(myStudents[i].getFname() + " " + myStudents[i].getLname() + " " + myStudents[i].getYearInSchool());
		}
		
	}
	
}
