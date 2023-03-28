package herança;

public class classefuncionario {
	private String nome;
	private int idade;
	private String funcao;
	private float renda;
	private String CTPS;
	public classefuncionario(String nome, int idade, String funcao, float renda, String cTPS) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.funcao = funcao;
		this.renda = renda;
		CTPS = cTPS;
		
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public float getRenda() {
		return renda;
	}
	public void setRenda(float renda) {
		this.renda = renda;
	}
	public String getCTPS() {
		return CTPS;
	}
	public void setCTPS(String cTPS) {
		CTPS = cTPS;
	}
	public void visualizar() {
		System.out.println("                             ");
		System.out.println("      Dados do Funcionário       ");
		System.out.println("                             ");
		System.out.println("Nome: "+this.nome);
		System.out.println("Idade: "+this.idade);
		System.out.println("ProfissÃ£o: "+this.funcao);
		System.out.println("Renda: "+this.renda);
		System.out.println("E-mail: "+this.CTPS);
}}
