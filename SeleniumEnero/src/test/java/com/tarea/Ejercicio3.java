package com.tarea;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*Ejercicio #3
Escribe la declaración más apropiada para cada una de las siguientes variables. 
El nombre de cada una indica el tipo de dato que contendrá y servirá para determinar 
el tipo de dato más adecuado en la declaración de la variable.
a) edad                                                b) códigoPostal
c) altura                                              d) genero (valores: H: hombre, M: mujer)                   
e) nombre                                              f) númeroDeHijos
g) iva (valores: % a aplicar)                          h) tallaCamisa (valores numéricos)
i) peso                                                j) precio 
k) alumnoRepetidor  (valores: SI/NO)                   l) mensaje
m) letra                                               n) mayorEdad                                               
o) minutos                                             p) días
q) matriculaCoche                                      r) contador
s) mayorDeEdad  (valores: verdadero/falso)             t) tallaCamiseta (valores: S, L, XL...)
	  */

		int edad=33;
		String cp= "08400";
		double altura=1.72;
		char genero='M';
		String nombre = "Alejandro";
		int numeroHijos=0;
		double iva = .16;
		int tallaCamisa=36;
		double peso=68.5;
		double precio=1850.50;
		String alumnoRepetido="No";
		String mensaje = "Arriba el America";
		char letra='A';
		int mayorEdad=18;
		int minutos = 22;
		int dias = 14;
		String matriculaCoche= "NP1345X";
		int contador = 7;
		boolean mayorDeEdad=true;
		char tallaDeCamisa='M';
		
		System.out.println("Edad: "+edad);
		System.out.println("Código postal: "+cp);
		System.out.println("Altura: "+altura);
		System.out.println("Genero (M/F): "+genero);
		System.out.println("Nombre: "+nombre);
		System.out.println("Número de hijos: "+numeroHijos);
		System.out.println("IVA: "+iva);
		System.out.println("Talla de camisa: "+tallaCamisa);
		System.out.println("Peso: "+peso);
		System.out.println("Precio de FreeBound: "+precio);
		System.out.println("Alumno repetido (Si/No): "+alumnoRepetido);
		System.out.println("Mensaje: "+mensaje);
		System.out.println("Letra: "+letra);
		System.out.println("Mayor de edad?: "+mayorDeEdad);
		System.out.println("Minutos: "+minutos);
		System.out.println("Días: "+dias);
		System.out.println("Matricula de coche: "+matriculaCoche);
		System.out.println("Contador: "+contador);
		System.out.println("Mayor de Edad?: "+mayorDeEdad);
		System.out.println("Talla de Camisa: "+tallaDeCamisa);
		
		if ((edad>mayorEdad) && (edad>mayorEdad)) {
		System.out.println("La mayoría de edad en México es de: "+mayorEdad+" "+mayorDeEdad);
		}
	}

}
