import java.util.Scanner;
public class Assignment4_5
{
    public static void main(String[] args) 
	{
		System.out.print("Enter 3 integers A B C: ");
		Scanner sc = new Scanner(System.in);
		String x = sc.next();
		String y = sc.next();
		String z = sc.next();
		Integer wrprObj =  Integer.valueOf(x);
		int a = wrprObj.intValue();
		wrprObj = Integer.valueOf(y);
		int b = wrprObj.intValue();
		wrprObj = Integer.valueOf(z);
		int c = wrprObj.intValue();
		String res;
		if (a > b)
		{
			if (a > c)
				res = "A";
			else
				res = "C";
		}
		else
		{
			if (b > c)
				res = "B";
			else
				res = "C";
		}
		System.out.print(res + " is the greatest integer");
    }
}