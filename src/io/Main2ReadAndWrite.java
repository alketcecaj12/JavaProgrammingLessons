package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Main2ReadAndWrite {
	
	public static void main (String [] args){
		
		String file = "data2.txt";
		
		try {
		
			
		
		BufferedReader br = new BufferedReader(new FileReader(new File(file)));
		StringBuffer sb = new StringBuffer();
		
		String line; 
		
		String [] header = br.readLine().split(",");
		System.out.println(header[0]+", "+header[1]);
		while((line = br.readLine())!= null){
			
			String [] r = line.split(":");
			System.out.println(r[0]+", "+r[1]);
			String azienda = r[0];
			String [] r2 = r[1].split(",");
			
			for(int i = 0; i < r2.length; i++){
				if(r2[i].equals("formaggio")){
					sb.append(azienda);
				}
			}
			
			
		}br.close();
		
		print(sb, "PrintedData.txt");
		
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
	
	public static void print(StringBuffer sb, String file){
		try{
			
			PrintWriter out = new PrintWriter(new FileWriter(new File(file)));
			
		
			out.print(sb);
			out.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
