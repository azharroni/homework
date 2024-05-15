package hw4Constuctor;

public class StudentTest {

	public static void main(String[] args) {
	Student student = new Student();
	System.out.println("---STUDENT ID---");
	Student roni =new Student("Roni",124,'m',5.11f,true);
	Student nipa =new Student("nipa",106,'f',5.06f,false);
	Student manna =new Student("manna",99,'m',6.02f,false);
	Student koli =new Student("koli",34,'f',4.11f,true);
	Student rana =new Student("rana",111,'m',5.09f,false);

	}
}
