package br.com.gerenciador.controlador;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.gerenciador.entidades.Tarefa;
import br.com.gerenciador.negocio.TarefaBusinessLogic;

@ManagedBean(name = "TarefaCrudMBean")
@RequestScoped
public class TarefaCrudMBean {
	
	private Tarefa tarefa;
	
	private List<Tarefa> tarefas;
	
	private String prioridadeSelecionada;
	
	private TarefaBusinessLogic tarefaBusinessLogic;
	
	public List<Tarefa> getListarTarefas(){
		return tarefaBusinessLogic.listarTarefas();
	}
	
	public void salvarTarefa() {
		tarefaBusinessLogic.salvaTarefa(tarefa);
	}

	public Tarefa getTarefa() {
		return tarefa;
	}

	public void setTarefa(Tarefa tarefa) {
		this.tarefa = tarefa;
	}

	public String getPrioridadeSelecionada() {
		return prioridadeSelecionada;
	}

	public void setPrioridadeSelecionada(String prioridadeSelecionada) {
		this.prioridadeSelecionada = prioridadeSelecionada;
	}

	public List<Tarefa> getTarefas() {
		return tarefas;
	}

	public void setTarefas(List<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}
}
