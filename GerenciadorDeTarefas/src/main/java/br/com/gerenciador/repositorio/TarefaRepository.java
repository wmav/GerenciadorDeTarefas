package br.com.gerenciador.repositorio;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.gerenciador.entidades.Tarefa;

public class TarefaRepository {
	
	EntityManagerFactory emf;
	EntityManager em;
	
	public TarefaRepository() {
		emf = Persistence.createEntityManagerFactory("gerenciador");
		em = emf.createEntityManager();
	}
	
	public void salvarTarefa(Tarefa tarefa) {
		em.getTransaction().begin();
		em.merge(tarefa);
		em.getTransaction().commit();
		emf.close();
	}
	
	public void remover(Tarefa tarefa) {
		em.getTransaction().begin();
		em.remove(tarefa);
		em.getTransaction().commit();
		emf.close();
	}
	
	public List<Tarefa> listarTodas() {
		em.getTransaction().begin();
		Query consulta = em.createQuery("select tarefa from Tarefa tarefa");
		@SuppressWarnings("unchecked")
		List<Tarefa> tarefas = consulta.getResultList();
		em.getTransaction().commit();
		em.close();
		return tarefas;
	}

}
