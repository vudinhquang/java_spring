package main;

import java.util.List;

import dao.CategoryDAO;
import model.Category;

public class App {
	public static void main(String[] args) {
		CategoryDAO categoryDAO = new CategoryDAO();
		//getCategoryById(2, categoryDAO);
		update(categoryDAO);
		print(categoryDAO);
		
	}
	private static void insert(CategoryDAO categoryDAO) {
		categoryDAO.insert(new Category("Apple"));
		categoryDAO.insert(new Category("Samsung"));
		categoryDAO.insert(new Category("Xiaomi"));
	}
	private static void print(CategoryDAO categoryDAO) {
		List<Category> categories = categoryDAO.getAllData();
		for(Category category : categories) {
			System.out.println(category.getId()+" "+category.getName());
		}
	}
	private static void getCategoryById(int id, CategoryDAO categoryDAO) {
		Category category = categoryDAO.findById(id);
		System.out.println(category.getId()+" "+category.getName());
	}
	private static void update(CategoryDAO categoryDAO) {
		Category category = categoryDAO.findById(2);
		category.setName("Nokia");
		categoryDAO.update(category);
	}
}
