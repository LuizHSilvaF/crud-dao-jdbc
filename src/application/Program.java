package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		Department obj = new Department(1, "Books");
		Seller sel = new Seller(1, "Luiz", "luiz@gmail", new Date(), 3000.0, obj);
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println(sel);
		
		
	}

}
