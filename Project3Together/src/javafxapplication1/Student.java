/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

/**
 * @author Theodore
 * contains information for the student class. 
 */
public class Student{
private String studentName;
private String studentID;
private String grade; //this program only natively supports 4 options(freshman, sophmore, junior, senior), but more can be added
private int hasBeenAdvised; // in this case, 0 mean not advised, 1 means has been advised
private String advisingDate;
/** most information is stored as strings so it is easily changable: 
*for example, a Student id number can have any symbol in it, not just numbers.
*/

public Student (String studentName, String studentID, String grade)//this is the basic constructor when making a new student from the program
{
this.studentName=studentName;
this.studentID=studentID;
this.grade=grade;
hasBeenAdvised=0;
advisingDate="NaN";
}

public Student (String studentName, String studentID, String grade, String advised, String advisingDate)
{
this.studentName=studentName;
this.studentID=studentID;
this.grade=grade;
this.advisingDate=advisingDate;
//this next section parses the incoming string to an int
int length = advised.length();
		if(length == 1)
		{
			char firstSymbol = advised.charAt(0);
		if (firstSymbol=='1')
			{hasBeenAdvised = 1;}
		else 
			{hasBeenAdvised = 0;}
	}
	else 
		{hasBeenAdvised = 0;}
} //this constructor works for students who have been advised

public String getStudentName()
{return studentName;}

public String getStudentId()
{return studentID;}

public String getGrade()
{return grade;} 

public int getHasBeenAdvised()
{return hasBeenAdvised;}

public String getAdvisingDate()
{return advisingDate;}

public void setStudentName(String studentName)
{this.studentName = studentName;}

public void setStudentId(String studentID)
{this.studentID = studentID;}

public void setGrade(String grade)
{this.grade = grade;} 

public void setHasBeenAdvised(int hasBeenAdvised)
{this.hasBeenAdvised = hasBeenAdvised;}

public void setAdvisingDate(String advisingDate)
{this.advisingDate= advisingDate;}
}