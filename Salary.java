package calculator;
import java.util.Scanner;
public class Salary 
{

	public static void main(String[] args)
	{
		int hra,sa,pf,nps,bs;
		System.out.println("Enter your basic salary:");
		Scanner s=new Scanner(System.in);
		bs=s.nextInt();
		hra=(50*bs)/100;
		sa=(75*bs)/100;
		pf=(12*bs)/100;
		nps=bs+hra+sa-pf;
		System.out.println("Basic Salary      ="+bs);
		System.out.println("HRA               ="+hra);
		System.out.println("Special Allowance ="+sa);
		System.out.println("PF                ="+pf);
		System.out.println("------------------------");
		System.out.println("Net Payable Salary="+nps);

	}

}
