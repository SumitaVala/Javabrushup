package javabrushup;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class fileHelperTextfile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File file= new File("E:\\sumita\\sumita.txt");
		if(!file.isFile() )
		{
			file.createNewFile();
			
		}
		else
		{
			System.out.println("File already exist");
		}
		BufferedWriter br= new BufferedWriter(new FileWriter(file));
		br.write("sumita"+"\n");

		br.write("Aarvi"+"\n");
		br.write("mitansh"+"\n");
		br.write("sumita"+"\n");
		br.close();
		

		File file1= new File("E:\\sumita\\sumita.txt");
		if(!file.isFile() )
		{
			file.createNewFile();
			
		}
		else
		{
			System.out.println("File already exist");
		}
		BufferedWriter br1= new BufferedWriter(new FileWriter(file));
		br1.write("sumita"+"\n");

		br1.write("Aarvi"+"\n");
		br1.write("mitansh"+"\n");
		br1.write("sumita"+"\n");
		br1.close();
	}

}
