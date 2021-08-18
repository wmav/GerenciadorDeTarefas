package br.com.gerenciador.negocio;

import java.util.List;

import br.com.gerenciador.entidades.Tarefa;
import br.com.gerenciador.repositorio.TarefaRepository;

public class TarefaBusinessLogic {
	
	private TarefaRepository tarefaRepository;
	
	public void salvaTarefa(Tarefa tarefa) {
		tarefaRepository.salvarTarefa(tarefa);
	}
	
	public List<Tarefa> listarTarefas(){
		return tarefaRepository.listarTodas();
	}

}
