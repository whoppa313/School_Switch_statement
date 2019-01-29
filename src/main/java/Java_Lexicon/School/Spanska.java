package Java_Lexicon.School;

import java.util.ArrayList;

public class Spanska 
{

	
	
	private ArrayList<String> spanska = new ArrayList<String>();
	
	public void addStudentSpanska(String student)
	{
		spanska.add(student);
	}
	
	public ArrayList<String> getClassSpanska()
	{
		return spanska;
	}
	
	public void printClassSpanska()
	{
		System.out.println("In the Spanska Class there are a total of: " + spanska.size() + " students");
		for(int i=0; i<spanska.size(); i++)
		{
			System.out.println((i+1) + ". " + spanska.get(i)) ;
		}
	}
	
	public void modifyStudentSpanska(String currentStudent, String newStudent)
	{
		int position = findStudentSpanska(currentStudent);
		if (position >= 0)
		{
			modifyStudentSpanska(position, newStudent);
		}
	}
	
	
	private void modifyStudentSpanska(int position, String newStudent)
	{
		spanska.set(position, newStudent);
		System.out.println("Student " + (position + 1) + " has been modified.");
	}
	
	public void removeStudentSpanska(String position)
	{
		spanska.remove(position);
	}
	
	public int findStudentSpanska(String searchStudent)
	{
		return spanska.indexOf(searchStudent);
	}
	
	public boolean inClassSpanska(String searchStudent)
	{
		int position = findStudentSpanska(searchStudent);
		if(position >= 0)
		{
			return true;
		}
		return false;
	}
	
	
	
	
	
}
