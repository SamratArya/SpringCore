package P1_PrimitveTypes;

import java.util.Scanner;

public class Ex3_ArmstrongNumber {
	
	int num;

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}
	
	public void check()
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number to check ?");
		num = in.nextInt();
		
		int rem,mult=0;
		int temp=num;
		
		
		while(num>0)
		{
			rem = num%10;
			mult = mult + rem*rem*rem;
			num = num/10;
		}
		
		if(temp==mult)
		{
			System.out.println("Armstrong number : "+temp);
		}
		else
		{
			System.out.println("Non-Armstrong number : "+temp);
		}
	}
	

}
