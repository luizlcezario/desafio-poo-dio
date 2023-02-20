package dominio;

public class Curso {
	private String title;
	private String description;
	private int hours;
	
	public String getTitle() {
		return title;
	}
	public String getDescription() {
		return description;
	}
	public int getHours() {
		return hours;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	@Override
	public String toString() {
		return "Curso [title=" + title + ", description=" + description + ", hours=" + hours + "]";
	}
	
}
