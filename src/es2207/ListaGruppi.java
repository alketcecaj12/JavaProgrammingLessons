package es2207;

import java.io.BufferedReader;
import java.io.FileReader;

public class ListaGruppi {

	Gruppo [] gruppi ;
	int ng;
	
	public ListaGruppi(){
		gruppi  = new Gruppo[3];
		ng = 0;
	}
	
	public void add (Gruppo g){
		gruppi[ng] = g;
		ng++;
	}
	public void stampa(){
		for(int i = 0; i < ng; i++){
			System.out.println(gruppi[i]);
		}
	}
	public void caricaDati(String file){
		Gruppo gruppo = null;
		try{
			BufferedReader br = new BufferedReader(
					new FileReader(file));
			String line;
			
			while((line = br.readLine())!= null){
				if(line.startsWith("Gruppo")){
					String nomeg = line.substring("Gruppo ".length(), line.length()-1).trim();
					 gruppo = new Gruppo(nomeg);
				     add(gruppo);
				}
				else{
					String [] r = line.split(",");
					String npersona = r[0];
					int p = Integer.parseInt(r[1].trim());
					Persona persona = new Persona(npersona, p);
					gruppo.add(persona);
				}
			}br.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public static void main (String [] args){
		
		ListaGruppi lg = new ListaGruppi();
		lg.caricaDati("datigruppi.txt");
		
		lg.stampa();
		
	}
}
