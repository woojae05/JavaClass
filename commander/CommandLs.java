package kr.pe.batang.javaClass.exam.commander;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CommandLs extends AbstractCommand {

	public CommandLs(File currentDirectory, String commandLine) {
		super(currentDirectory, commandLine);
	}

	@Override
	public File executeCommand() {
		File[] childrenFiles = this.currentDirectory.listFiles();
		for(File file: childrenFiles) {
			
			String date = formatDate(file.lastModified());
			String size = file.isFile()?convertSize(file.length()):"";
			
			if(file.isFile()) {
				size = convertSize(file.length());				
			}else {
				size = "";
			}
			
			System.out.printf("%s %5s %4s %s\n",date,isDir(file),size,file.getName());
		}
		return this.currentDirectory;
	}
	
	public String formatDate(long unxiTime) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return dateFormat.format(convertDate(unxiTime));
	}
	
	public Date convertDate(long unixTime) {
		return new Date(unixTime);
	}
	
	public String isDir(File file) {  // 폴더인지 파일인지 확인 
		String result = "";
		
		if(file.isDirectory()) {
			result = "<DIR>";
		}
		
		return result;
	}
	
	public String convertSize(long size) {  // size 변환
		String convertedSize = ""+size;
		if(size>=1000) {
			convertedSize = size/1000+"K";
		}else if(size >=1000000) {
			convertedSize = size/1000000+"M";
		}
		return convertedSize;
	}
}