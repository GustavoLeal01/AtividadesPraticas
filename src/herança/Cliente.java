package herança;

public class Cliente {

	private String nomeCliente;
	private int idade;
	private String sexo;
	private int anoNascimento;
	private String nomeMae;
	public Cliente(String nomeCliente, int idade, String sexo, int anoNascimento, String nomeMae) {
	
		
		super();
		this.nomeCliente = nomeCliente;
		this.idade = idade;
		this.sexo = sexo;
		this.anoNascimento = anoNascimento;
		this.nomeMae = nomeMae;
		
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public int getAnoNascimento() {
		return anoNascimento;
	}
	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	
		}
	public void imprimir() {
		System.out.println(nomeCliente+ " sua idade é: "+idade+" seu sexo é: "+sexo+" nasceu no ano de: "+anoNascimento+" e sua mãe é: "+nomeMae);
	}
	
	
}
