import java.util.Scanner;

public class Main {
	
	static Scanner teclat= new Scanner(System.in);

	public static void main(String[] args) {
		Password[] llista;
		//indicamos tamaño array
		System.out.println("Indica numero contraseñas");
		int ncontras=teclat.nextInt();
		llista=new Password[ncontras];
		//Indicamos longitud contraseña
		System.out.println("indica la longitud de la contraseña");
		int loncon=teclat.nextInt();
		boolean[] llistaf;
		llistaf=new boolean[ncontras];
		for(int i=0;i<ncontras;i++) {
			Password p=new Password(loncon);
			llista[i]=p;
			llistaf[i]=llista[i].esFuerte();
			if(llistaf[i]==true) {
				System.out.println("La contraseña"+(i+1)+" es fuerte");
			}
			else {
				System.out.println("La contraseña"+(i+1)+" NO es fuerte");
			}
		}
		

	}

}
