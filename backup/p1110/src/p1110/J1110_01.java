package p1110;

public class J1110_01 {

	public static void main(String[] args) {
		//객체선언
		Circle c1 = new Circle();
		c1.draw();
		
		//객체선언
		Point p = new Point(150,150);
		Circle c2 = new Circle(p,50);
		c2.draw();
		
		// 점3개 생성
		Point p1 = new Point(100,100);
		Point p2 = new Point(140,50);
		Point p3 = new Point(200,100);
		Point[] pp ={p1,p2,p3};
		
		Triangle t1 = new Triangle(pp);
		Triangle t2 = new Triangle(p1,p2,p3);
		
//		Point[] pp = new Point[3];  //배열선언
//		pp[0] = new Point(100,100); //객체선언
//		pp[1] = new Point(140,50);
//		pp[2] = new Point(200,100);
		
		
		
		

	}

}
