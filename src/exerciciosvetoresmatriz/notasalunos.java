package exerciciosvetoresmatriz;

import java.util.Scanner;

public class notasalunos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner leia = new Scanner (System.in);
int x, i;
float [][] notas = new float[10][4];
float []medias = new float [10];


for(x = 0; x <10; x++) {
	System.out.println("\nDigite a notas dos participantes:" + (x+1) + " :" );
	for (i = 0; i <4; i++ ) {
		System.out.println("\nNota " + (i+1) + ": ");
		notas[x][i] = leia.nextFloat();
		
	}
}

for (x = 0; x <10; x++) {
	float soma = 0;
	for (i =0; i <4; i++) {
		soma += notas [x][i];
	} 
	medias [x] = soma / 4;
	
	
}
System.out.println("\nMédias dos participantes");
for (x = 0; 0 <10; x++) {
	System.out.println("Participante " + (x+1) + " : " + medias [x]);
	leia.close();
}

	}

}
