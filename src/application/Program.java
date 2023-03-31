package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		
		System.out.println("=== Test1 : seller findById ===");
		Seller sel = sellerDao.findById(7);
		System.out.println(sel);
		
		System.out.println("\n=== Test2 : seller findByDepartment ===");
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== Test3 : seller findAll ===");
		list = sellerDao.findAll();
		for(Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== Test4 : seller Insert ===");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.0, dep);
		sellerDao.insert(newSeller);
		System.out.println("Insert! New Id : "+newSeller.getId());
		
		System.out.println("\n=== Test5 : seller Update ===");
		sel  = sellerDao.findById(1);
		sel.setName("Martha");
		sellerDao.upadate(sel);
		System.out.println("Updated!");
	}

}
