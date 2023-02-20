package dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
	private LocalDate date;
	
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Mentoria [title=" + getTitle() + ", description=" + getDescription() + ", date=" + date + "]";
	}
	@Override
	public double calcularXP() {
		return XP_PADRAO + 20;
	}
	
}
