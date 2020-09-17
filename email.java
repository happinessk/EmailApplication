package email;

import java.util.Scanner;

public class Email {
	private String firstName; 
	private String lastName; 
	private String department;
	private int mailboxCapacity;
	private String email;
	private String password;
	private int defaultPasswordLength = 20;
	private String alternateEmail; 
	private String company = "google.com";
	
	
	// constructor to receive the first name and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		//System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
		
		//Call method asking for the department return the department
		this.department = setDepartment();
		System.out.println("Department: " + this.department);
		
		//Call method returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is:" + this.password);
		
		//Combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@"  +  department + "." + company;
		//Call method returns email
		//System.out.println("Your email:" + email);
	}
	
	private String setEmail() {
		// TODO Auto-generated method stub
		return null;
	}




	// Ask for the department 
	private String setDepartment() {
		System.out.print("Department Codes\n1 for Biology\n2 for Engineering\n3 for Accounting\n0 for Law\nEnter Department Code:");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if (depChoice == 1) {return "Biology";}
		else if (depChoice == 2) {return "Engineering";}
		else if (depChoice == 3) {return "Accounting";}
		else if (depChoice == 0) {return "Law";}
		else  if (depChoice < 200){return "";}
		else {return " Try again";}
		
		
	}
	
	
	// Generate a random password 
	private String randomPassword(int length) {
		String passwordSet = "Happiness1234!";
		char[] password = new char[length];
		for (int i=0; i<length; i++) {
			int rand = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		
		return new String (password);
	}
	
	// Set the mailbox capacity 
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	
	// Set the alternate email 
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	
	// Change the password
	public void changePassword(String password) {
	this.password = password;
	}
	
	public int getMailboxCapacity (){return mailboxCapacity;}
	public String getAlternateEmail(){return alternateEmail;}
	public String getPassword(){return password;}
	
	public String showInfo() {
		return "\nDisplay Name: " + firstName + "  " + lastName + 
				"\nCompany Email: "  + email + 
				"\nMailbox Capacity: " + mailboxCapacity + "mb" ;
	}


}
