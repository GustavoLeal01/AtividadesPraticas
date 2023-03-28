package herança;

public class gerente extends classefuncionario{
	
	private float salario;
	private float meta;
	public gerente(String nome, int idade, String funcao, float renda, String cTPS, float salario, float meta) {
		
		super(nome, idade, funcao, renda, cTPS);
		this.salario = salario;
		this.meta = meta;
	}
	public float getSalario() {
		return salario;
	}
	public void setSalario(float salario) {
		this.salario = salario;
	}
	public float getMeta() {
		return meta;
	}
	public void setMeta(float meta) {
		this.meta = meta;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println("Salário: "+this.salario);
		System.out.println("Meta: "+this.meta);
	
	}
}