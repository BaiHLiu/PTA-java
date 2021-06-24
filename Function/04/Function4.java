import java.util.Scanner;
public class Function4{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Point p1 = new Point(sc.nextDouble(),sc.nextDouble());
    Point p2 = new Point(sc.nextDouble(),sc.nextDouble());
    Line l = new Line(p1,p2);
    System.out.printf("%.2f",l.getLength());
    }
}

/* 请在这里填写答案 */
class Point{
	double x,y;
	public Point(double x ,double y){
		this.x = x;
		this.y = y;
	}

}
class Line{
	Point p1,p2;
	public Line(Point p1,Point p2){
		this.p1 = p1;
		this.p2 = p2;
	}
	public double getLength(){
		return Math.sqrt(Math.abs(p1.x-p2.x) * Math.abs(p1.x-p2.x) + Math.abs(p1.y-p2.y) * Math.abs(p1.y-p2.y));
	}
}