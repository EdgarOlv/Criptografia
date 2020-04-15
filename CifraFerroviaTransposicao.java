import java.util.Scanner;

public class CifraFerroviaTransposicao {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		String x,y="",p="",q="";
		int n,valor=0;
		System.out.println("Digite a Palavra");
		x = ler.next();
		x = x.toLowerCase();
		
		n= x.length();
		
		if(n%2==0) {
			//par
			for(int i=0;i<n/2;i++)
				p = p+ x.charAt(i);
			for(int i=n/2;i<n;i++)
				q = q+ x.charAt(i);
		}
		else {
			//impar
			for(int i=0;i<(n+1)/2;i++)
				p = p+ x.charAt(i);
			for(int i=(n+1)/2;i<n;i++)
				q = q+ x.charAt(i);
		}
		
		for(int i = 0;i<n/2;i++) {
			
			y = y + p.charAt(i);
			y = y + q.charAt(i); 
		}
		
		System.out.println(y);
	
		
		
	}

}
