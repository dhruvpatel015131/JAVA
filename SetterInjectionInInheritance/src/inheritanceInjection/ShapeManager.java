package inheritanceInjection;

public class ShapeManager {
	Shape myShape;
	
	public void show() {
		this.myShape.show();
	}
	
	public Shape getMyShape() { 
		return myShape;
	}
	
	public void setMyShape(Shape myShape) {
		this.myShape = myShape;
	}
}