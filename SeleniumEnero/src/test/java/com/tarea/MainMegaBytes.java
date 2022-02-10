package com.tarea;

import java.util.Scanner;

public class MainMegaBytes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int kb;
		MegaBytes mega = new MegaBytes();
		System.out.println("Dame los KB para calcularte cuantos MB y resto de KB equivale:");
		kb = reader.nextInt();
		mega.printMegaBytesAndKiloBytes(kb);
	}

}
