package OOP.Java.Lab3;

public abstract class Shape {
	private String color;
	
	
	public Shape(String color) {
		super();
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	public abstract double getArea();
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}