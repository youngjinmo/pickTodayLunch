package khLunch;

public class Restaurants {
	private String name;
	private String category;
	private int price;
	private String location;
	
	public Restaurants(String name, String category, int price, String location) {
		
		setName(name);
		setCategory(category);
		setPrice(price);
		setLocation(location);
		
	}
	
	// getter methods
	public String getName() {
		return name;
	}
	public String getCategory() {
		return category;
	}
	public int getPrice() {
		return price;
	}
	public String getLocation() {
		return location;
	}
	
	// setter methods
	public void setName(String name) {
		this.name = name;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
}
