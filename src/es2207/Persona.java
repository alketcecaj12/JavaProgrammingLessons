package es2207;

public class Persona {
	String nome;
	int p; 
	
	
	
	public Persona(String n, int p){
		this.nome = n;
		this.p = p;
	}
	
	public String toString(){
		return nome+","+p;
	}
}
