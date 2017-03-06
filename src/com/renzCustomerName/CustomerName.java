package com.renzCustomerName;
/*
 * This program will ask the user for names and write it on a file
 * Jayson Mallari
 */
import java.util.Scanner;
import java.io.*;

public class CustomerName {
	
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		File inputName = new File("customers.txt");
		String name;
		System.out.println("Enter the 1st custome's name: ");
		name = in.nextLine();
		
		try{
			PrintWriter inName = new PrintWriter(inputName);
			
			while(!name.equalsIgnoreCase("done")){
				
				inName.println(name);
				System.out.println("Enter another name or type \"done\" to exit.");
				name = in.nextLine();
			}
			inName.close();
		}
		catch(Exception e){
			System.out.println("Error encountered : "+ e.toString());
		}
	}

}
