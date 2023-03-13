package in.teja.controller;

import java.util.Scanner;

public class BankingApp
{
	
		public void verification()
		{
			Scanner sc= new Scanner(System.in);
			System.out.println("          WELCOME TO TEJA BANK @PVT.ltd        ");
			System.out.println("please enter customerid : ");
			String customerid=sc.next();
			String verifiedid="Teja_147";
			System.out.println("please enter password : ");
			String password=sc.next();
			String verifiedpass="134123";
			
			
			
			
			if((customerid.equals(verifiedid)) && (password.equals(verifiedpass)))
			{
				Operations obj1=new Operations();
				obj1.Basicdetails();
				BankAccount obj2 = new BankAccount();
				obj2.showMenu();
				
		    }
			else
			{
				System.out.println("Login Failed");
			}
			
			
			
			
			
					
		}
	
}