package datastructures;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
	
	public static void main (String [] args) throws Exception{
		
		Map<String, Integer>voti = new HashMap<String, Integer>();
		
		voti.put("matteo", 10);
		voti.put("Marco", 9);
		voti.put("mia", 10);
		
		
		System.out.println(voti);
		
		
		
		String file = "data.txt";
		
		BufferedReader br = new BufferedReader (new FileReader(new File(file)));
		
		String line; 
		String header = br.readLine();
		
		//System.out.println(header);
		while((line = br.readLine())!= null){
			String [] r = line.split(",");
			
			
		}br.close();
	}

}
