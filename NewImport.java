/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

/**
 * @author Theodore, Deshawn
 *created 11/9/2014
 *Imports information describing a list of Students from a text file.
 *Information for each student is scanned and the student is added to
 * the StudentList.
 */

import java.util.Scanner;
import java.io.*;
public class ImportStudentInfo {
    
public void importBasicInfo(File stuInfo, StuLinkedList<String>  tree)
//Accepts a text file containing student information.
{
File studentInformation = stuInfo;
Scanner infoReader = null;

		try {
			infoReader = new Scanner(studentInformation);} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
//Creates scanner for text file.
	String infoLine = "";
	Scanner parser = new Scanner(infoLine);
	//Creates scanner to parse strings from file.
	while (infoReader.hasNext())
	{
	String newName, newID, newGrade; //Variable to hold new info
		while (infoReader.hasNext())
		{
		infoLine = infoReader.nextLine();
                if (infoLine.charAt(0)== '/')
                    {infoLine = infoReader.nextLine();}
		parser.useDelimiter("&");
		newName = parser.next();
		newID = parser.next();
		newGrade = parser.next();
		/*
		Parser assumes text file has the following format:
		Each student's info is separated by a new line.
		Each segment of a student's information is immediately
		 followed by the "&" as a delimiter.
		The order of the information is name, ID, then grade.
		*/
		tree.add(newName, newID, newGrade);
		//A student is added to the StudentList after each line is scanned.
		}
	parser.close();
	infoReader.close();
	}}


public void importFullInfo(File stuInfo, StuLinkedList<String>  tree) //used to import a file with the full information(inculdes advising info)
	{
	File studentInformation = stuInfo;
	Scanner infoReader = null;

		try {
			infoReader = new Scanner(studentInformation);} 
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
			//Creates scanner for text file.
		String infoLine = "";
		Scanner parser = new Scanner(infoLine);
		//Creates scanner to parse strings from file.
		// used to import current data when program starts up
		while (infoReader.hasNext())
			{
				String newName, newID, newGrade, newHasBeenAdvised, newDateAdvised; //Variable to hold new info
				while (infoReader.hasNext())
					{
					infoLine = infoReader.nextLine();
					parser.useDelimiter("&");
					newName = parser.next();
					newID = parser.next();
					newGrade = parser.next();
					newHasBeenAdvised=parser.next();
					newDateAdvised=parser.next();
					/*
					Parser assumes text file has the following format:
					Each student's info is separated by a new line.
					Each segment of a student's information is immediately
					 followed by the "&" as a delimiter.
					The order of the information is name, ID, grade, advising status, advising date.
					*/
					tree.addFull(newName, newID, newGrade, newHasBeenAdvised, newDateAdvised);
					//A student is added to the StudentList after each line is scanned.
					}
				parser.close();
				infoReader.close();
				}}
			
			
}
