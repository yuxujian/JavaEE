package springInjectTest;

public class Person {
	private String name;
    private Car2 car2;
    //create set methods;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Car2 getCar2() {
		return car2;
	}
	public void setCar2(Car2 car2) {
		this.car2 = car2;
	}
    
    //create toString()
}
