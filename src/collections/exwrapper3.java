package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class exwrapper3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Set<Integer> num = new HashSet <Integer>();

Scanner leia = new Scanner(System.in);


System.out.println("\nDigite 10 números não repetidos: ");

for (int x = 0; x < 10; x++ ) {
	int numero = leia.nextInt();
	
	num.add(numero);
	
}

System.out.println("Números guardados ");
Iterator<Integer> iterator = num.iterator();
while (iterator.hasNext())  {
	int numero = iterator.next();
	System.out.println(numero);
}


	}

}
