/*
 * The sum of the squares of the first ten natural numbers is,

The square of the sum of the first ten natural numbers is,

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is .

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.


 */
	

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=100;
		double s1=Math.pow((x*(x+1)/2),2);
	    double s2=x*(x+1)*(2*x+1)/6;
		System.out.println("(1+2+3+...+k)^2="+(int)s1);
		System.out.println("1^2+2^2+3^2+...+k^2="+(int)s2);
		System.out.println("Reqired difference="+(int)(s1-s2));

	}

}
//OUTPUT:  25164150
