/**
 * Q1. Constructor Call Order
class Test {
    Test() {
        System.out.println("A");
    }

    Test(int x) {
        this();
        System.out.println("B");
    }

    Test(int x, int y) {
        this(x);
        System.out.println("C");
    }

    public static void main(String[] args) {
        new Test(10, 20);
    }
}
â“ Predict Output

ðŸ‘‰ Think: constructor chaining flow
 */
package assignments;
class Test {
    Test() {
        System.out.println("A");
    }

    Test(int x) {
        this();
        System.out.println("B  "+ x);
    }

    Test(int x, int y) {
        this(20);
        System.out.println("C");
    }
}
/**
 * 
 */
public class DailyAssignement18_ThisKeyword {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Test(10, 20);
	}

}
