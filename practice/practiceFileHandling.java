package practice;

import java.io.File;  // Import the File class
import java.io.FileFilter;
import java.io.IOException;  // Import the IOException class to handle errors

public class practiceFileHandling {

	public static void main(String[] args) {
//		File myObj = new File("rtuw");
//		try {
//		      
//		      myObj.createNewFile();
////		        System.out.println("File created: " + myObj.getName());
////		      } else {
////		        System.out.println("File already exists.");
////		      }
//		    } catch (IOException e) {
//		      System.out.println("An error occurred.");
//		      e.printStackTrace();
//		    }
//		System.out.println(myObj.getPath());
		
//		String currentPath = null;
//		try {
//			currentPath = new java.io.File(".").getCanonicalPath();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		 System.out.println("Current dir:" + currentPath);
		
		
		
//		      File dir = new File("D:\\New Folder");
//		      String[] children = dir.list();
//		      
//		      if (children == null) {
//		         System.out.println( "Either dir does not exist or is not a directory");
//		      } 
//		      else { 
//		         for (int i = 0; i< children.length; i++) {
//		            String filename = children[i];
//		            System.out.println(filename);
//		         }
//		      }
//		      System.out.print("Count: "+children.length+"\n");
//		   }
		
		File dir = new File("F:\\New Folder");
		File[] filesList = dir.listFiles();
		if(filesList.length == 0){
			System.out.print("\n\t\t\t Empty Directory");
		}
		else{
			for (File file : filesList) {
				if(file.isFile()) {
		 	      System.out.print("\n\t\t\t "+file.getName()+" [File]");
				}
		 	    if(file.isDirectory()){
		 		  System.out.print("\n\t\t\t "+file.getName()+" [Directory]");
		  	}
		}        	
		}
	}
}
