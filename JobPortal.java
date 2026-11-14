package com.projects;

import java.util.Scanner;

public class JobPortal {
	static 	Scanner sc = new Scanner(System.in);
	static String name;
	static int age;
	static String gender;
static	void welcomeMessage(){ 

	System.out.println("=================================");
	System.out.println("         RVR TECHNOLOGIES        ");
	System.out.println("      JOB RECRUITMENT PORTAL     ");
	System.out.println("=================================");
}

static void details() {
	System.out.println("Welcome to RVR TECHNOLOGIES! Please Provide Details ");
	System.out.println("Enter your Name : ");
	 name = sc.nextLine();
	System.out.println("Enter your Age : ");
	 age = sc.nextInt();
	System.out.println("Enter you Gender :");
	 gender = sc.next();
}

static void qualification () {
	System.out.println("Have You Completed Your Graduation ? ");
	System.out.println("Enter '1' if YES");
	System.out.println("Enter '2' if NO");	

	int Graduation = sc.nextInt();
	if(Graduation == 1) {
		System.out.println("Is your graduation percentage is above 60% ?");
		System.out.println("if Yes Enter 'true' ");
		System.out.println("if No Enter 'false' ");
	 boolean percentage = sc.nextBoolean();
	 if (percentage) {
		 System.out.println("How much experience do you have ?");
		 experience();
	 }else {
		 System.out.println("Sorry your  percentage is low you are not eligible for this job ");
	 }
		
	}
	else if (Graduation == 2) {

	    System.out.println("Sorry! Graduation is required.");

	}
	else {
		System.out.println("please enter a correct option  ");
	}

}

static void experience() {
	System.out.println("enter '1' if fresher");
	System.out.println("enter '2' if 1-2 yrs experience");
	System.out.println("enter '3' if 3-4 yrs experience");
	System.out.println("enter '4' if 5 or above 5 yrs experience");
	int exp = sc.nextInt();
	if (exp == 1 || exp == 2 || exp == 3|| exp == 4) {
		System.out.println(" Ok which programming language do you know ?");
		skills();
		
	}else {
		System.out.println("Enter valid experience!!");
	}
}
static void skills() {
	System.out.println("1. Java");
	System.out.println("2. C");
	System.out.println("3. Python");
	System.out.println("4. JavaScript");
	System.out.println("5. others");
	int language = sc.nextInt();

	if (language == 1 || language == 2 ||language == 3||language ==4 ) {

		System.out.println(" Do you have Knowledge of oop's concepts ?  ");
		System.out.println("if Yes Enter 'true' ");
		System.out.println("if No Enter 'false' ");
	    boolean skill1 = sc.nextBoolean();
	   
	    if (skill1) {
	    	System.out.println("Do you know about Sql ?");
	    	System.out.println("if Yes Enter 'true' ");
			System.out.println("if No Enter 'false' ");
			boolean skill2 = sc.nextBoolean();
			
			if (skill2) {
				System.out.println("Have you worked on any Java project ?");
		    	System.out.println("if Yes Enter 'true' ");
				System.out.println("if No Enter 'false' ");
				boolean skill3 = sc.nextBoolean();
				if (!skill3) {
					System.out.println("sorry you re not eligible for this job");
				}else {
					salaryCheck();
					
				}
				
			}else {
				System.out.println("sorry you are not eligible");

			}
	    	
	}else  {
		System.out.println("sorry you are not eligible");
	}
	
    }
		 
}
static void salaryCheck() {

	
	System.out.println("Nice whats your expected annual salary(in Rs) ");
	double expsal = sc.nextDouble();
	if(expsal <= 600000.00) {
		locationShift();
	}else {
		System.out.println("sorry our company budget is 600000.00 only if you Ok with it Enter 'Yes' ?");
		String ok = sc.next();
		if (ok.equalsIgnoreCase("yes")) {
			locationShift();
		}else {
			System.out.println("sorry you may leave now thank you!! ");
		}
	}
	}

static void locationShift() {
	System.out.println("Are you willing to relocate to hyderabad ? ");
	System.out.println("Enter '1' if yes");
	System.out.println("Enter '2' if no");
	int locshift = sc.nextInt();
	if(locshift == 1){
		joiningAvailabilty();
	}else {
		System.out.println("sorry!! you may leave now");
	}

}

static void joiningAvailabilty(){
	System.out.println("When can you join ? ");
	System.out.println("1. immediately ");
	System.out.println("2. within 15 days ");
	System.out.println("3. within 30 days ");
	System.out.println("4. more than 30 days ");
	int joining= sc.nextInt();
	if(joining >0 && joining <= 3 ) {
		System.out.println("=================================");
		System.out.println("         RVR TECHNOLOGIES        ");
		System.out.println("      JOB RECRUITMENT PORTAL     ");
		System.out.println("=================================");	
		System.out.println();
		System.out.println("congratulations "+ name+"!" );
		System.out.println();
		System.out.println("your profile has successfully");
		System.out.println("passed the intial HR screening");
		System.out.println();
		System.out.println("Position       : Java Developer");
        System.out.println("Application    : Shortlisted");
        System.out.println("Interview Date : To be announced");
        System.out.println();
        System.out.println("Our HR team will contact you soon");
        System.out.println();
        System.out.println("Thank you for applying!");
        System.out.println("=================================");
        

		}else {
			System.out.println("=================================");
			System.out.println("         RVR TECHNOLOGIES        ");
			System.out.println("      JOB RECRUITMENT PORTAL     ");
			System.out.println("=================================");	
			System.out.println();
			System.out.println("sorry "+ name+"!" );
			System.out.println();
			System.out.println("Unfortunately, your profile");
			System.out.println("does not meet our current");
			System.out.println("job requirements");
			System.out.println();
	        System.out.println("Application Status : Not Shortlisted");
	        System.out.println();
	        System.out.println();
	        System.out.println("Thank you for your intreset");
	        System.out.println();
	        System.out.println("Better luck next time!");
	        System.out.println("=================================");	}
}

	
	public static void main(String[] args) {
		welcomeMessage();
		details();
		qualification();
	}

}
