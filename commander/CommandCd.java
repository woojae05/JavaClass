package kr.pe.batang.javaClass.exam.commander;

import java.io.File;

public class CommandCd extends AbstractCommand {

	public CommandCd(File currentDirectory, String commandLine) {
		super(currentDirectory, commandLine);
	}

	@Override
	public File executeCommand() {
		String newPath = checkCommandLine();
		
		String absPath = this.currentDirectory.getAbsolutePath() + "/" + newPath;
		String[] paths = this.currentDirectory.getAbsolutePath().split("/");

		if (newPath.equals("..")) {
			return getPrevFile(paths);
		} else {
			return getFile(absPath);
		}
	}

	public File getPrevFile(String[] paths) { // 전 파일 가져오기 
		String prevPath = "";

		if (paths.length > 2) {
			for (int i = 1; i < paths.length - 1; i++) {
				prevPath += "/" + paths[i];
			}
			return new File(prevPath);

		} else {
			System.out.println("cannot find the path");
			return this.currentDirectory;
		}

	}

	public File getFile(String absPath) { // 파일 가져오기 
		File file = new File(absPath);
		if (file.isDirectory()) {
			return file;
		} else {
			System.out.println("cannot find the path");
			return this.currentDirectory;
		}
	}
	
	public String checkCommandLine() {
		String newPath = null;
		try {			
			newPath = this.commandLine.split(" ")[1];
		}
		catch(Exception e) {
			return this.currentDirectory.getAbsolutePath();
		}
		return newPath;
	}
	
}