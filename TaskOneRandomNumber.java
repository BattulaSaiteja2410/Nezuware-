import java.util.Random;
import java.util.Scanner;

class TaskOneRandomNumber
		{
		public static void main(String[] args) {
			Random random= new Random();
			Scanner sc =new Scanner(System.in);
			System.out.println("Enter the minimum value");
			int min=sc.nextInt();
			System.out.println("Enter the maximum value");
			int max = sc.nextInt();
			int randomValue =random.nextInt(max - min +1)+min;
			int triles= 3;
			for (int i=1;i<=triles;i++ )
			{
				System.out.println("Enter the random value ");
			int userRandomValue=sc.nextInt();
				if (randomValue==userRandomValue)
				{
					System.out.println("Congradulications you guesse is correct and you wow the game");
				}
				else if (triles<=3)
				{
					System.err.println("sorry !! you guesse is worrong ");
					System.out.println("You have chances to guesse the random value");
					System.out.println("Please guesse the random value again....!!Best of luck!!");
				}
				else
				{
					System.err.println("sorry !! all the chances are completed  ");
					System.err.println("Game Over");
				}
			}
	System.out.println("the random value is "+randomValue);
		
	}
	}