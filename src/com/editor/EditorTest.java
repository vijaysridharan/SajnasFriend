package com.editor;

import java.util.Scanner;

public class EditorTest {

	public static void main(String[] args) {
		
		String choice = "";
		Editor editorObj = new Editor("Mary had a little lamb, Little lamb, little lamb!");
		do{
			System.out.println("\nWelcome to My Line Editor \n-------------------------\n-------------------------\n");		
			editorObj.getLineEditor();
			System.out.println("S - Change String \nD - Delete String \nU - Set Upper Case \nC - Count words \nX - To eXit the program\n");
			System.out.print("Please enter your choice : " );			
			Scanner input = new Scanner(System.in);
			
			choice= input.nextLine().toLowerCase();
			
			
			switch(choice){
				case "s" : System.out.print("\nPlease enter a new string :  ");		
						   String text;
				           Scanner scannObj = new Scanner(System.in);		
				           text = scannObj.nextLine();
				           StringBuilder newPhrase = new StringBuilder(text);
				           editorObj.setLineEditor(newPhrase);
				           System.out.println("\nUpdated Line Editor = " + newPhrase);
						   break;
				
				case "d" : Editor.deleteString();
				           break;
					
				case "u" : Editor.toUpperCase();
				           break;
					
				case "c" : Editor.count();
				           break;
					
				case "x" : break;
					
				default: System.out.println("\nInvalid input! Please re-enter or type in 'X' to eXit!");
						 break;
						
			}			
		}while(!choice.equalsIgnoreCase("x"));

	}

	
}
