package spring.ex;

public class Main {
	public static void main(String[] args) {
		CategoryService service = new CategoryService();
		service.setCategory(new SamsungCategory());
		service.getCategory().printCategory();
		service.setCategory(new AppleCategory());
		service.getCategory().printCategory();
	}
}
