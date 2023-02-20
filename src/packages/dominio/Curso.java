package dominio;

public class Curso extends Conteudo {
	private int hours;
	
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	@Override
	public String toString() {
		return "Curso [title=" + getTitle() + ", description=" + getDescription() + ", hours=" + hours + "]";
	}
	@Override
	public double calcularXP() {
		return Conteudo.XP_PADRAO * hours;
	}
	
}
