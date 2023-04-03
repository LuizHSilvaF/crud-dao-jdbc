package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		System.out.println("=== Test1 : department INSERT ===");
		Department newDepartment = new Department(null, "Basketball");
		departmentDao.insert(newDepartment);
		System.out.println(newDepartment);
		
		System.out.println("=== Test2 : department UPDATE ===");
		Department dep = departmentDao.findById(4);
		dep.setName("Futball");
		departmentDao.upadate(dep);
		System.out.println("Updated!");
		
		System.out.println("=== Test3 : department FindById ===");
		dep = departmentDao.findById(4);
		System.out.println(dep);
		
		System.out.println("=== Test4 : department FindAll ===");
		List<Department>list = departmentDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("=== Test5 : department DELETE ===");
		System.out.println("Enter id for delete department: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed!");
	}

}
