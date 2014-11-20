/** created 11/18/2014
* contains information for the student class. 
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter; 

public class SaveSystem{
  private String studentInfo;
  private int lLSize; //size of the linked list
  private String currentRoster = "StudentRoster" //name of the text file: change this if you want to save to a new text file
  
  public void SaveSystem(){}

  public void WriteToFile()
    {PrintWriter outfile = null;
	    String outfileName = currentRoster + ".txt";
	    lLSize = CLLQueue.getSize();
      try
      	{
      	  studentInfo = CLLQueue.toPrintString(); //gets the student info in the format for the parser
      		outfile = newPrintWriter(outfileName); //writes the info to the textfile
      	}
      	catch (FileNotFoundException ex)
      	{      	}
     for (int i = 0; i < lLSize; i++)
    	{
    	  studentInfo =
    		outfile.print(studentInfo);
    		if (i != SIZE-1)
    			outfile.println( );
    	}
    
    	outfile.close();
    
    }

}
