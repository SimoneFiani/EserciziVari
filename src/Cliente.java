
public class Cliente {

	private int id;
	private String nome;
	private String congnome;

	public Cliente(int id, String nome, String congnome) {
		super();
		this.id = id;
		this.nome = nome;
		this.congnome = congnome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "Cliente [id=" + id + ", nome=" + nome + ", congnome=" + congnome + "]";
	}

}
