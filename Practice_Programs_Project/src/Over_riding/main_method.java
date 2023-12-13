package Over_riding;

import java.util.Scanner;

public class main_method {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int a,b,c;
		Over_riding1 o=new Over_riding1();
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("Enterfirst value:"+a);
		b=sc.nextInt();
		System.out.println("Enterfirst value:"+b);
		o.level_2();
		
		
		

	}

}
