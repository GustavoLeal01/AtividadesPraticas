package herança;

public class Clienteteste {

	public static void main(String[] args) {
		pessoaFisica pf = new pessoaFisica("Gustavo", 24, "Masculino", 1998, "Fabiana", "48751194718", "587548073");
		
		pessoajuridica pj = new pessoajuridica("Jéssica", 24, "Feminino", 2000, "Carlinda", "85414719000121");
		
		pf.imprimir();
		pj.imprimir();
	}
}