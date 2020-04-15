import java.util.Scanner;

public class CifraCesar {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		String x,y="";
		int n,valor=0;
		System.out.println("Digite a Palavra");
		x = ler.next();
		x = x.toLowerCase();
		
		n= x.length();
		
		for(int i = 0;i<n;i++) {
			valor = (x.charAt(i)+3);
			if(valor>122)
				valor = valor-26;
			y = y + (char)valor; 
		}
		
		System.out.println(y);
		
		
	}

}
