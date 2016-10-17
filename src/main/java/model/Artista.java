package model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_artista")
public class Artista implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer codAtor;
	private String nome;
	private String nacionalidade;
	private BigDecimal cache;
	private Date nascimento;
	
	@OneToMany(mappedBy="artista")
	private List<Participacao> participacoes;
	
	public Artista(){
		participacoes =  new ArrayList<>();
	}
	
	public Artista(Integer codAtor, String nome, String nacionalidade, BigDecimal cache, Date nascimento) {
		super();
		this.codAtor = codAtor;
		this.nome = nome;
		this.nacionalidade = nacionalidade;
		this.cache = cache;
		this.nascimento = nascimento;
		participacoes =  new ArrayList<>();
	}

	public Integer getCodAtor() {
		return codAtor;
	}

	public void setCodAtor(Integer codAtor) {
		this.codAtor = codAtor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacionalidade() {
		return nacionalidade;
	}

	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	public BigDecimal getCache() {
		return cache;
	}

	public void setCache(BigDecimal cache) {
		this.cache = cache;
	}

	public Date getNascimento() {
		return nascimento;
	}

	public void setNascimento(Date nascimento) {
		this.nascimento = nascimento;
	}

	public List<Participacao> getParticipacoes() {
		return participacoes;
	}

	public void setParticipacoes(List<Participacao> participacoes) {
		this.participacoes = participacoes;
	}

	public void addParticipacao(Participacao participacao) {
		this.participacoes.add(participacao);
		participacao.setArtista(this);
		
	}
	
	public void removeParticipacao(Participacao participacao){
		this.participacoes.remove(participacao);
	}

	@Override
	public String toString() {
		return "Artista [codAtor=" + codAtor + ", nome=" + nome + ", nacionalidade=" + nacionalidade + ", cache="
				+ cache + ", nascimento=" + nascimento + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codAtor == null) ? 0 : codAtor.hashCode());
		result = prime * result + ((participacoes == null) ? 0 : participacoes.hashCode());
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
		Artista other = (Artista) obj;
		if (codAtor == null) {
			if (other.codAtor != null)
				return false;
		} else if (!codAtor.equals(other.codAtor))
			return false;
		if (participacoes == null) {
			if (other.participacoes != null)
				return false;
		} else if (!participacoes.equals(other.participacoes))
			return false;
		return true;
	}
	
}
