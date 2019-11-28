package javaks;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main1 
{
	static int room=0;
	int h=0;
	static Scanner s=new Scanner(System.in);
	void CheckStatus(int roomID)
	{
		int f=roomID;
		Book boo = new Book();
		int[] ary = boo.getNumArray();
  if(boo.arr[f-1]==1)
	  System.out.print("Room is booked\n");
  else
	  System.out.print("Room is not booked\n");
}
public static void main(String args[])throws IOException
{
		do 
		{
			System.out.println("\tMenu\n1. Book\n2. Check Status\n3. Exit\nEnter your choice:");
			int choice=s.nextInt();
			switch(choice)
			{
			case 2:System.out.println("Enter room number");
				int num=s.nextInt();
				Main1 c=new Main1();
				c.CheckStatus(num);
				break;
			case 1:Book b=new Book();
				String ac="null";
				String cot="null";
				String cable="null";
				String wf="null";
				String laundry="null";
				b.book(ac,cot,cable,wf,laundry);	 
				break;
			case 3:
				System.exit(0);
				break;
			default:break;
			}
		}
		while(true);
	}
}

