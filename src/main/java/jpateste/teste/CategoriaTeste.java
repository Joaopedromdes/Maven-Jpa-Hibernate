package jpateste.teste;

import jpateste.model.bean.Categoria;
import jpateste.model.dao.CategoriaDAO;

public class CategoriaTeste {

	public static void main(String[] args) {
		/*Categoria c = new Categoria();
		c.setDescricao("Camelo");
		c.setId(8); //Quando informar o Id e j� tiver no banco, ele far� um update.
		/*Categoria c2 = new Categoria();
		c2.setDescricao("Vestu�rio");
		
		CategoriaDAO dao = new CategoriaDAO();
		c = dao.save(c);
		//c2 = dao.save(c2);
		
		System.out.println("ID: " + c.getId());
		System.out.println("Descri��o: " + c.getDescricao());*/
		
		/*CategoriaDAO dao = new CategoriaDAO();
		Categoria c = dao.FindById(5);
		
		System.out.println("ID: " + c.getId());
		System.out.println("Descri��o: " + c.getDescricao());*/
		
		/*CategoriaDAO dao = new CategoriaDAO();
	
		for(Categoria c : dao.FindAll()) {
			System.out.println("ID: " + c.getId());
			System.out.println("Descri��o: " + c.getDescricao());
			System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		}*/
		
		/*CategoriaDAO dao = new CategoriaDAO();
		dao.delete(7);*/
		
	}

}
