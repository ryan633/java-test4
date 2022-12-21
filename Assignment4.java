package com.training;
import java.util.Scanner;
public class Assignment4 {


	public static void main(String[] args) {
		
		/*Scanner sc= new Scanner(System.in);
		 * System.out.println("please input 1st number : "); int num1 =sc.nextInt();
		 * 
		 * System.out.println("please input 2nd number : "); int num2 =sc.nextInt();
		 * 
		 * System.out.println("please input 3rd number : "); int num3 =sc.nextInt();
		 */
		sum(1,3,4);
		
		
	}
      static String sum(int num1,int num2,int num3) 
      {
    	  if (num1+num2==num3) 
  		{
    		  System.out.println("True");
  			return "TRUE";
  		
  		}
  		else {
  			return "FALSE";
  		}
      }
}



