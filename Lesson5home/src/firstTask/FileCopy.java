package firstTask;

import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
	public static void fileCopy(File fileSourse, File fileReceive)throws IOException{
		if(fileSourse == null || fileReceive == null){
			throw new IOException("fle not found");
		}
		
		try(FileInputStream fis = new FileInputStream(fileSourse);FileOutputStream fos = new FileOutputStream(fileReceive)){
			byte[] buffer = new byte[1024*1024];
			int byteReader = 0;
			
			for(;(byteReader=fis.read(buffer))>0;){
				fos.write(buffer, 0, byteReader);
			}
		}catch(IOException ioex){
			ioex.printStackTrace();
		}
		
	}
	
	public static void deleteFile(File folder, FileFilter ff) throws IOException {
		if(folder == null || ff== null){
			throw new IOException("Found exception");
		}
		File[] fileList = folder.listFiles(ff);
		for (File file : fileList) {
			file.delete();
		}
	}
	public static void deleteFile(File folder) throws IOException {
		if(folder == null){
			throw new IOException("Found exception");
		}
		File[] fileList = folder.listFiles();
		for (File file : fileList) {
			file.delete();
			System.out.println(file+"was deleted");
		}
	}
	
	public static void folderCopy(File folderSourse, File folderReceive, FileFilter ff)throws IOException{
		if(folderSourse == null || folderReceive == null || ff == null){
			throw new IOException("folder not found ");
		}
		File[] listFiles = folderSourse.listFiles(ff);
		for (File file : listFiles) {
			fileCopy(file, new File(folderReceive, file.getName()));
		}
	}

}
