package es;

public class PartecipazioneGranPremio {
	   int arrivop;
	   String squadra;
	   String nomegp;
	   double tm;
	   int soste;
	   
	   public PartecipazioneGranPremio(int a, String s, String n, double t, int so){
		   this.arrivop = a;
		   this.squadra = s;
		   this.nomegp = n;
		   this.tm = t;
		   this.soste = so;
	   }
	   
	   public String toString(){
		   return arrivop+","+squadra+","+nomegp+","+tm+","+soste;
	   }
	   
	}
