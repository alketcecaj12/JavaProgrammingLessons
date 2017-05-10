package es2207;

public class Gruppo {
	
	private String nome; 
	private Persona[] persone; 
	private int npers;
	
	
	public Gruppo(String nome){
		this.nome = nome;
		persone = new Persona[3];
		npers = 0;
	}
	public void add(Persona p){
		persone[npers] = p;
		npers++;
	}
	public String getNome(){
		return nome; 
	}
	
	public int getNPersone(){
		return npers;
	}

	
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append(nome+"\n");
		for(int i = 0; i < persone.length; i++)
		sb.append(persone[i]+"\n");
		
		return sb.toString();
		
	}
}
