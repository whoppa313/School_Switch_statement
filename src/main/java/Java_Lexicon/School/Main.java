package Java_Lexicon.School;

import java.util.ArrayList;
import java.util.Scanner;

public class Main 
{

	
	private static Scanner scan = new Scanner(System.in);
	private static Svenska svenska = new Svenska();
	private static Tyska tyska = new Tyska();
	private static Spanska spanska = new Spanska();
	
	public static void main(String[]args)
	{
		
		boolean quit = false;
		int Choice = 0;
		
		
		generalInstructions();
		while (!quit)
		{
			
			
			
			Choice = scan.nextInt();
			scan.nextLine();
			
			
			switch (Choice) {
			
			case 1:
				generalInstructions();
				break;
			
			
			
			
			
			
			
			
			case 2:
				
				
				
				System.out.println("\n Välj: " + "\n 1 för Spanska" + "\n 2 för Svenska" + "\n 3 för Tyska");
				int väljcurs = 0;
				väljcurs = scan.nextInt();
				scan.nextLine();
				
				switch (väljcurs)
				{
				
				// case ska hantera listan för spanska kursen
				case 1:
					ClassInstructions();
					boolean spklar = false;
					while(!spklar) 
					{
						
						
					System.out.println("\n Spanska");
					int spchoice = 0;
					spchoice = scan.nextInt();
					scan.nextLine();
					
					switch (spchoice) 
					{
					
					case 1:
						ClassInstructions();
						break;
					case 2:
						spanska.printClassSpanska();
						break;
					case 3:
						addStudentSpanska();
						break;
					case 4:
						modifyStudentSpanska();
						break;
					case 5:
						removeStudentSpanska();
						break;
					case 6:
						searchForStudentSpanska();
						break;
					case 0:
						generalInstructions();
						spklar = true;
						break;
					}
					
					}
					break;
					
					
					
					
					
					
					
					
					
				//------------------------------------------------------------	
				// case 2 ska hantera listan för Svenska kursen	
				case 2:
					ClassInstructions();
					boolean svklar = false;
					while (!svklar) {
					System.out.println("\n Svenska");
					int svChoice = 0;
					svChoice = scan.nextInt();
					scan.nextLine();
					
					switch(svChoice) 
					
					{
					
					case 1:
						ClassInstructions();
						break;
					case 2:
						svenska.printClassSvenska();
						break;
					case 3:
						addStudentSvenska();
						break;
					case 4:
						modifyStudentSvenska();
						break;
					case 5:
						removeStudentSvenska();
						break;
					case 6:
						searchForStudentSvenska();
						break;
					case 0:
						generalInstructions();
						svklar = true;
						break;
				
						
					}
					}
					
					break;
					
					
					
					
					
					
					
					
					
				//----------------------------------------------------------	
				// case 3 ska hantera listan för tyska kursen	
				case 3:
					
					ClassInstructions();
					boolean tyklar = false;
					while(!tyklar)
					{
						
					System.out.println("\n Tyska");
					int tychoice = 0;
					tychoice = scan.nextInt();
					scan.nextLine();
					
					switch(tychoice)
					{
					
					case 1:
						ClassInstructions();
						break;
					case 2:
						tyska.printClassTyska();
						break;
					case 3:
						addStudentTyska();
						break;
					case 4:
						modifyStudentTyska();
						break;
					case 5:
						removeStudentTyska();
						break;
					case 6:
						searchForStudentTyska();
						break;
					case 0:
						generalInstructions();
						tyklar = true;
						break;
					
					
					
					}
					
					
					
					
					
					
					
					
					
					
					}
					break;
					
					
					
					
				
				}
				
				break;
				
			
				
			
			
			case 3:
				System.out.println("========================================================= \n" + "Still under development please try something else \n" + "========================================================= ");
				System.out.println("\n Välj: " + "\n 1 för Spanska" + "\n 2 för Svenska" + "\n 3 för Tyska");
				break;
			case 4:
				System.out.println(" this program can add Students to a class and see how many students there is in a class");
				
				System.out.println(" but it can not see which classes a student is taking");
				break;
				
			
			
			case 0:
				quit = true;
				break;
			
				}
			}
		}
	
	
	
	public static void generalInstructions()
	{
		System.out.println("\n Press ");
		System.out.println("\n 1 - To view the General Instructions");
		System.out.println("\n 2 - To chose a Class and view it's options");
		System.out.println("\n 3 - To view the list of studens and view its options");
		System.out.println("\n 4 - To see what this program can do");
		System.out.println("\n 0 - To exit the program");
	}
	
	
	//------------------ Svenska ----------------------
	
	public static void ClassInstructions()
	{
		System.out.println("\n Press ");
		System.out.println("\n 1 - To view the General Instructions");
		System.out.println("\n 2 - To print a list of the students in this Class");
		System.out.println("\n 3 - To add a student to this class");
		System.out.println("\n 4 - To modify the info of a Student");
		System.out.println("\n 5 - To remove a Student from the Class");
		System.out.println("\n 6 - to search for a student in this Class");
		System.out.println("\n 0 - To exit the program");
	}
	
	public static void addStudentSvenska()
	{
		System.out.println("Please enter the Student's Full name: ");
		svenska.addStudentSvenska(scan.nextLine());
	}
	
	
	public static void modifyStudentSvenska()
	{
		System.out.println("Students Current info: ");
		String StudentNo = scan.nextLine();
		System.out.println("Enter new Info: ");
		String newStudent = scan.nextLine();
		svenska.modifyStudentSvenska(StudentNo, newStudent);
	}
	
	
	public static void removeStudentSvenska()
	{
		System.out.println("Enter the data of the student you want to remove: ");
		String StudentNo = scan.nextLine();
		svenska.removeStudentSvenska(StudentNo);
	}
	
	
	public static void searchForStudentSvenska()
	{
		System.out.println("(full info please) Student to search for: ");
		String StudentNo = scan.nextLine();
		if(svenska.inClassSvenska(StudentNo)) {
			System.out.println("Found student: " + StudentNo);
		}
		else
		{
			System.out.println("Could not find any student with that info: " + StudentNo);
		}
	}
	
	
	
	
	//------------------ Svenska ----------------------
	
	//=================================================
	
	//------------------ Tyska ----------------------
	
	public static void addStudentTyska()
	{
		System.out.println("Please enter the Student's Full name: ");
		tyska.addStudenTyska(scan.nextLine());
	}
	
	
	public static void modifyStudentTyska()
	{
		System.out.println("Students Current info: ");
		String StudentNo = scan.nextLine();
		System.out.println("Enter new Info: ");
		String newStudent = scan.nextLine();
		tyska.modifyStudentTyska(StudentNo, newStudent);
	}
	
	
	public static void removeStudentTyska()
	{
		System.out.println("Enter the data of the student you want to remove: ");
		String StudentNo = scan.nextLine();
		tyska.removeStudentTyska(StudentNo);
	}
	
	
	public static void searchForStudentTyska()
	{
		System.out.println("(full info please) Student to search for: ");
		String StudentNo = scan.nextLine();
		if(tyska.inClassTyska(StudentNo)) {
			System.out.println("Found student: " + StudentNo);
		}
		else
		{
			System.out.println("Could not find any student with that info: " + StudentNo);
		}
	}
	
	
	public static void processClassTyska()
	{
		
	}
	//------------------ Tyska ----------------------
	
	//=================================================
	
	//------------------ Spanska ----------------------
	
	
	public static void addStudentSpanska()
	{
		System.out.println("Please enter the Student's Full name: ");
		spanska.addStudentSpanska(scan.nextLine());
	}
	
	
	public static void modifyStudentSpanska()
	{
		System.out.println("Students Current info: ");
		String StudentNo = scan.nextLine();
		System.out.println("Enter new Info: ");
		String newStudent = scan.nextLine();
		spanska.modifyStudentSpanska(StudentNo, newStudent);
	}
	
	
	public static void removeStudentSpanska()
	{
		System.out.println("Enter the data of the student you want to remove: ");
		String StudentNo = scan.nextLine();
		spanska.removeStudentSpanska(StudentNo);
	}
	
	
	public static void searchForStudentSpanska()
	{
		System.out.println("(full info please) Student to search for: ");
		String StudentNo = scan.nextLine();
		if(spanska.inClassSpanska(StudentNo)) {
			System.out.println("Found student: " + StudentNo);
		}
		else
		{
			System.out.println("Could not find any student with that info: " + StudentNo);
		}
	}
	
	
	public static void processClassSpanska()
	{
		
	}
	
	
	//------------------ Spanska ----------------------
	
	
	
	}

			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

