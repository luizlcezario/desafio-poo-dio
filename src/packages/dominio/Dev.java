package dominio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Dev {
	private String name;
	private Set<Conteudo> conteudosIncritos = new LinkedHashSet<>();
	private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();

	public void inscreverBootcamp(Bootcamp bootcamp) {
		this.conteudosIncritos.addAll(bootcamp.getConteudos());
		bootcamp.getDevs().add(this);
	}

	public void progredir(){
		Optional<Conteudo> conteudo = this.conteudosIncritos.stream().findFirst();
		if (conteudo.isPresent()) {
			this.conteudosConcluidos.add(conteudo.get());
			this.conteudosIncritos.remove(conteudo.get());
		} else {
			System.err.println("Você não está matriculado em nenhum conteúdo!");
		}
	}

	public double calcularTotalXP( ){
		return this.conteudosConcluidos
				.stream()
				.mapToDouble(Conteudo::calcularXP)
				.sum();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Conteudo> getConteudosIncritos() {
		return conteudosIncritos;
	}

	public void setConteudosIncritos(Set<Conteudo> conteudosIncritos) {
		this.conteudosIncritos = conteudosIncritos;
	}

	public Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}

	public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((conteudosIncritos == null) ? 0 : conteudosIncritos.hashCode());
		result = prime * result + ((conteudosConcluidos == null) ? 0 : conteudosConcluidos.hashCode());
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
		Dev other = (Dev) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (conteudosIncritos == null) {
			if (other.conteudosIncritos != null)
				return false;
		} else if (!conteudosIncritos.equals(other.conteudosIncritos))
			return false;
		if (conteudosConcluidos == null) {
			if (other.conteudosConcluidos != null)
				return false;
		} else if (!conteudosConcluidos.equals(other.conteudosConcluidos))
			return false;
		return true;
	}

	
}
