package br.com.gerenciador.entidades;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.gerenciador.entidade.enums.Prioridade;

@Entity
public class Tarefa implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String titulo;
	private String descricao;
	private String responsavel;
	private LocalDateTime deadLine;
	private Enum<Prioridade> prioridade;
	
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}
	public LocalDateTime getDeadLine() {
		return deadLine;
	}
	public void setDeadLine(LocalDateTime deadLine) {
		this.deadLine = deadLine;
	}
	public Enum<Prioridade> getPrioridade() {
		return prioridade;
	}
	public void setPrioridade(Enum<Prioridade> prioridade) {
		this.prioridade = prioridade;
	}
}
