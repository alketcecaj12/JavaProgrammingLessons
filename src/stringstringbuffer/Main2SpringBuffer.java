package stringstringbuffer;

public class Main2SpringBuffer {
	
	public static void main (String [] args) {
		
		
		String [] a = new String [] {"ciao in italiano", "hi in inglese", "hey in danese", "hallo in tedesco"};
		
		
		
		String lingua = "inglese";
		
		for(int i = 0; i < a.length; i++){
			if(a[i].contains(lingua)){
				String [] si = a[i].split(" ");
				System.out.println("In "+lingua+" si saluta : "+si[0]);
			}
		}
		
	}

}
