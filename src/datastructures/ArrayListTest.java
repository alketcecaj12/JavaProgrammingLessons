package datastructures;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class ArrayListTest {
	
	public static void main (String [] args) throws Exception{
		
		ArrayList<Integer> interi = new ArrayList<Integer>();
		ArrayList<String> str = new ArrayList<String>();
		ArrayList<Double> doub = new ArrayList<Double>();
		
		String file = "file.txt";
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		String line; 
		
		while((line = br.readLine())!= null){
			
			String [] r = line.split(",");
			
			for(int i = 0; i < r.length; i++){
				interi.add(Integer.parseInt(r[i]));
				str.add(r[i]);
				doub.add(Double.parseDouble(r[i]));
			}
			
			
		}br.close();
		
		System.out.println(interi);
		interi.remove(2);
		System.out.println(interi);
		System.out.println(interi.get(2));
		
		for(int i = 0; i < interi.size(); i++){
			System.out.println(interi.get(i));
		}
		// print strings
		for(int i = 0; i < str.size(); i++){
			// type mismatch error// int k = str.get(i);
			System.out.println(str.get(i));
		}
        // print doubles
		for(int i = 0; i < doub.size(); i++){
			// type mismatch error// int k = str.get(i);
			System.out.println(doub.get(i));
		}
		System.out.println(doub);
		doub.add(4, 14.2);
		System.out.println(doub);
		boolean contiene =  doub.contains(2.0);
		System.out.println(contiene);
		boolean vuota = doub.isEmpty();
		System.out.println(" e la lista doub vuota ? "+vuota);
	}

}
