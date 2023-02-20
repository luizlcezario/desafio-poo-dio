package dominio;

public abstract class Conteudo {
	private String title;
	private String description;
	protected static final double XP_PADRAO = 10;

	
	public String getTitle() {
		return title;
	}


	public Conteudo() { }

	public Conteudo(String title, String description) {
		this.title = title;
		this.description = description;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public abstract double calcularXP() ;
}
