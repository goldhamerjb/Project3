/*
created 11/9/2014
Imports information describing a list of Students from a text file.
Information for each student is scanned and the student is added to
 the StudentList.
*/
import java.util.Scanner;
import java.io.*;


public void importStudentInfo(File stuInfo)
//Accepts a text file containing student information.
{
File studentInformation = stuInfo;
Scanner infoReader = new Scanner(studentInformation);
//Creates scanner for text file.

String infoLine = new String;
Scanner parser = new Scanner(infoLine);
//Creates scanner to parse strings from file.
while (infoReader.hasNext())
{
String newName, newID, newGrade; //Variable to hold new info
while (infoLine.hasNext();
	{
	infoLine = infoReader.nextLine();
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
	StudentList.add(new Student(newName, newID, newGrade));
	//A student is added to the StudentList after each line is scanned.
	}
}
}
