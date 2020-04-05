package spring.ex;

import org.springframework.stereotype.Repository;

@Repository("apple")
public class AppleCategory implements ICategory {

	public void printCategory() {
		// TODO Auto-generated method stub
		System.out.println("Apple");
	}
	public void search() {
		
	}
}
