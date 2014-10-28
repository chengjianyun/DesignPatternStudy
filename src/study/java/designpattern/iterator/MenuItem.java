package study.java.designpattern.iterator;

public class MenuItem {
	String name;
	String description;
	Boolean vegeterin;
	float price;
	
	public MenuItem(String _name,String _description, Boolean _isVege,float _price) {
		// TODO Auto-generated constructor stub
		name=_name;
		description=_description;
		vegeterin=_isVege;
		price=_price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getVegeterin() {
		return vegeterin;
	}

	public void setVegeterin(Boolean vegeterin) {
		this.vegeterin = vegeterin;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
}
