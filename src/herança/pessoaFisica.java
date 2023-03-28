package herança;

public class pessoaFisica  extends Cliente{
	
	private String cpf;
	private String rg;
	
	public pessoaFisica(String nomeCliente, int idade, String sexo, int anoNascimento, String nomeMae, String cpf,
			String rg) {
		super(nomeCliente, idade, sexo, anoNascimento, nomeMae);
		this.cpf = cpf;
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}
	
public void imprimir( ) {
	super.imprimir();
	System.out.println("CPF: " + this.cpf);
	System.out.println("RG: " + this.rg);
}

}
