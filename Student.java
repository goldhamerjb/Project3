/** created 11/18/2014
* contains information for the student class. 
*
*
*
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

public student (String studentname, String studentID, String grade)//this is the basic constructor when makin a new student from the program
{
this.studentName=studentName;
this.studentId=studentID;
this.grade=grade;
hasbeenAdvised=0;
advisingDate="NaN";
}

public student (String studentname, String studentID, String grade, int hasBeenAdvised, String advisingDate)
{
this.studentName=studentName;
this.studentId=studentID;
this.grade=grade;
this.hasbeenAdvised=hasBeenAdvised;
this.advisingDate=advisingDate;
} //this constructor works for students who have been advised

public String getStudentName()
{return = studentName;}

public String getStudentId()
{return = studentID;}

public String getGrade()
{return = grade;} 

public String getHasBeenAdvised()
{return = hasBeenAdvised;}

public String getAdvisingDate()
{return = advisingDate;}

public void setStudentName(String studentName)
{this.studentName = studentName;}

public void setStudentId(String studentID)
{this.studentID = studentID;}

public void setGrade()
{grade = grade;} 

public void setHasBeenAdvised(int hasBeenAdvised)
{this.hasBeenAdvised = hasBeenAdvised;}

public void setAdvisingDate(String advisingDate)
{this.advisingDate= advisingDate;}
}
