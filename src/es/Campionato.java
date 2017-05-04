package es;

public class Campionato {

	Squadra [] s;
	int ns;
	
	public Campionato(){
	  s = new Squadra[100];
	  ns = 0;	
	}
	
	public void add (Squadra sq){
		s[ns] = sq;
		ns++;
	}
	public Squadra cerca (String team){
		for(int i = 0; i < ns ; i++){
			if(s[i].getNome().equals(team))
				return s[i];
			
		}
		return null;
	}
	
	public static void main (String [] args){
		
		Campionato ci = new Campionato();
		
		String input [] = new String []{
				 "Gran premio di Monza:",
				 "1.Ferrari,30.23,2",
				 "2.Mercedes,31.23,1",
				 "3.Renault,31.43,2",
				 "Gran premio di Mosca:",
				 "1.Ferrari,29.23,2",
				 "2.Mercedes,30.23,1",
				 "3.Renault,31.43,2"
		};
		for(int i = 0; i < input.length; i=i+4){
			//System.out.println(input[i]);
			String nomegp = input[i];
			for(int j = 1; j <= 3; j++){
				String piazzamento = input[i+j];
				//System.out.println(piazzamento);
				int p = Integer.parseInt(piazzamento.substring(0,1));
				String [] ri = piazzamento.substring
						(2,piazzamento.length()).split(",");
				String team = ri[0];
				double tm = Double.parseDouble(ri[1]);
				int soste = Integer.parseInt(ri[2]);
				
				Squadra s = ci.cerca(team);
				if(s == null){
					s = new Squadra(team);
					ci.add(s);
					
				}
				s.add(new PartecipazioneGranPremio(p,team,nomegp, tm, soste));
			}
		}
		for(int i = 0; i < ci.ns; i++){
			System.out.println(ci.s[i]);
		}
		
	}
}


