package firstTask;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;

public class MainTaskOne {

	public static void main(String[] args) {
		
		File folderSourse = new File("Sourse");
		folderSourse.mkdirs();
		
		File folderReceive = new File("Receive");
		folderReceive.mkdirs();
		
		FileFilter ff = new MyFileFilter("xlsx");
		
		File[] fileList = folderSourse.listFiles(ff);
		
		for (File file : fileList) {
			System.out.println(file+" was copied");
		}
		try{
			FileCopy.folderCopy(folderSourse, folderReceive, ff);
//			FileCopy.deleteFile(folderReceive);
//			FileCopy.deleteFile(folderReceive, ff);
		}catch(IOException ioex){
			ioex.printStackTrace();
		}

	}

}
