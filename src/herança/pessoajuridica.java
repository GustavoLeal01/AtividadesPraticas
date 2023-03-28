package herança;

public class pessoajuridica extends Cliente {

	private String cnpj;

	public pessoajuridica(String nomeCliente, int idade, String sexo, int anoNascimento, String nomeMae, String cnpj) {
		super(nomeCliente, idade, sexo, anoNascimento, nomeMae);
		this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public void imprimir() {
		super.imprimir();
		System.out.println("CNPJ "+this.cnpj );
	}
	
}
