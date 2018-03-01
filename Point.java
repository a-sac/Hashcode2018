import java.lang.Math;

public class Point{

	private double x;
	private double y;

	public Point(double x, double y){
		this.x = x;
		this.y = y;
	}

	public double getX(){
		return this.x;
	}

	public double getY(){
		return this.y;
	}

	public void setX(double xx){
		this.x = xx;
	}

	public void setY(double yy){
		this.y = yy;
	}

	public int distance(Point i, Point f){
		return ( abs(i.getX()-f.getX()) + abs(i.getY() - f.getY()) );
	}
}