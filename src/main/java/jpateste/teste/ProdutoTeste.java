package jpateste.teste;

import jpateste.model.bean.Categoria;
import jpateste.model.bean.Produto;
import jpateste.model.dao.ProdutoDAO;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		
	/*  Produto p = new Produto();
		ProdutoDAO dao = new ProdutoDAO();
		Categoria c = new Categoria();
		c.setId(3);
		p.setDescricao("MALBEC");
		p.setQuantidade(2);
		p.setValor(289.50);
		p.setCategoria(c);
		dao.save(p);
		
		ProdutoDAO dao = new ProdutoDAO();
		Produto p = dao.FindById(1);
		
		System.out.println("ID: " + p.getId());
		System.out.println("Descrição: " + p.getDescricao());
		System.out.println("Quantidade: " + p.getQuantidade());
		System.out.println("Valor: " + p.getValor());
		System.out.println("Categoria: " + p.getCategoria().getDescricao()); 
		
		ProdutoDAO dao = new ProdutoDAO();
		for(Produto p: dao.FindAll()) {
			System.out.println("ID: " + p.getId());
			System.out.println("Descrição: " + p.getDescricao());
			System.out.println("Quantidade: " + p.getQuantidade());
			System.out.println("Valor: " + p.getValor());
			System.out.println("Categoria: " + p.getCategoria().getDescricao());
			System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=--");
		}
		
		/*ProdutoDAO dao = new ProdutoDAO();
		dao.delete(1);*/
		
		
		
	}

}
