package hw3JavaVariablesDeclared;


public class AboutMe {

	
	
//	variable declared
	public String schoolName;
	
//	variable initialized
	public String myName = "Roni";
	public int myAge = 23;
	public float myHeight = 5.11f;
	public byte myCar = 123;
	public short myMonthlySalary = 29000;
	public long myHousePrice = 6478902800l;
	public double myGrade =5.637762;
	public char myGander = 'm';
	public boolean usCitizen = false;
	
	
	public AboutMe() {
//	Constructor body
	System.out.println("------------ This is all about Myself ------------");
	
	}
	public void aboutMe() {
	System.out.println("\nMy Name is:"+ myName  + "\n My Age:"+  myAge +  "\n My Height:" +  myHeight +
	 "\n My Gander:" +  myGander  +  "\n US citizen:" + usCitizen + "\n My Car:" + myCar + 
	"\n My Monthly Salary:" + myMonthlySalary + " \n My House Price:" + myHousePrice + "\n My Grade:" + myGrade );
	}
	public static void main(String[] args) {
		
		
	AboutMe roni = new AboutMe();
	roni.aboutMe();
		}

	}
	