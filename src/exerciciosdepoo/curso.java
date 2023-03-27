package exerciciosdepoo;

public class curso {
	private String nomeAluno;
	private String RA;
	private String sexo;
	private int anoNascimento;
	private String curso;
	
	public curso(String nomeAluno, String rA, String sexo, int anoNascimento, String curso) {
		super();
		this.nomeAluno = nomeAluno;
		RA = rA;
		this.sexo = sexo;
		this.anoNascimento = anoNascimento;
		this.curso = curso;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}

	public String getRA() {
		return RA;
	}

	public void setRA(String rA) {
		RA = rA;
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

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	public void infoAluno () {
		System.out.println("INFORMAÇÕES DO ALUNO: ");
		System.out.println(nomeAluno);
		System.out.println(RA);
		System.out.println(curso);
		System.out.println(anoNascimento);
	}
	
}
