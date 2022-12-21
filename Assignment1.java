package com.training;

public class Assignment1 {
	

	
		public static void main(String[] args) {
			String name = "Aaryan" ,newName=" ";
			char ch;
			for(int i=0;i<name.length();i++) 
			{
				ch=name.charAt(i);
				newName = ch+newName;
			}
			System.out.println("Reversed String is "+newName);
		}
		
		

	}


