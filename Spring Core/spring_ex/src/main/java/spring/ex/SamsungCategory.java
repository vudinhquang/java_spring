package spring.ex;

import org.springframework.stereotype.Repository;

@Repository("samsung")
public class SamsungCategory implements ICategory {

	public void printCategory() {
		// TODO Auto-generated method stub
		System.out.println("Samsung");
	}

}
