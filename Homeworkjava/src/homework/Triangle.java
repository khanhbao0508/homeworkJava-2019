package homework;

public class Triangle extends Shape {
	private int base;
	private int height;
	public Triangle(String color, int base, int height) {
		super(color);
		this.base = base;
		this.height = height;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		System.out.println("Diện tích tam giác màu "+this.getColor() +" là "+ 0.5*this.getBase()*this.getHeight());
		return 0;
	}
	
}
