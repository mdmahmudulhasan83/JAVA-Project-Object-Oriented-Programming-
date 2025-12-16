package fileio;

import java.lang.*;
import java.io.*;

public class FileReadWriteDemo
{
	private File file;				//to create a File
	private FileWriter writer;		//to write in a file
	
	
	public void writeInFile(String s)
	{
		/*
			creating a file and writing in it genarates compile time exceptions (Checked Exceptions).
			So, we need to write the whole thing in try-catch.
		*/
		try
		{
			file = new File("fileio/History.txt");	//Declaring a file named named History.txt for creating.
			file.createNewFile();					//If the file does not exists, creates and opens the file. else, just opens the file
			writer = new FileWriter(file, true);	//creating the writer object to write in the file.
			writer.write(s+"\r"+"\n");				//writing a string s in the file. the "\r" and "\n" has been concat to go to a newline.
			writer.flush();							//After writing, we need to flush to indicate that we have completed writing.
			writer.close();							//After flushing, we need to close the file to save our writing.
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
	}
}
