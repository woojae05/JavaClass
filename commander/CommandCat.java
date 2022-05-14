package kr.pe.batang.javaClass.exam.commander;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CommandCat extends AbstractCommand {
	
	public CommandCat(File currentDirectory, String commandLine) {
		super(currentDirectory, commandLine);
	}

	@Override
	public File executeCommand(){
		String fileName = getFileName();
		String absPath = this.currentDirectory.getAbsolutePath()+"/"+fileName;
		
		try {
			File file = new File(absPath);
			Scanner scan = new Scanner(file);
			while(scan.hasNext()) {
				System.out.println(scan.nextLine());
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		return this.currentDirectory;
	}
	
	public boolean isFile(File file) {
		return false;
	}
	

}
