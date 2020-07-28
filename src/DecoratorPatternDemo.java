
public class DecoratorPatternDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape blueCircle = new BlueShapeDecorator(new Circle());
		Shape blueRectangle = new BlueShapeDecorator(new Rectangle());
		
		System.out.println("\n Create blue color circle using blue shape decorator");
		
		blueCircle.draw();
		
		System.out.println("\n Create blue color rectangle using blue shape decorator");
		blueRectangle.draw();
	}

}
