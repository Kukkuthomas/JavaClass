package javaks;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Book
{
	int d=0;
	static int room=0;
	String ac;
	String cot;
	String cable;
	String wf;
	String laundry;
	static int arr[]=new int[25];
	void book(String ac,String cot,String cable,String wf,String laundry) throws IOException
	{
		for(int i=room;i<25;i++)
		{
			arr[i]=0;
		}
		int cost=0;
		String c;
		this.ac= ac;
		this.cot= cot;
		this.cable= cable;
		this.wf= wf;
		this.laundry= laundry;
		System.out.println("\tBOOKING");
		System.out.println("\t========");
		do
		{
			cost=0;
			System.out.println("Please choose the services required.");
			System.out.println("AC/non-AC(AC/nAC)");
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			ac=in.readLine();
			if(ac.equals("AC"))
				cost=cost+1000;
			else
				cost=cost+750;
			System.out.println("Cot(Single/Double)");
			cot=in.readLine();
			if(cot.equals("Single"))
				cost=cost+0;
			else
				cost=cost+350;
			System.out.println("With cable connection/Without cable connection(C/nC)");
			cable=in.readLine();
			if(cable.equals("C"))
			{
				cost=cost+50;
				cable="cable";
			}
			System.out.println("Wi-Fi needed or not(W/nW)");
			wf=in.readLine();
			if(wf.equals("W"))
			{
				cost=cost+200;
				wf="wifi";
			}
			System.out.println("Laundry service needed or not(L/nL)");
			laundry=in.readLine();
			if(laundry.equals("L"))
			{
				cost=cost+100;
				laundry="laundry";
			}
			System.out.println("\nThe total charge is Rs." +cost);
			System.out.println("The services chosen are");
			System.out.println(cot+" cot "+ac+ " room");
			System.out.println(cable+" enabled");
			System.out.println(wf+" enabled");
			System.out.println("with " + laundry+ " service");
			System.out.println("Do you want to proceed?(yes/no)");
			c=in.readLine();
		}
		while(c.equals("no"));
		System.out.println("....Thank you for booking.... \nYour room number is "+ ++room+"\n");
		arr[room-1]=1;
	}

	public int[] getNumArray() 
	{
		return arr.clone();
	}
}
