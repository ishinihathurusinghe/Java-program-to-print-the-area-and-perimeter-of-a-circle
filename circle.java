import java.util.Scanner;


class circle
{
	public static void main(String args[])
	{
		Scanner input = new Scanner(System.in);
		{
			double r;

			System.out.print("Enter a radius :- ");
			r = input.nextDouble();
			
			double perimeter = 2 * Math.PI * r;
			double area = Math.PI * r * r;
			System.out.println("perimeter is " +perimeter);
			System.out.println("area is " +area);
		}
	}
};