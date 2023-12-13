package Over_loading;

public class Over_loading 
{
	
	public void a(int a,int b)
	{
		System.out.println(" Two integers");
	}
	public void a(int a,String s)
	{
		System.out.println("one integer, one string value");
	}
	public void a(int a)
	{
		System.out.println("only one string value");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Over loading");
		Over_loading o= new Over_loading();
		o.a(5,5);
		
	}

}
