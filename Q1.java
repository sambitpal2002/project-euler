   //Multiples of 3 and 5

/*If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
Find the sum of all the multiples of 3 or 5 below 1000.
*/


public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;    //for sum
		
		for (int i=1;i<1000;i++) {    // i->  taking value from 1  to 999
			if(i%3==0 || i%5==0) {      // to see i is divisible by 3 or 5   by remainder ==0
				sum=sum+i;
			}
		}
		
		System.out.println("The sum multiple of 3 or 5  are : "+sum);

	}

}
//OUTPUT:233168