package es;

public class Squadra {
    String nomesq;
	int ngp;
	PartecipazioneGranPremio [] gp ;
	public Squadra(String n){
		this.nomesq = n;
		ngp = 0;
		gp = new PartecipazioneGranPremio[100];
	}
	
	public String getNome(){
		return nomesq;
	}
	public void add (PartecipazioneGranPremio pg){
		gp[ngp] = pg;
		ngp++;
	}
	public String toString(){
		StringBuffer sb = new StringBuffer();
		sb.append(nomesq+"\n");
		for(int i = 0; i < ngp; i++)
			sb.append(gp[i]+"\n");
		return sb.toString();
		
	}
}

