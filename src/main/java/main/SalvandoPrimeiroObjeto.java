package main;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Cliente;


public class SalvandoPrimeiroObjeto {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemploPU");
		EntityManager em = emf.createEntityManager();

		Cliente cliente = new Cliente();
		cliente.setNome("Renato");
		cliente.setIdade(35);
		cliente.setProfissao("Gerente");
		cliente.setSexo("M");

		em.getTransaction().begin();
		em.persist(cliente);
		em.getTransaction().commit();

		System.out.println("Cliente salvo com sucesso!");
		em.close();
		emf.close();

	}
}
