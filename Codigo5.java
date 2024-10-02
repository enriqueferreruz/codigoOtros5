package com.generation;
//La aplicación busca imprimir si el número ingresado es afortunado o no,
//según si tiene más dígitos de los números 3, 7, 8 y 9
import java.util.Scanner;//se agrega scanner

public class Codigo5 {
	public static void main(String[] args) {//se agrega método Main
		Scanner s = new Scanner(System.in);
	    System.out.print("Introduzca un número: ");// tenía una comilla simple
	    String ni = s.nextLine();
	    int c = Integer.parseInt(ni);// se convierte ni a int
	  
	    
	    int afo = 0;
	    int noAfo = 0;
	    
	    while (c > 0) {// se cambia a int c
		  int digito = (int)(c % 10);
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afo++;
	      } else {
			noAfo++;
		  
		 
	    }//if
	      c /= 10; //se saca de if
	    }//while
	    if (afo > noAfo) {
	      System.out.println("El " + ni + " es un número afortunado.");// se corrige println
	    } else {
	      System.out.println("El " + ni + " no es un número afortunado.");//se cambia a ni para imprimir número ingresado por usuario
	    }
	    s.close();// se cierra scanner
	  
	  
	}
	}
    

