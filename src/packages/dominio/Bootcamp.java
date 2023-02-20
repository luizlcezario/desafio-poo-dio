package dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {
	private String title;
	private String description;
	private LocalDate dateInitial = LocalDate.now();
	private LocalDate dateFinal = dateInitial.plusDays(45);
	private Set<Dev> devs = new HashSet<>();
	private Set<Conteudo> conteudos = new LinkedHashSet<>();
	public String getTitle() {
		return title;
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
	public LocalDate getDateInitial() {
		return dateInitial;
	}
	public void setDateInitial(LocalDate dateInitial) {
		this.dateInitial = dateInitial;
	}
	public LocalDate getDateFinal() {
		return dateFinal;
	}
	public void setDateFinal(LocalDate dateFinal) {
		this.dateFinal = dateFinal;
	}
	public Set<Dev> getDevs() {
		return devs;
	}
	public void setDevs(Set<Dev> devs) {
		this.devs = devs;
	}
	public Set<Conteudo> getConteudos() {
		return conteudos;
	}
	public void setConteudos(Set<Conteudo> conteudos) {
		this.conteudos.addAll(conteudos);
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((title == null) ? 0 : title.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + ((dateInitial == null) ? 0 : dateInitial.hashCode());
		result = prime * result + ((dateFinal == null) ? 0 : dateFinal.hashCode());
		result = prime * result + ((devs == null) ? 0 : devs.hashCode());
		result = prime * result + ((conteudos == null) ? 0 : conteudos.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bootcamp other = (Bootcamp) obj;
		if (title == null) {
			if (other.title != null)
				return false;
		} else if (!title.equals(other.title))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (dateInitial == null) {
			if (other.dateInitial != null)
				return false;
		} else if (!dateInitial.equals(other.dateInitial))
			return false;
		if (dateFinal == null) {
			if (other.dateFinal != null)
				return false;
		} else if (!dateFinal.equals(other.dateFinal))
			return false;
		if (devs == null) {
			if (other.devs != null)
				return false;
		} else if (!devs.equals(other.devs))
			return false;
		if (conteudos == null) {
			if (other.conteudos != null)
				return false;
		} else if (!conteudos.equals(other.conteudos))
			return false;
		return true;
	}
	
}
