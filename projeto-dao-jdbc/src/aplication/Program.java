package aplication;


import java.util.Date;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.println("==== TESTE 1: seller findByID ==== ");
		SellerDao sellerDao = DaoFactory.createSellerDao();
		Seller sel = sellerDao.findById(3);

		System.out.println(sel);

		System.out.println("\n ==== TESTE 2: seller findByDepartment ==== ");
		Department department = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(department);

		for (Seller obj : list) {
			System.out.println(obj);
		}

		System.out.println("\n ==== TESTE 3: seller findAll ==== ");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		
		System.out.println("==== TESTE 4: seller insert ==== ");
		Seller novoSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.00, department);
		sellerDao.insert(novoSeller);
		System.out.println("Inserido! Novo Id: "+ novoSeller.getId());
		
		
		System.out.println("==== TESTE 5: seller update ==== ");
		sel = sellerDao.findById(1);
		sel.setNome("Martha Waine");
		sellerDao.update(sel);
		System.out.println("Atualizado com sucesso!");
		
		System.out.println("==== TESTE 6: seller delete ==== ");
		System.out.println("Entre com Id para deste de deleção! ");
		int id = sc.nextInt();
		sellerDao.deleteById(id);
		System.out.println("Deleção completa! ");
		
		sc.close();
		
	}

}
