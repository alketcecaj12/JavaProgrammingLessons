package datastructures;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IOUsingDataStructures {
	
	
	public static void main (String [] args) throws Exception{
		
		Map<String, List<Integer>>map = new HashMap<String, List<Integer>>();
		
		String file = "file2read.txt";
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line; 
		while((line = br.readLine())!= null){
			String [] r = line.split(":");
			String nome = r[0];
			
			List<Integer>nums = map.get(nome);
			if(nums == null){
				nums = new ArrayList<Integer>();
			}
			String [] rest = r[1].split(",");
			for(int i = 0; i < rest.length; i++){
			    nums.add(Integer.parseInt(rest[i]));	
			}
			map.put(nome, nums);
			
		}br.close();
		
		
		for(String s : map.keySet()){
			System.out.println(s+", "+media (map.get(s)));
		}
	}
	public static double media (List<Integer>a){
		
		int el = a.size();
		int somma = 0;
		for(int i = 0; i < a.size(); i++){
			somma = somma +a.get(i);
		}
		return somma / el;
	}
	

}
