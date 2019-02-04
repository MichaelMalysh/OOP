package secondTask;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Recording {
	public static void createFile (String name){
		File fileOne = new File(name);
		try{
			fileOne.createNewFile();
		}catch(IOException ioex){
			ioex.printStackTrace();
		}
	}
	
	public static void recordToFile (String file, String text){
		if(file == null || text == null){
			throw new IllegalArgumentException("illegal argument");
		}
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))){
			bw.write(text);
		}catch(IOException ioex){
			ioex.printStackTrace();
		}
	}
}
