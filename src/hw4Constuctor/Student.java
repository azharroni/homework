package hw4Constuctor;

public class Student {

public String studentName;
public int studentId;
public char studentGander;
public float studentHeight;
public boolean fullTimeStudent;

public Student() {
System.out.println("This is all about Student");
}


public Student(String studentName, int studentId, char studentGander, float studentHeight,
		     boolean fullTimeStudent) {
		this.studentName = studentName;
		this.studentId = studentId;
		this.studentGander = studentGander;
		this.studentHeight = studentHeight;
		this.fullTimeStudent = fullTimeStudent;
		System.out.println("My Name:" + studentName + ",My Id:" + studentId + ",My Gander:" + studentGander +
				",My Height:" + studentHeight + ",I Am A Student:" + fullTimeStudent);
	}
}
