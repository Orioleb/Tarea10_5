import java.security.SecureRandom;

public class Password {
	private int longitud;
	private char[] contraseña;
	/**
	 * COnstructor por defecto
	 */
	public Password() {
		longitud=8;
		contraseña=new char[8];
	}
	/**
	 * Constructor con longitud por parametro
	 * @param lon
	 */
	public Password(int lon) {
		longitud=lon;
		contraseña=new char[longitud];
	}
	
	public char[] getContraseña() {
		return contraseña;
	}
	
	public int getLongitud() {
		return longitud;
	}
	
	public void setLongitud(int l) {
		longitud=l;
	}
	/**
	 * Metodo para comprovar si la contraseña es fuerte
	 * @return boolean si es fuerte o no
	 */
	public boolean esFuerte() {
		boolean fuerte=false;
		int contMayus=0;
		int contMinus=0;
		int contNums=0;
		for(int i=0;i<contraseña.length;i++) {
			if((contraseña[i]>='0')&&(contraseña[i]<='9')) {
				contNums++;
			}
			String a=Character.toString(contraseña[i]);
			if(a.equals(a.toUpperCase())==true) {
				contMayus++;
			}
			if(a.equals(a.toLowerCase())==true) {
				contMinus++;
			}
			
		}
		if((contMayus>=2)&&(contMinus>=1)&&(contNums>=5)) {
			fuerte=true;
		}else {
			fuerte=false;
		}
		return fuerte;
	}
	/**
	 * Metodo para generar contraseña
	 */
	public void generarPassword() {
		//String de posibles caracteres para la contraseña
		final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		SecureRandom random = new SecureRandom();
        StringBuilder sb = new StringBuilder();
        //Generamos un string de la longitud con posiciones aleatorias del String de chars
        for (int i = 0; i < contraseña.length; i++)
        {
            int randomIndex = random.nextInt(chars.length());
            sb.append(chars.charAt(randomIndex));
        }
        //Pasamos la cadena a un String
        String[] a;
        a=new String[contraseña.length];
        a=sb.toString().split("");
        char[] b;
        b=new char[contraseña.length];
        for(int i=0;i<a.length;i++) {
        	b[i]=a[i].charAt(0);
        }
        contraseña=b;
	}

}