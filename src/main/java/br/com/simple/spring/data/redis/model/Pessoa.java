package br.com.simple.spring.data.redis.model;

import java.io.Serializable;

import javax.validation.constraints.NotBlank;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

@RedisHash("Pessoa")
public class Pessoa implements Serializable {

	private static final long serialVersionUID = -3910643899726702824L;

	@Id
	@NotBlank
	private String id;

	@NotBlank
	private String nome;

	@NotBlank
	private String sobrenome;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

}
