package stringstringbuffer;

public class Main2Lingua {
	
	public static void main (String [] args) {
		
		
		String [] a = new String [] {"ciao in ITALIANO", "hi in inglese", "hey in danese", "hallo in tedesco"};
		
		
		
		String lingua = "inglese";
		
		for(int i = 0; i < a.length; i++){
			
				System.out.println(a[i].toLowerCase());
				System.out.println(a[i].toUpperCase());
		}
		
		String s = a[0];
		System.out.println("la string che considero è "+s);
		int indice = s.indexOf("o");
		
		System.out.println(indice);
		
		String sub = a[0].substring(0,6);
		System.out.println("la sottostringa che ho ricavato è : "+sub);
		
	}

}
