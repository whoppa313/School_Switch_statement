package Java_Lexicon.School;

import java.util.ArrayList;

public class Svenska {
	
	private ArrayList<String> svenska = new ArrayList<String>();
	
	public void addStudentSvenska(String student)
	{
		svenska.add(student);
	}
	
	public ArrayList<String> getClassSvenska()
	{
		return svenska;
	}
	
	public void printClassSvenska()
	{
		System.out.println("In the Svenska Class there are a total of: " + svenska.size() + " students");
		for(int i=0; i<svenska.size(); i++)
		{
			System.out.println((i+1) + ". " + svenska.get(i)) ;
		}
	}
	
	public void modifyStudentSvenska(String currentStudent, String newStudent)
	{
		int position = findStudentSvenska(currentStudent);
		if (position >= 0)
		{
			modifyStudentSvenska(position, newStudent);
		}
	}
	
	
	private void modifyStudentSvenska(int position, String newStudent)
	{
		svenska.set(position, newStudent);
		System.out.println("Student " + (position + 1) + " has been modified.");
	}
	
	public void removeStudentSvenska(String position)
	{
		svenska.remove(position);
	}
	
	public int findStudentSvenska(String searchStudent)
	{
		return svenska.indexOf(searchStudent);
	}
	
	public boolean inClassSvenska(String searchStudent)
	{
		int position = findStudentSvenska(searchStudent);
		if(position >= 0)
		{
			return true;
		}
		return false;
	}
	

}
