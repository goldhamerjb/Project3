/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication1;

/**
 *
 * @author Theodore
 * created 11/18/2014
 * contains information for the student class. 
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter; 


public class SaveSystem{
  private String studentInfo;
  private int lLSize; //size of the linked list
  private String currentRoster = "StudentRoster"; //name of the text file: change this if you want to save to a new text file
  
  public SaveSystem(){}

  public void WriteToFile(StuLinkedList<String>  tree)
    {PrintWriter outfile = null;
	    String outfileName = currentRoster + ".txt";
	    lLSize = StuLinkedList.getSize();
	    if (lLSize > 0) //if size is less than 0, no need to print, and printing would cause errors
	    	{try
	      	{
	      	   
	      		outfile = new PrintWriter(outfileName); //sets up printer to write the info to the text file
	      	    studentInfo = "";
	      		studentInfo = tree.toPrintString();//gets the student info in the format for the parser
	      		outfile.print(studentInfo); //prints to the file
	    		
	      	}
	      
	      catch (FileNotFoundException ex)
	      	{ //if file not found, creates file 
	    	  }}
      	
    outfile.close();
    
    }

}