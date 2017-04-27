package oopio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import java.io.FileWriter;

public class Main2Azienda {
	
	public static void main (String [] args){
		String file = "data3.txt";
		Azienda [] array_az = new Azienda[3];
		
		
		try{
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			int count = 0;

			while((line = br.readLine())!=null){

				String [] riga_i = line.split(":");
				String nomeAzienda = riga_i[0];
				String fatt = riga_i[1];
				System.out.println("azienda "+nomeAzienda+" ha come fatt. "
						+ "per il periodo 2010-2014 il seguente :"+fatt);

				String [] fatt_i = riga_i[1].split(",");
				int [] arr = new int[4];
				
				for(int i = 0; i < fatt_i.length; i++){
					arr[i] = Integer.parseInt(fatt_i[i]);
				}
				Azienda a = new Azienda(nomeAzienda, arr);
				array_az[count] = a;
				count++;

			}br.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("----- fatturato aziende : ");
		for(int i = 0; i < array_az.length; i++){
			System.out.print(array_az[i].nome+" --> ");
			for(int j = 0; j < array_az[i].fatturato.length; j++){
				
				System.out.print(array_az[i].fatturato[j]+" "); 
				
			}
			System.out.println();
		}
		System.out.println("----- fatturato aziende con bonus fiscale 10 percento : ");
		for(int i = 0; i < array_az.length; i++){
			System.out.print(array_az[i].nome+" --> ");
			for(int j = 0; j < array_az[i].fatturato.length; j++){
				array_az[i].fatturato[j] = array_az[i].fatturato[j]+(array_az[i].fatturato[j]/10); 
				System.out.print(array_az[i].fatturato[j]+" "); 
				
			}
			System.out.println();
		}
		try{
			
		
		PrintWriter out = new PrintWriter(new FileWriter(new File("fatturato.html")));
		out.print("<table>");
		for(int i = 0; i < array_az.length; i++){
			
			out.print("<tr>");
			out.print("<th>");
			out.print("<h1>"+array_az[i].nome+"</h1>");
			out.print("</th>");
			for(int j = 0; j < array_az[i].fatturato.length; j++){
				array_az[i].fatturato[j] = array_az[i].fatturato[j]+(array_az[i].fatturato[j]/10); 
				out.print("<th>");
				out.print("<h2>"+array_az[i].fatturato[j]+"</h2> "); 
				out.print("</th>");
			}
			
			out.print("</tr>");
			out.println();
			
		}
		out.print("</table>");
		out.close();
		
		}catch(Exception e){
			e.printStackTrace();
		}
	} 

}
