package springInjectTest;

public class Car2 {
	
	private String name;
	
	private Double price;
	
	
	public Car2() {
		super();
	}
	
	public Car2(String name, Double price) {
		super();
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	

}
