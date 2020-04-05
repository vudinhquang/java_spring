package spring.ex;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
@Service("service")
public class CategoryService {
	private ICategory category;
	@Autowired
	public CategoryService(@Qualifier("samsung") ICategory category) {
		this.category = category;
	}
	public ICategory getCategory() {
		return category;
	}
//	public void setCategory(ICategory category) {
//		this.category = category;
//	}
	
}
