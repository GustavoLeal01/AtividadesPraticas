package exerciciosdepoo;

public class Clienteteste {

	public static void main(String[] args) {
		Cliente[] lista=new Cliente [5];
		
		lista[0] = new Cliente("\nGustavo ",24," Masculino ",1998," Fabiana");
		lista[1] = new Cliente("\nEduardo ",24," Masculino ",1999," Marisa");
		lista[2] = new Cliente("\nJéssica ",23," Feminino ",2000," Carlinda");
		lista[3] = new Cliente("\nFabiana ",42," Feminino ",1980," Ivanilda");
		lista[4] = new Cliente("\nGabriel ",15," Masculino ",2007," Fabiana");

		System.out.println("---------------------------------------------------------------------------------------------");
		for(Cliente roda:lista) {
			roda.imprimir();
		System.out.println("---------------------------------------------------------------------------------------------");
		}
	
	}

}
