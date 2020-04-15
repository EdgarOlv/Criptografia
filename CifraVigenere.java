import java.util.Scanner;

public class CifraVigenere {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		String x,z,y="";
		int n,m,o,p,valor=0;
		System.out.println("Digite a Palavra");
		x = ler.next();
		x = x.toLowerCase();
		System.out.println("Digite a Chave");
		z = ler.next();
		z = z.toLowerCase();
		
		n= x.length();
		m= z.length();
		
		
		do {
			z=z+z;
			m= z.length();
		}while(m<n);
			
		for(int i = 0;i<n;i++) {
			valor = (x.charAt(i))+(int)(z.charAt(i)-96);
			if(valor>122)
				valor = valor-26;
			y = y + (char)valor; 
		}
		
		System.out.println(y);
	}

}
