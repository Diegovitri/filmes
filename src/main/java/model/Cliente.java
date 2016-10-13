package model;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cliente")
public class Cliente implements Serializable{
	private static final long serialVersionUID = 1L;

	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;
    private String nome;
    private Integer idade;
    private String sexo;
    private String profissao;
    
    

    public Cliente() {
	
	}
    

	public Cliente(Long codigo, String nome, Integer idade, String sexo, String profissao) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		this.profissao = profissao;
	}


	public Long getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getSexo() {
        return sexo;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setCodigo(Long codigo) {
        this.codigo = codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
		Cliente other = (Cliente) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}
    

}
