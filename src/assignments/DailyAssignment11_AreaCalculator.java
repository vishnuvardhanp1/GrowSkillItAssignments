/**
 * 
 */
package assignments;

/**
 * 
 */
public class DailyAssignment11_AreaCalculator {

	
	//circle
	/**
	 * @param radius
	 * @return
	 */
	static double area(double radius) {
		double area=0.0;
		area=Math.PI * radius * radius;
		return area;
		
	}
	//rectangle
	/**
	 * @param length
	 * @param breadth
	 * @return
	 */
	static int area(int length,int breadth) {
		int area=0;
		area=length*breadth;
		return area;
		
	}
	//square
	/**
	 * @param side
	 * @return
	 */
	static int area(int side) {
		int area=0;
		area=side*side;
		return area;
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//circle
		System.out.println("Area of Circle " + area(20.0));
		//rectangle
		System.out.println("Area of Rectangle " + area(10,20));
		//square
		System.out.println("Area of Square " + area(10));

	}

}
