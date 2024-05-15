package hw2JavaVariablesInitialized;


public class AboutMe {

	
	
//	variable declared
	public String schoolName;
	
//	variable initialized
	public String myName = "Roni";
	
	public int myAge = 23;
	
	public float myHeight = 5.11f;
	
	public char myGander = 'm';
	
	public boolean usCitizen = false;
	
	
	public AboutMe() {
//	Constructor body
	System.out.println("------------ This is all about Myself ------------");
	
	}
	public void aboutMe() {
		System.out.println("My Name is:"+ myName  + " My Age:"+  myAge +  " My Height:" +  myHeight +  " My Gander:" +  myGander  +  " US citizen:" + usCitizen);
	}
	public static void main(String[] args) {
		
		
	AboutMe roni = new AboutMe();
	roni.aboutMe();
		}

	}
	