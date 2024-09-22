package shapes;

public class Rectangle {

	private int length = 0;
	private int width = 0;
	
	public Rectangle(int width, int length) {
		this.length = length;
		this.width = width;
	}
	
	public void draw() {
		for(int j = 0; j<this.length; j++) {
			for(int i = 0; i<this.width; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public int calcArea() {
		return this.length * this.width;
	}
	
	public int calcPerimeter() {
		return 2* this.length + 2*this.width;
	} 
	
	public void scale(int factor) {
		this.length = this.length * factor;
		this.width = this.length * factor;	
	}
	 public String toString() {
	    	return "length= " + this.length + " width= " + this.width;
}
