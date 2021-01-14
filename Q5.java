
/*
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */

public class Q5 {
	private static boolean div(int a) {
		int b=0;
	    for(int i=1;i<=20;i++) 
	{
		if(a%i==0) {
			b++;
		}
	}
	if(b==20)
		return true;
	else 
		return false;
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=20;i>=1;i+=20) {
			if(div(i)) {
				System.out.println(i);
				break;
			}

	
		}
	}
}
//OUTPUT:232792560
