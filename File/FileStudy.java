package kr.hs.dgsw.java.dept2.d0511;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileStudy {
	
	public void studyFileData() throws Exception{
		File file = new File("/Users/DGSW/sample/sample.txt");
		
//		파일 이름 가져오기
		String name = file.getName();
		System.out.println("파일 이름 알기");
		System.out.println("file: "+name);
		
//		파일의 경로 알기 
		File file2 = new File("DGSW");
		String path = file2.getPath();
		String absolutePath = file2.getAbsolutePath();
		String canonicalPath = file2.getCanonicalPath();
		
		System.out.println("파일 경로 알기");
		System.out.println(path);
		System.out.println(absolutePath);
		System.out.println(canonicalPath);
		
//		파일 존재 여부 
		boolean exist = file.exists();
		System.out.println("파일 존재 여부");
		System.out.println(exist);
		System.out.println(file2.exists());
		
		long size = file.length();
		System.out.println("파일의 크기");
		System.out.println(size);
		
//		파일의 수정 시간 
		long time  = file.lastModified();
		System.out.println("수정된 시간");
		System.out.println(formatDate(time));
	}
	
	public void stydyManage() throws Exception{
		
		// 파일 생성 
		File file = new File("/Users/DGSW/helloWorld/index2.html");
		boolean created = file.createNewFile();
		System.out.println(created);
		
		//파일 삭제
		boolean deleted  = file.delete();
		System.out.println(deleted);
		
		// 폴더 생성
		File dir = new File("/Users/DGSW/helloWorld/subDir");
		created = dir.mkdir();
		System.out.println("폴더 생성"+created);
		
		// 폴더 삭제
		deleted = dir.delete();
		System.out.println("폴더 삭제"+deleted);
		
		// 폴더 생성 2
		File dir2  = new File("/Users/DGSW/helloWorld/subDir2/asdf");
		created = dir2.mkdirs();
		System.out.println("폴더 생성"+created);
		
		// 파일 폴더 구분하기
		File some1 = new File("/Users/DGSW/helloWorld/index2.html");
		File some2 = new File("/Users/DGSW/helloWorld");
		System.out.println(some1.getName()+" "+ some1.isFile()+" "+some1.isDirectory());
		System.out.println(some1.getName()+" "+ some2.isFile()+" "+some2.isDirectory());
		
		// 파일 이름 바꾸기
		File indexHtml = new File("/Users/DGSW/helloWorld/index2.html");
		File newName = new File("/Users/DGSW/helloWorld/haha.html");
		indexHtml.renameTo(newName);
		
	}
	
	public void studyList() {
		File dir = new File("/Users/DGSW");
		
		String[] children = dir.list();
		
		for(String name :children) {
			System.out.println(name);
		}
		
		File[] childrenFiles = dir.listFiles();
		for(File file: childrenFiles) {
			System.out.println(file);
		}
		System.out.println(2000/1000);
	}
	
	public void showFile(File file) {
		String date = formatDate(file.lastModified());
		String name = file.getName();
		long size = file.length();
		
		System.out.println(date+"   "+size+"    "+name);
	}
	
	public Date convertDate(long unixTime) {
		return new Date(unixTime);
	}
	
	public String formatDate(long unxiTime) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return dateFormat.format(convertDate(unxiTime));
	}
	
	public static void main(String[] args) throws Exception {
		FileStudy fileStudy = new FileStudy();
		fileStudy.studyFileData();
		
		File file = new File("/Users/DGSW/helloWorld/index.html");
		fileStudy.showFile(file);
		
		fileStudy.stydyManage();
		
		fileStudy.studyList();
		
		
		
	}
}
