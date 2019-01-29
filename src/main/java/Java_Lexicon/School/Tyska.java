package Java_Lexicon.School;

import java.util.ArrayList;

public class Tyska 
{
	

		
		private ArrayList<String> tyska = new ArrayList<String>();
		
		public void addStudenTyska(String student)
		{
			tyska.add(student);
		}
		
		public ArrayList<String> getClassTyska()
		{
			return tyska;
		}
		
		public void printClassTyska()
		{
			System.out.println("In the Tyska Class there are a total of: " + tyska.size() + " students");
			for(int i=0; i<tyska.size(); i++)
			{
				System.out.println((i+1) + ". " + tyska.get(i)) ;
			}
		}
		
		public void modifyStudentTyska(String currentStudent, String newStudent)
		{
			int position = findStudentTyska(currentStudent);
			if (position >= 0)
			{
				modifyStudentTyska(position, newStudent);
			}
		}
		
		
		private void modifyStudentTyska(int position, String newStudent)
		{
			tyska.set(position, newStudent);
			System.out.println("Student " + (position + 1) + " has been modified.");
		}
		
		public void removeStudentTyska(String position)
		{
			tyska.remove(position);
		}
		
		public int findStudentTyska(String searchStudent)
		{
			return tyska.indexOf(searchStudent);
		}
		
		public boolean inClassTyska(String searchStudent)
		{
			int position = findStudentTyska(searchStudent);
			if(position >= 0)
			{
				return true;
			}
			return false;
		}
		

	}


