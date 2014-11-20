/*
created 11/19/2014
Imports information describing a list of Students from a text file.
Information for each student is scanned and the student is added to
 the StudentList.
 
 edited 11/20/2014, added ability to read files containing complete student info(advising information as well as name/id/grade)
*/
import java.util.Scanner;
import java.io.*;
public void importStudentInfo(){
public void importStudentInfo(){}
public void readNewStudentInfo(File stuInfo)
//Accepts a text file containing student information that is not .
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
}}

public void readNewStudentInfo(File stuInfo)
//Accepts a text file containing student information that is complete
{
File studentInformation = stuInfo;
Scanner infoReader = new Scanner(studentInformation);
//Creates scanner for text file.

String infoLine = new String;
Scanner parser = new Scanner(infoLine);
//Creates scanner to parse strings from file.
while (infoReader.hasNext())
{
String newName, newID, newGrade, newHasBeenAdvised, newAdvisingDate; //Variable to hold new info
while (infoLine.hasNext();
	{
	infoLine = infoReader.nextLine();
	parser.useDelimiter("&");
	newName = parser.next();
	newID = parser.next();
	newGrade = parser.next();
	newHasBeenAdvised = parser.next();
	newAdvisingDate = parser.next();
		/*
	Parser assumes text file has the following format:
	Each student's info is separated by a new line.
	Each segment of a student's information is immediately
	 followed by the "&" as a delimiter.
	The order of the information is name, ID, grade, if they have been advised, date of advising.
	*/
	int format=newHasBeenAdvised.Length();
	char firstSymbol = newHasBeenAdvised.charAt(0);
	int beenAdvised;
	if ((format==1)}
		{if (firstSymbol=='1')
			{beenAdvised = 1;}
		else 
			{	beenAdvised = 0;
				newAdvisingDate = "NaN";}
		}
	else
		{beenAdvised = 0;
		newAdvisingDate = "NaN";
		}
	/*
	this section checks the format of newHasBeenAdvised, to make sure that the information is in the right format. 
	if it is the right size, and a 1 is the symbol there, then it puts 1 in the student information.
	Otherwise, the if....else statements put a 0 for student advising(signifying that they haven't), 
	and clears any data about the advising date
	*/
	StudentList.add(new Student(newName, newID, newGrade, beenAdvised, AdvisingDate));
	//A student is added to the StudentList after each line is scanned.
	}
}}
}
