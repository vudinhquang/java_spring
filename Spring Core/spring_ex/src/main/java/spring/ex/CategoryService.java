package spring.ex;

public class CategoryService {
	private ICategory category;
	public CategoryService(ICategory category) {
		this.category = category;
	}
	public ICategory getCategory() {
		return category;
	}
//	public void setCategory(ICategory category) {
//		this.category = category;
//	}
	
}
