package P3_ReferenceTypes;

import java.util.Scanner;

public class Ex2_PrimeNumberSingle {
	
	int number;
	Ex2_PrimeNumberRange range;

	public Ex2_PrimeNumberRange getRange() {
		return range;
	}

	public void setRange(Ex2_PrimeNumberRange range) {
		this.range = range;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	public void checkPrime()
	{
		this.range.checkRange();
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("For single number to find prime number");
		
		System.out.println("Enter the number to check ?");
		number = in.nextInt();
		int temp=0;
		
		for(int i=2;i<number/2;i++)
		{
			if(number%2==0)
			{
				temp = temp+1;
			}
		}
		if(temp==0)
		{
			System.out.println("Prime Number "+number);
		}
		else
		{
			System.out.println("Non=Prime Number "+number);
		}
	}
	

}
