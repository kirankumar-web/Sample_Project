package Revesion_javaPackage;

public class ControlStatements_IF 
{
	public static void main(String[] args) 
	{
		int x=10;
		int y=15;
		//if statement
		if (x-y<=20)// if the condition is true then execute the next step
		{
			System.out.println("x+y is graterthan 20 then the actual vlaue is "+(x+y));
		}
		//if-else statement
		if (x+y>=20) // if the condition is true then execute next statement or else block execute
		{
			System.out.println(x+y);
		} 
		else 
		{
          System.out.println("x+y is greaterthan 20");
		}
		//if-else-if ladder statement
		if (x*y<=100) // if statement true execute next line or else if condition1
		{
			System.out.println("The X*Y value equals to 100");
		} 
		else if(x+y>30) //else if statement true execute next line or else if condition2
		{
			System.out.println("The X+Y value equals to 30");
        }
		else //when all the conditions false then next execute next line
		{
			System.out.println("the x-y value is "+(y-x));
		}
		String city="hyderabad";
		if (city=="delhi") 
		{
			System.out.println("city is delhi");
		} else if (city=="banglore")
		{
			System.out.println("city is banglore");

		}
		else if(city=="chennai")
		{
			System.out.println("city is chennai");

		}
		else
		{
			System.out.println("city is "+city);

		}
		//Nested if-Statement
		String address= "hyd,india";
		if (address.contains("india"))
		{
			if (address.contains("vizag")) 
			{
				System.out.println("your city is vizag");
			}
			else if (address.contains("chennai"))
			{
				System.out.println("your city is chennai");
			}
		else
		{
			System.out.println(address.split(",")[0]);
		}
		}
		else
		{
			System.out.println("invalid address");
		}
	}

}
