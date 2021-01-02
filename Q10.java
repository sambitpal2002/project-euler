/*
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
 */
public class Q10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		long i,num,count;
		long sum=0;
		
		for (num=2;num<2000000;num++) 
		{
			count=0;
			for (i=2;i<num/2;i++) 
			{
				if(num%i==0) {
					count++;
					break;
				}
			}
			if(count==0 && num!=1) {
				sum=sum+num;
			}
		
		}
		System.out.println("The Sum of Prime Number below 2Million = "+sum);

	}

}

//OUTPUT: The Sum of Prime Number below 2Million = 142913828926