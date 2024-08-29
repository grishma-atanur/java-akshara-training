 package day36;

import java.util.Scanner;

interface Remote   //Architect will design the remote
 {
	 void powerOnOff();
	 void changeChannel(int n);
	 void info();
 }
 
 class LGTV1 implements Remote  //Dveloper will design the TV
 {
	 private boolean isOn=false; //when u first bring tv it is off
	 private int channel=1;
	  
	@Override
	public void powerOnOff() {
		if(isOn)
		{
			System.out.println("Switching off....");
			isOn=false;
		}
		else
		{
			System.out.println("Switching On...");
			isOn=true;
		}
		
	}

	@Override
	public void changeChannel(int n) {
		if(!isOn)
		{
			System.out.println("TV SHOULD BE SWITCHED ON FIRST"); 
			return;
		}
		{
			
		}
		if(n>=1 && n<=100)
		{
			System.out.println("Changing Channel to :" +n);
			channel=n;
		}
		else
		{
			System.out.println("Invalid channel number");
		}
		
	}
	
public void info()
{
	if(!isOn)
	{
		System.out.println("TV SHOULD BE SWITCHED ON FIRST"); 
		return;
	}
	System.out.println("current channel is : " +channel);
}
 }

public class Demo4 {  //End user will use it
	public static void main(String[] args) {
		Remote r=new LGTV1();
		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Please select the option \n 1.PowerON/Off \n 2.ChangeChannel \n3.Info \n 4.Exit");
			int option=sc.nextInt();
			if (option==1)
			{
				r.powerOnOff();
			}
			
			else if (option==2)
			{
				System.out.println("please enter the channel number to change");
				int n=sc.nextInt();
				r.changeChannel(option);
			}
			else if (option==3)
			{
				r.info();
			}
			
			else if (option==4)
			{
				System.out.println("Thank you");
				break;
			}
			else
			{
				System.out.println("invalid input please try again");
			}
			
			
			System.out.println("Continue? 1-yes, 2-No");
			int  c=sc.nextInt();
			
		}while(true);
		
		sc.close();
		
	}

}
