package P4_ConstructorInjection;

public class Ex3_ConstructorOverload {
	
	int a;
	int b;
	
	public Ex3_ConstructorOverload(int a,int b) 
	{
		this.a=a;
		this.b=b;
		System.out.println("Constructor of int :: int ");
	}
	
	public Ex3_ConstructorOverload(double a,double b)
	{
		this.a = (int)a;
		this.b = (int)b;
		System.out.println("Constructor of double :: double ");
	}
	
	public Ex3_ConstructorOverload(String a,String b)
	{
		this.a = Integer.parseInt(a);
		this.b = Integer.parseInt(b);
		System.out.println("Constructor of String :: String");
	}
	
	public void checkSum()
	{
		System.out.println("Value of a : "+this.a);
		System.out.println("Value of b : "+this.b);
		System.out.println("Sum of the number is : "+(this.a+this.b));
	}

}
