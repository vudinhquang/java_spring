package model;
// Generated 2020/04/04 23:25:09 by Hibernate Tools 3.5.0.Final

/**
 * Product generated by hbm2java
 */
public class Product implements java.io.Serializable {

	private ProductId id;
	private Category category;

	public Product() {
	}

	public Product(ProductId id, Category category) {
		this.id = id;
		this.category = category;
	}

	public ProductId getId() {
		return this.id;
	}

	public void setId(ProductId id) {
		this.id = id;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

}
