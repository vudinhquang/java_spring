package spring.ex;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		// Dependency Injection
//		CategoryService service = new CategoryService();
//		service.setCategory(new SamsungCategory());
//		service.getCategory().printCategory();
//		service.setCategory(new AppleCategory());
//		service.getCategory().printCategory();
		
		// IoC Container
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		CategoryService service = (CategoryService) context.getBean("service");
		service.getCategory().printCategory();
	}
}
