package mypackage;

import java.io.File;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

import java.io.IOException;

public class Case {

	String a;
	String b;
	String c;
	String d;
	@SuppressWarnings("static-access")
	void phase2() throws Exception{
		
		Scanner sc= new Scanner(System.in);
			String sa= sc.next();
			
			if(sa.equals("a")) {
				System.out.println("Enter the  name of the File:");
				String fileName=sc.next();

				File file=new File("C:\\Users\\Vamshi-Sharu\\Desktop\\Project"+fileName+".txt");
			if(file.createNewFile()) {
				System.out.println("file is created"+" "+fileName);
				
			}
			else {
				System.out.println("the file is already created");
			}
				
	            new Proj().Second();
				
			}
	
	
	else if(sa.equals("b")) {
		System.out.println("Enter the name of file you want to deleted:");
		String deleteFile=sc.next();
		try {
			Files.deleteIfExists(Paths.get("C:\\Users\\Vamshi-Sharu\\Desktop\\Project"+deleteFile+".txt"));
			System.out.println("Deleted successfully");
		}
		
		catch(DirectoryNotEmptyException e) {
			System.out.println("Directory not Exists");
		}
		catch (IOException e) {
			System.out.println("Invalid Permission");
		}
		
	}
	else if(sa.equals("c")) {
		System.out.println("Folder Name!?");
		String Searching=sc.next();
		File file=new File("C:\\Users\\Vamshi-Sharu\\Desktop\\Project"+Searching+".txt");
		if(file.exists()) {
			System.out.println("file is found");
		
		}
		else {
			System.out.println("file not found");
		}
		
	}
	
	else if(sa.equals("d")) {
		new Case().showMain();
	}
	}
	
	
	
	
	
	
	

	private void showMain() {
		// TODO Auto-generated method stub
		
	}
}


