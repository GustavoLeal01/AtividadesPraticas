package collections;

import java.util.ArrayList;
import java.util.Collections;


public class arraylist1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> cores = new ArrayList<String>();

cores.add("AZUL");
cores.add("VERDE");
cores.add("AMARELO");
cores.add("BRANCO");
cores.add("LARANJA");


System.out.println("Cores adicionadas: ");
for (String cor : cores) {
	System.out.println(cor);
}
	Collections.sort(cores);
	System.out.println("Cores adicionais em ordem crescente: ");
	for (String cor : cores) {
		System.out.println(cor);
		
	}
	
}
	}


