package jpateste.model.dao;

import java.util.List;

import javax.persistence.EntityManager;

import jpateste.connection.ConnectionFactory;
import jpateste.model.bean.Produto;

public class ProdutoDAO {
	
	public Produto save(Produto produto) {
		EntityManager em = new ConnectionFactory().getConnection();
		try {
			em.getTransaction().begin();
			if(produto.getId() == 0) {
				em.persist(produto);
			}else {
				em.merge(produto);
			}
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e);
			em.getTransaction().rollback();
		}finally {
			em.close();
		}
		return produto;
		
	}
	public Produto FindById(int id) {
		EntityManager em = new ConnectionFactory().getConnection();
		Produto produto = null;
		try {
			produto = em.find(Produto.class, id);
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			em.close();
		}
		return produto;
	}
	
	public List<Produto> FindAll(){
		EntityManager em = new ConnectionFactory().getConnection();
		List<Produto> produtos = null;
		
		try {
			produtos = em.createQuery("from Produto p").getResultList();
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			em.close();
		}
		return produtos;
	}
	
	public Produto delete(int id) {
		EntityManager em = new ConnectionFactory().getConnection();
		Produto produto = null;
		try {
			produto = em.find(Produto.class, id);
			em.getTransaction().begin();
			em.remove(produto);
			em.getTransaction().commit();
		} catch (Exception e) {
			System.out.println(e);
			em.getTransaction().rollback();
		}finally {
			em.close();
		}
		return produto;
	}
}
