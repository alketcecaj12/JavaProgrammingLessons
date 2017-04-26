package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Main2Read {

	public static void main (String [] args) {

		String file2read = "data.txt";

		try{

			BufferedReader br = new BufferedReader(new FileReader(new File(file2read)));

			String line; 
			String [] h = br.readLine().split(",");
			String s = h[0];
			String m = h[1]; 
			while((line = br.readLine())!= null){
				
				String [] r = line.split(",");
//				System.out.println(r.length);
//				System.out.println("-->  "+r[0]+"    --  "+r[1]);
				
				
					int voto = Integer.parseInt(r[1]);
					if(voto >= 9){
						System.out.println("Lo "+s+", "+r[0]+" merita un bonus ");
					}
					
				
			}
			br.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
