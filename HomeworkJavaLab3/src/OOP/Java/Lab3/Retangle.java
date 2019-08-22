package OOP.Java.Lab3;


public class Retangle extends Shape {
	private int length;
	private int witdth;
	
	public Retangle(String color, int length, int witdth) {
		super(color);
		this.length = length;
		this.witdth = witdth;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWitdth() {
		return witdth;
	}

	public void setWitdth(int witdth) {
		this.witdth = witdth;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		System.out.println("Diện tích hình chữ nhật màu "+ this.getColor()+" là "+this.getWitdth()*this.getLength());
		return 0;
	}

}