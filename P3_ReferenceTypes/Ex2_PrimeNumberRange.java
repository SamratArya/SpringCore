package P3_ReferenceTypes;

import java.util.Scanner;

public class Ex2_PrimeNumberRange {
	
	int start;
	int end;

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public void checkRange()
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Prime Number in Range");
		
		System.out.println("Enter the start number ");
		start = in.nextInt();
		
		System.out.println("Enter the last number ");
		end = in.nextInt();
		
		int temp=0;
		for(int i = start;i<=end;i++)
		{
			for(int j=1;j<=end;j++)
			{
				if(i%j==0)
				{
					temp++;
				}
			}
			
			if(temp == 2)
			{
				System.out.println(i + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		
		Ex2_PrimeNumberRange e1 = new Ex2_PrimeNumberRange();
		e1.checkRange();
	}

}
