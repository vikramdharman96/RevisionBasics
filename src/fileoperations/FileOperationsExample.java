package fileoperations;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FileOperationsExample {
	public static void main(String[] args) throws IOException {
		File f=new File("D:\\java\\sample\\test.txt");
		
////		boolean mkdir = f.mkdir();
////		System.out.println(mkdir);
////		
////		boolean mkdirs = f.mkdirs();
////		System.out.println(mkdirs);
//		
//		boolean createNewFile = f.createNewFile();
//		System.out.println(createNewFile);
//		
//		boolean canExecute = f.canExecute();
//		System.out.println(canExecute);
//		
//		boolean canRead = f.canRead();
//		System.out.println(canRead);
//		
//		boolean canWrite = f.canWrite();
//		System.out.println(canWrite);
//		
//		boolean file = f.isFile();
//		System.out.println(file);
//		
//		boolean directory = f.isDirectory();
//		System.out.println(directory);
//		
		//To write
		
		FileUtils.write(f, "Believe in yourself");
		
		FileUtils.write(f, "you can do it", false);  //overwrites
		
		FileUtils.write(f, "\tBelieve", true);  //append (join)
		
		List<String> readLines = FileUtils.readLines(f);  //to read in Console
		
		for (String string : readLines) {
			System.out.println(string);
			
		}
		
		
	
	}

}
