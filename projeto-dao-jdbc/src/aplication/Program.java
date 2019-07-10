package aplication;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {

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

	}

}
