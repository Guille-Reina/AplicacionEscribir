package Fichero;

import java.io.*;

public class LeerFichTexto {
	  public static void main(String[] args) throws IOException {
	   
		  BufferedReader fichero = new BufferedReader(new FileReader("FichTexto.txt"));
		  String i;
		  while  ((i = fichero.readLine()) != null)
			  System.out.println(i);
		  fichero.close();
	  }
}
