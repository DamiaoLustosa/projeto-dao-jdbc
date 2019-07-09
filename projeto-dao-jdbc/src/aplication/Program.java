package aplication;

import java.util.Date;

import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		
		Department obj = new Department(1, "TVs");
		Seller sel = new Seller(1, "CAsa", "sds@gmail", new Date(), 300.00, obj);
		
		System.out.println(sel);

	}

}
