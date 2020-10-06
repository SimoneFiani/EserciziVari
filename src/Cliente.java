
public class Cliente {

	private String nome;
	private String congnome;

	public Cliente(String nome, String congnome) {
		super();
		this.nome = nome;
		this.congnome = congnome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCongnome() {
		return congnome;
	}

	public void setCongnome(String congnome) {
		this.congnome = congnome;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", congnome=" + congnome + "]";
	}

}
