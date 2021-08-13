package entidades;

import java.time.LocalDateTime;

import entidade.enums.Prioridade;

public class Tarefa {
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
