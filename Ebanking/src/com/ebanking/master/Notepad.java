package com.ebanking.master;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Notepad {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		//Instance Class
		
		Library LB=new Library();
		
		LB.OpenApp("http://103.211.39.246/ranford2");
		LB.AdminLgn("Admin","TestingMindq");
		
		//To Get Test Data File path
		
		String Fpath="D:\\OnlineMayEvng\\Ebanking\\src\\com\\ebanking\\testdata\\Role.txt";
		
	    //Results File Path
		
		String Rpath="D:\\OnlineMayEvng\\Ebanking\\src\\com\\ebanking\\results\\Res_Role.txt";
		String SD;
		
	    //To Get Test Data File
		
		FileReader FR=new FileReader(Fpath);
		BufferedReader BR=new BufferedReader(FR);
		String SRead=BR.readLine();
		System.out.println(SRead);
		
		//Writing the Header into Results
		
		FileWriter FW=new FileWriter(Rpath);
		BufferedWriter BW=new BufferedWriter(FW);
		BW.write(SRead);
		BW.newLine();
		
		//Multiple Iterations ------ Loop
		
		while ((SD=BR.readLine())!=null) 
		{
			System.out.println(SD);
			
			//Split
			
			String SR[]=SD.split("###");
			
			String Rname=SR[0];
			String Rtyp=SR[1];
			
			String Res=LB.Role(Rname,Rtyp);
			System.out.println(Res);
			
			//Results
			
			BW.write(SD+"$^$^"+Res);
			BW.newLine();
		}
		 
		BW.close();
		BR.close();
		
	}

}
