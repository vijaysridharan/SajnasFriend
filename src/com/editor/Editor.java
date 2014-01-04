package com.editor;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Editor {
	
	static Editor editorObj = new Editor(null);
	private static StringBuilder lineEditor;
	
	public StringBuilder getLineEditor() {
		System.out.println("Your current string is  = " + lineEditor +"\n");
		return lineEditor;
	}

	public void setLineEditor(StringBuilder lineEditor) {
		this.lineEditor = lineEditor;
	}

	public Editor(String argument){		
		lineEditor = new StringBuilder();		
		lineEditor.append(argument);		
		//System.out.println("Your current string is  = " + lineEditor + "\n");
	}
	
	public Editor(){
		
	}
	
	 static void toUpperCase() {
		System.out.print("\nPlease enter the index of the string to convert to upper case: ");
		int index;
		Scanner scannObj = new Scanner(System.in);		
		index= Integer.parseInt(scannObj.nextLine());
		if(index>lineEditor.length()){ // If the index of the alphabet entered is more than the index of the alphabet present in the string, then, it throws as error. 
			System.out.print("\nString index out of range: " + index);
			System.out.println("\nThe character is not converted due to error!");

		}else{
			if(Character.isUpperCase(lineEditor.charAt(index))){				
				System.out.println("\nThe character at the specified location is already in upper case, no conversion is done.");
			}else{
				lineEditor.setCharAt(index, Character.toUpperCase(lineEditor.charAt(index)));
;				System.out.println("\nUpdated Line Editor = " + lineEditor);
				editorObj.setLineEditor(lineEditor);
			}
		}
		
		//System.out.println("The current length of lineEditor = " + lineEditor.length());
		
	}

	 static void deleteString() {
		System.out.print("\nPlease enter the index to delete the string: ");
		int firstCharater = 0;
		Scanner input1 = new Scanner(System.in);		
		firstCharater = Integer.parseInt(input1.nextLine());
		System.out.print("\nPlease enter the index one past the last character of string to be deleted: ");
		int lastCharacter = 0;
		Scanner input2 = new Scanner(System.in);		
		lastCharacter = Integer.parseInt(input2.nextLine());
		
		try{
			lineEditor.delete(firstCharater, lastCharacter);
			System.out.println("\nUpdated Line Editor = " + lineEditor);
		}catch(Exception e){
			System.out.println("\n" + e);
			System.out.println("The segment of string is not deleted due to error!");
		}
	}

	static void changeString() {
		System.out.print("\nPlease enter a new string :  ");		
		String text;
		Scanner scannObj = new Scanner(System.in);		
		text = scannObj.nextLine();
		StringBuilder newPhrase = new StringBuilder(text);		
		editorObj.setLineEditor(newPhrase);
		
	}

	static void count() {
		System.out.print("\nPlease enter the target string: ");
		String targetString;
		Scanner scannObj = new Scanner(System.in);
		targetString = scannObj.nextLine();
		int count = 0;
		String[] stringToken =  lineEditor.toString().split("\\s");
		for(String s:stringToken){
			if(s.contains(targetString)){				
				count++;
			}				
		}
		
		if(count==0){
			System.out.println("\nThe target word " + targetString + " is not in " +lineEditor);	
		}else{
			System.out.println("The word " + targetString + " appears " + count + " times in " + lineEditor);	
		}
			
		
		
	}


}
