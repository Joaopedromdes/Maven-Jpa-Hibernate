package jpateste.model.dao;

import java.util.List;

import javax.persistence.EntityManager;

import jpateste.connection.ConnectionFactory;
import jpateste.model.bean.Categoria;

public class CategoriaDAO {
	
	public Categoria save(Categoria categoria) {
		EntityManager em = new ConnectionFactory().getConnection();
		
		try {
			em.getTransaction().begin();
			if(categoria.getId() == 0) {
				em.persist(categoria);
			}else {
				em.merge(categoria);
			}
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e);
			em.getTransaction().rollback();
		}finally {
			em.close();
		}
		return categoria;
	}
	
	public Categoria FindById(int id) {
		EntityManager em = new ConnectionFactory().getConnection();
		Categoria categoria = null;
		try {
			categoria = em.find(Categoria.class, id);
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			em.close();
		}
		return categoria;
	}
	
	public List<Categoria> FindAll(){
		EntityManager em = new ConnectionFactory().getConnection();
		List<Categoria> categorias = null;
		try {
			categorias = em.createQuery("from Categoria c").getResultList();
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			em.close();
		}
		return categorias;
	}
	
	public Categoria delete(int id) {
		EntityManager em = new ConnectionFactory().getConnection();
		Categoria categoria = null;
		try {
			categoria = em.find(Categoria.class, id);
			em.getTransaction().begin();
			em.remove(categoria);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			em.close();
		}
		return categoria;
	}
}
