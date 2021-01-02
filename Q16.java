

/*
 * 215 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 21000?
 */
import java.math.BigInteger;
public class Q16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger two = new BigInteger("2");
		BigInteger value = two.pow(1000);
		BigInteger sum= new BigInteger("0");
		BigInteger a= new BigInteger("0");
		while(value.compareTo(a)>0)
		{
			sum=sum.add(value.remainder(new BigInteger("10")));
			value = value.divide(new BigInteger("10"));
		}
		System.out.println(sum);

		
	}

}
//output: 1366
