package p1110;

public class Triangle extends Shape {
	Point[] p; // Point 3개배열
	
	Triangle(){} //기본생성자
	
	Triangle(Point[] p){ //생성자 매개변수 1개
		this.p = p;
	}
	
	Triangle(Point p1,Point p2,Point p3){
		Point[] p = {p1,p2,p3};
//		Point[] p = new Point[] {p1,p2,p3};
//		Point[] p = new Point[3];
//		p[0] = p1;
//		p[1] = p2;
//		p[2] = p3;
		
		this.p = p;
	}

}
