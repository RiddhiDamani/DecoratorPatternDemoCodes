
public class BlueShapeDecorator extends ShapeDecorator {

	public BlueShapeDecorator(Shape decoratedShape) {
		super(decoratedShape);
		// TODO Auto-generated constructor stub
	}
	
	// overrides draw method of shape decorator
	public void draw() {
		decoratedShape.draw();
		setColor(decoratedShape);
		
	}

	private void setColor(Shape decoratedShape) {
		// TODO Auto-generated method stub
		System.out.println("Color: Blue has been applied to : " + decoratedShape);
	}
}
