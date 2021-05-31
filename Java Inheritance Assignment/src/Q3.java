
class Rectangle{
	int length ;
	int breadth;
	
	public void getArea() {
		int result = length*breadth;
		System.out.println("The area is "+result);
	}
	
	public  void getPerimeter() {
		int result = 2*(length+breadth);
		System.out.println("The perimeter is "+result);
	}
	
	public Rectangle(int l, int b) {
		length = l;
		breadth = b;
	}
}

class Square extends Rectangle{
	int side;
	
	public Square(int s) {
		super(s,s);
	}
}

public class Q3 {
public static void main(String[] args) {
		Rectangle obj = new Rectangle(6,8);
		obj.getArea();
		obj.getPerimeter();
		
		Square obj2 = new Square(5);
		obj2.getArea();
		obj2.getPerimeter();
		
		Square [] sq = new Square[10];
		int x = 8;
		
		for(int i=0;i<10;i++) {
			sq[i] = new Square(x);
			x++;
			
		}
		
		for (int i=0;i<10;i++) {
			sq[i].getArea();
			sq[i].getPerimeter();
			
		}
		

	}

}
