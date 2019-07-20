//
//					Gaming Cafe Management System
//								coded by- Anowar Hussain
//


import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.io.*;
import java.util.*;


class gcafe
{
	public static void main(String args[])
	{
		gcafe gcf=new gcafe();
		gcf.sysinti();
		Scanner in=new Scanner(System.in);
		while(true)
		{
		gcf.clrs();
		System.out.print("\n\tTotal Customers today: "+tc+"\n\n\n\n");
		System.out.print("\n\n1: Available Systems\t2:Register\t3: Available games\t4:Checkout\t5: System Status\t6:Logout\n\n");
		System.out.print("\nUser >>  ");
		int choice=in.nextInt();
		switch(choice)
		{
			case 1:
				gcf.clrs();
				System.out.print("\n\t\t\t\t\t\tSystems Available\n");
				gcf.systems();
				gcf.exits();
				break;
			case 2:
				try{
				gcf.syst();
				}
				catch(Exception e)
				{
					System.out.print("\n\n;( Invalid Input ;(");
					gcf.exits();
				}
				break;
			case 3:
			gcf.clrs();
				System.out.print("\n\t\t\t\t\t\tGames Available\n");
				gcf.games();
				break;
			case 4:
			gcf.clrs();
				System.out.print("\n\t\t\t\t\t\tCheckout\n");
				try{
				gcf.callbill();
				}
				catch(Exception e)
				{
					System.out.print("\n\n;( Invalid Input ;(");
					gcf.exits();
				}
				break;
			case 5:
			gcf.clrs();
				System.out.print("\n\t\t\t\t\t\tSystem Search\n");
			try{
				gcf.sname();
				}
				catch(Exception e)
				{
					System.out.print("\n\n;( Invalid Input ;(");
				}
				break;
			case 6: 
				gcf.clrs();
				gcf.logout();
				break;
			default:
				System.out.print("\nInvalid Input Press Enter to return\n\n");
				break;
		}
		}
	}
	
	public static Scanner in=new Scanner(System.in);
	public static gcafe gcf=new gcafe();
	
	public static LocalDate date=LocalDate.now();
	public static DateTimeFormatter dateonly= DateTimeFormatter.ofPattern("dd-MM-yyyy");
	public static String foldername=date.format(dateonly);
	
	public static int pc[]=new int[10];
	public static int ps4[]=new int[5];
	public static int xbox[]=new int[5];
	public static int vr[]=new int[3];
	public static String name[]=new String[555];
	public static String gtag[]=new String[555];
	public static String ph[]=new String[555];
	public static int ind=0;
	public static int ti[]=new int[555];
	public static int upc[]=new int[555];
	public static int usy[]=new int[555];
	public static int tc=0;
	public static float totalcash=0; 
	public static int tcp=0;
	public static int tcps=0;
	public static int tcx=0;
	public static int tcv=0;
	public static int tpct=0;
	public static int tps4t=0;
	public static int txboxt=0;
	public static int tvrt=0;
	public static String custime[]=new String[555];
	public static String cuetime[]=new String[555];
	public static int pccus[]=new int[555];
	public static int ps4cus[]=new int[555];
	public static int xboxcus[]=new int[555];
	public static int vrcus[]=new int[555];
	
	void clrs()   //Clears screen for CLI interface using cmd
	{
		try
		{
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
		System.out.print("\n\n\n--------------------------------------------------------------------------------------------------------------------");
		System.out.print("\t\t\t\t\t\t\tSkyBoy's Game Cafe");
		System.out.print("\n--------------------------------------------------------------------------------------------------------------------\n\n");
	}
	
	void exits()   //For press any key to continue
	{
		try
		{
			System.out.print("\n\n\tPress Enter to continue ");
			System.in.read();
		}
		catch(Exception e)
		{
			System.out.print(e);
		}
	}
	
	void systems()   //Shows all systems currently available
	{
		System.out.print("\n\n\n\n\t\t\t\t\tPCs Available: \n\n");
		for(int i=0;i<10;i++)
		{
			
			if(pc[i]==0)
			{
				System.out.print("\tPC-"+(i+1));
			}
		}
		System.out.print("\n\n\n\n\t\t\t\t\tPS4s Available: \n\n");
		for(int i=0;i<5;i++)
		{
			
			if(ps4[i]==0)
			{
				System.out.print("\tPS4-"+(i+1));
			}
		}
		System.out.print("\n\n\n\n\t\t\t\t\tXBOXs Available: \n\n");
		for(int i=0;i<5;i++)
		{
			
			if(xbox[i]==0)
			{
				System.out.print("\tXBOX-"+(i+1));
			}
		}
		System.out.print("\n\n\n\n\t\t\t\t\tVRs Available: \n\n");
		for(int i=0;i<3;i++)
		{
			
			if(vr[i]==0)
			{
				System.out.print("\tVR-"+(i+1));
			}
		}
		   
		System.out.print("\n\n");
		
		
	}
	
	void sysinti()  //frees all system, runs only once at the startup
	{
		for(int i=0;i<10;i++)
		{
			pc[i]=0;
		}
		for(int i=0;i<5;i++)
		{
			ps4[i]=0;
		}
		for(int i=0;i<5;i++)
		{
			xbox[i]=0;
		}
		for(int i=0;i<3;i++)
		{
			vr[i]=0;
		}
		
		
		
		new File(foldername).mkdir();
		
	}
	
	void games()	//shows all games available
	{
		System.out.print("\n\n");
		System.out.print("\n\n\n\t\t\t\tGames available\n\n\n");
		System.out.print("\n\nPC games:\n\n");
		System.out.print("\tFortnite\tApex Legends\tCS-GO\tPUBG");
		System.out.print("\n\nPS4 games:\n\n");
		System.out.print("\tSpiderman\tOutlast\tFortnite\tApex Legends\tCS-GO\tPUBG");
		System.out.print("\n\nXBOX Games\n\n");
		System.out.print("\tMinecraft\tFortnite\tApex Legends\tCS-GO\tPUBG");
		System.out.print("\n\nVR Games\n\n");
		System.out.print("\tSuper HOT");
		System.out.print("\n\n");
		
		 gcf.exits();  
	}
	
	void syst()		//starts registration 
	{
		gcf.clrs();
		System.out.print("\n\t\t\t\t\tREGISTRAION");
		gcf.systems();
		System.out.print("\n\n\n\n\nCustomer No.: "+(ind+1));
		System.out.print("\n\t1:PC\t2:PS4\t3:XBOX\t4:VR\t5:Cancel");
		System.out.print("\nChoose a System: ");
		System.out.print("\nUser >>  ");
		int a=in.nextInt();
		switch(a)
	{
		case 1:
			try{
			pcs();
			}
			catch(Exception e)
			{
				System.out.print("\n\n;( Invalid Input ;(");
				gcf.exits();
			}
			break;
		case 2:	
			try
			{
				ps4s();
			}
			catch(Exception e)
			{
				System.out.print("\n\n;( Invalid Input ;(");
				gcf.exits();
			}
			break;
		case 3:
			try
			{
				xboxs();
			}
			catch(Exception e)
			{
				System.out.print("\n\n;( Invalid Input ;(");
				gcf.exits();
			}
			break;
		case 4:	
			try
			{
				vrs();
			}
			catch(Exception e)
			{
				System.out.print("\n\n;( Invalid Input ;(");
				gcf.exits();
			}
			break;
		case 5: 
			break;
		default:System.out.print("\n\n;( Invalid Input ;(");
				gcf.exits();
		break;
	}	
	}
	void pcs()
	{
		gcafe al=new gcafe();
		System.out.print("Enter System Number: ");
		System.out.print("\nUser >>  ");
		int b=in.nextInt();
		switch(b)
	{
		case 1:	
			if(pc[0]==0)
			{
				pc[0]=1;
				al.alloca(1,1);
				pccus[0]=ind;
			}
			else
			{
				System.out.print("\nSystem is busy");
				syst();
			}
			break;
		case 2:	
			if(pc[1]==0)
			{
				pc[1]=1;
				al.alloca(1,2);
				pccus[1]=ind;
			}
			else
			{
				System.out.print("\nSystem is busy");
				syst();
			}
			break;
		case 3:	
			if(pc[2]==0)
			{
				pc[2]=1;
				al.alloca(1,3);
				pccus[2]=ind;
			}
			else
			{
				System.out.print("\nSystem is busy");
				syst();
			}
			break;
		case 4:	
			if(pc[3]==0)
			{
				pc[3]=1;
				al.alloca(1,4);
				pccus[3]=ind;
			}
			else
			{
				System.out.print("\nSystem is busy");
				syst();
			}
			break;
		case 5:	
			if(pc[4]==0)
			{
				pc[4]=1;
				al.alloca(1,5);
				pccus[4]=ind;
			}
			else
			{
				System.out.print("\nSystem is busy");
				syst();
			}
			break;
		case 6:	
			if(pc[5]==0)
			{
				pc[5]=1;
				al.alloca(1,6);
				pccus[5]=ind;
			}
			else
			{
				System.out.print("\nSystem is busy");
				syst();
			}
			break;
		case 7:	
			if(pc[6]==0)
			{
				pc[6]=1;
				al.alloca(1,7);
				pccus[6]=ind;
			}
			else
			{
				System.out.print("\nSystem is busy");
				syst();
			}
			break;
		case 8:	
			if(pc[7]==0)
			{
				pc[7]=1;
				al.alloca(1,8);
				pccus[7]=ind;
			}
			else
			{
				System.out.print("\nSystem is busy");
				syst();
			}
			break;
		case 9:	
			if(pc[8]==0)
			{
				pc[8]=1;
				al.alloca(1,9);
				pccus[8]=ind;
			}
			else
			{
				System.out.print("\nSystem is busy");
				syst();
			}
			break;
		case 10:	
			if(pc[9]==0)
			{
				pc[9]=1;
				al.alloca(1,10);
				pccus[9]=ind;
			}
			else
			{
				System.out.print("\nSystem is busy");
				syst();
			}
			break;
		default:
		System.out.print("\n\n;( Invalid Input ;(");
				gcf.exits();
		break;
			
	}
	}
	void ps4s()
	{
		gcafe al=new gcafe();
		System.out.print("Enter System Number: ");
		System.out.print("\nUser >>  ");
		int c=in.nextInt();
		switch(c)
		{
			case 1:	
			if(ps4[0]==0)
			{
				ps4[0]=1;
				al.alloca(2,1);
				ps4cus[0]=ind;
			}
			else
			{
				System.out.print("\nSystem is busy");
				syst();
			}
			break;
			case 2:	
			if(ps4[1]==0)
			{
				ps4[1]=1;
				al.alloca(2,2);
				ps4cus[1]=ind;
			}
			else
			{
				System.out.print("\nSystem is busy");
				syst();
			}
			break;
			case 3:	
			if(ps4[2]==0)
			{
				ps4[2]=1;
				al.alloca(2,3);
				ps4cus[2]=ind;
			}
			else
			{
				System.out.print("\nSystem is busy");
				syst();
			}
			break;
			case 4:	
			if(ps4[3]==0)
			{
				ps4[3]=1;
				al.alloca(2,4);
				ps4cus[3]=ind;
			}
			else
			{
				System.out.print("\nSystem is busy");
				syst();
			}
			break;
			case 5:	
			if(ps4[4]==0)
			{
				ps4[4]=1;
				al.alloca(2,5);
				ps4cus[4]=ind;
			}
			else
			{
				System.out.print("\nSystem is busy");
				syst();
			}
			break;
		default:
		System.out.print("\n\n;( Invalid Input ;(");
				gcf.exits();
		break;
		}
	}
	void xboxs()
	{
		gcafe al=new gcafe();
		System.out.print("Enter System Number: ");
		System.out.print("\nUser >>  ");
		int d=in.nextInt();
		switch(d)
		{
			case 1:	
			if(xbox[0]==0)
			{
				xbox[0]=1;
				al.alloca(3,1);
				xboxcus[0]=ind;
			}
			else
			{
				System.out.print("\nSystem is busy");
				syst();
			}
			break;
			case 2:	
			if(xbox[1]==0)
			{
				xbox[1]=1;
				al.alloca(3,2);
				xboxcus[1]=ind;
			}
			else
			{
				System.out.print("\nSystem is busy");
				syst();
			}
			break;
			case 3:	
			if(xbox[2]==0)
			{
				xbox[2]=1;
				al.alloca(3,3);
				xboxcus[2]=ind;
			}
			else
			{
				System.out.print("\nSystem is busy");
				syst();
			}
			break;
			case 4:	
			if(xbox[3]==0)
			{
				xbox[3]=1;
				al.alloca(3,4);
				xboxcus[3]=ind;
			}
			else
			{
				System.out.print("\nSystem is busy");
				syst();
			}
			break;
			case 5:	
			if(xbox[4]==0)
			{
				xbox[4]=1;
				al.alloca(3,5);
				xboxcus[4]=ind;
			}
			else
			{
				System.out.print("\nSystem is busy");
				syst();
			}
			break;
		default:
		System.out.print("\n\n;( Invalid Input ;(");
				gcf.exits();
		break;
		}
	}
	void vrs()
	{
		gcafe al=new gcafe();
		System.out.print("Enter System Number: ");
		System.out.print("\nUser >>  ");
		int e=in.nextInt();
		switch(e)
		{
			case 1:	
			if(vr[0]==0)
			{
				vr[0]=1;
				al.alloca(4,1);
				vrcus[0]=ind;
			}
			else
			{
				System.out.print("\nSystem is busy");
				syst();
			}
			break;
			case 2:	
			if(vr[1]==0)
			{
				vr[1]=1;
				al.alloca(4,2);
				vrcus[1]=ind;
			}
			else
			{
				System.out.print("\nSystem is busy");
				syst();
			}
			break;
			case 3:	
			if(vr[2]==0)
			{
				vr[2]=1;
				al.alloca(4,3);
				vrcus[2]=ind;
			}
			else
			{
				System.out.print("\nSystem is busy");
				syst();
			}
			break;
			default:
			System.out.print("\n\n;( Invalid Input ;(");
				gcf.exits();
			break;
		}
	}
	
	void alloca(int a,int b)  		//registration input
	{
	Scanner in=new Scanner(System.in);
	System.out.print("\n\n\nEnter name: ");
	System.out.print("\nUser >>  ");
	name[ind]=in.nextLine();
	System.out.print("\nEnter gamertag: ");
	System.out.print("\nUser >>  ");
	gtag[ind]=in.nextLine();
	System.out.print("\nEnter Ph. no: ");
	System.out.print("\nUser >>  ");
	ph[ind]=in.next();
	System.out.print("\nEnter Time limit in hours: ");
	System.out.print("\nUser >>  ");
	ti[ind]=in.nextInt();
	System.out.print("\n\n\n\t\tCustomer number: "+(ind+1)+"\t\tPlease note this number for checkout process");
	
	LocalDateTime starttime = LocalDateTime.now();
	DateTimeFormatter fdtime=DateTimeFormatter.ofPattern("HH:mm:ss dd-MM-yyyy");
	custime[ind]=starttime.format(fdtime);
	LocalDateTime endtime = starttime.plusHours(ti[ind]);
	cuetime[ind]=endtime.format(fdtime);
	
	System.out.print("\n\t\tStart time: "+custime[ind]);
	System.out.print("\n\t\tEnd time: "+cuetime[ind]);
	System.out.print("\n\n\n");
	gcf.exits();
	
	switch(a)
	{
		case 1:
			tcp++;
			tpct+=ti[ind];
			break;
		case 2:
			tcps++;
			tps4t+=ti[ind];
			break;
		case 3:
			tcx++;
			txboxt+=ti[ind];
			break;
		case 4:
			tcv++;
			tvrt+=ti[ind];
			break;
		default:
			break;
	}
	
	upc[ind]=a;
	usy[ind]=b;
	ind++;
	tc++;
	
		   
	}
	void bill(int num,int sy,int nu,int ut)  		//billing
	{
		
		int z=num+1;
		String filename=Integer.toString(z);
			
		try
		{
			
		
		
		String pat=(foldername+"/Customer No. "+filename+".txt");
		FileOutputStream fo=new FileOutputStream(pat);
		fo.close();
		FileWriter fw=new FileWriter(pat);
		
	
		
		
		System.out.print("\n\t\t\t\t\tReceipt");
		fw.write("\n\t\t\t\t\tReceipt");
		System.out.print("\n\t\t\t"+name[num]);
		fw.write("\n\t\t\t"+name[num]);
		System.out.print("\n\t\t\tPh. no.: "+ph[num]);
		fw.write("\n\t\t\tPh. no.: "+ph[num]);
		float rs;
		switch(sy)
		{
			case 1: System.out.print("\n\t\t\tSystem: PC "+nu);
					System.out.print("\n\t\t\tCharge per hour: Rs 50");
					System.out.print("\n\t\t\tTime: "+ut+" Hours");
					rs=ut*50;
					System.out.print("\n\t\t\tAmount Charged: Rs "+rs);
					pc[nu-1]=0;
					fw.write("\nSystem: PC "+nu);
					fw.write("\nCharge per hour: Rs 50");
					fw.write("\nTime: "+ut+" Hours");
					fw.write("\nAmount Charged: Rs "+rs);
					totalcash+=rs;
					break;
			case 2: System.out.print("\n\t\t\tSystem: PS4 "+nu);
					System.out.print("\n\t\t\tCharge per hour: Rs 70");
					System.out.print("\n\t\t\tTime: "+ut+" Hours");
					rs=ut*70;
					System.out.print("\n\t\t\tAmount Charged: Rs "+rs);
					ps4[nu-1]=0;
					fw.write("\nSystem: PS4 "+nu);
					fw.write("\nCharge per hour: Rs 70");
					fw.write("\nTime: "+ut+" Hours");
					fw.write("\nAmount Charged: Rs "+rs);
					totalcash+=rs;
					break;
			case 3: System.out.print("\n\t\t\tSystem: XBOX "+nu);
					System.out.print("\n\t\t\tCharge per hour: Rs 70");
					System.out.print("\n\t\t\tTime: "+ut+" Hours");
					rs=ut*70;
					System.out.print("\n\t\t\tAmount Charged: Rs "+rs);
					xbox[nu-1]=0;
					fw.write("\nSystem: XBOX "+nu);
					fw.write("\nCharge per hour: Rs 70");
					fw.write("\nTime: "+ut+" Hours");
					fw.write("\nAmount Charged: Rs "+rs);
					totalcash+=rs;
					break;
			case 4: System.out.print("\n\t\t\tSystem: VR "+nu);
					System.out.print("\n\t\t\tCharge per hour: Rs 100");
					System.out.print("\n\t\t\tTime: "+ut+" Hours");
					rs=ut*100;
					System.out.print("\n\t\t\tAmount Charged: Rs "+rs);
					vr[nu-1]=0;
					fw.write("\nSystem: VR "+nu);
					fw.write("\nCharge per hour: Rs 100");
					fw.write("\nTime: "+ut+" Hours");
					fw.write("\nAmount Charged: Rs "+rs);
					totalcash+=rs;
					break;
			default:break;
		}
		
		
		
		fw.close();
		
		}
		catch(Exception e)
		{
			System.out.print("\nFile doesn't Exist");
		}
		
		
		   
		
		System.out.print("\n\n\n");
		gcf.exits();
	}
	void callbill()		//used to call bill of a particular customer
	{
		Scanner in=new Scanner(System.in);
		gcafe gcf=new gcafe();
		System.out.print("\n\nEnter User number: ");
		System.out.print("\nUser >>  ");
		int a=in.nextInt();
		gcf.bill(a-1,upc[a-1],usy[a-1],ti[a-1]);
	}
	void sname()		//search system
	{
		System.out.print("\n\t1:PC\t2:PS4\t3:XBOX\t4:VR\t5:Cancel");
		System.out.print("\n\nEnter System: ");
		int s=in.nextInt();
		System.out.print("\nEnter System number: ");
		int sn=in.nextInt();
		switch(s)
		{
			case 1:
				if(pc[sn-1]==1)
				{
					System.out.print("\n\nSystem is Occupied");
					System.out.print("\nCustomer Number: "+pccus[sn-1]);
					System.out.print("\nName: "+name[pccus[sn-1]-1]);
					System.out.print("\nStart Time: "+custime[pccus[sn-1]-1]);
					System.out.print("\nEnd Time: "+cuetime[pccus[sn-1]-1]);
					
				}
				else
				{
					System.out.print("\nSystem is Free");
				}
				break;
			case 2:
				
				if(ps4[sn-1]==1)
				{
					System.out.print("\n\nSystem is Occupied");
					System.out.print("\nCustomer Number: "+ps4cus[sn-1]);
					System.out.print("\nName: "+name[ps4cus[sn-1]-1]);
					System.out.print("\nStart Time: "+custime[ps4cus[sn-1]-1]);
					System.out.print("\nEnd Time: "+cuetime[ps4cus[sn-1]-1]);
					
				}
				else
				{
					System.out.print("\nSystem is Free");
				}
				break;
			case 3:
				
				if(xbox[sn-1]==1)
				{
					System.out.print("\n\nSystem is Occupied");
					System.out.print("\nCustomer Number: "+xboxcus[sn-1]);
					System.out.print("\nName: "+name[xboxcus[sn-1]-1]);
					System.out.print("\nStart Time: "+custime[xboxcus[sn-1]-1]);
					System.out.print("\nEnd Time: "+cuetime[xboxcus[sn-1]-1]);
					
				}
				else
				{
					System.out.print("\nSystem is Free");
				}
				break;
			case 4:
					
				if(vr[sn-1]==1)
				{
					System.out.print("\n\n ;(  System is Occupied  ;(");
					System.out.print("\nCustomer Number: "+vrcus[sn-1]);
				System.out.print("\nName: "+name[vrcus[sn-1]-1]);
					System.out.print("\nStart Time: "+custime[vrcus[sn-1]-1]);
					System.out.print("\nEnd Time: "+cuetime[vrcus[sn-1]-1]);
					
				}
				else
				{
					System.out.print("\nSystem is Free");
				}
				break;
			default:
			System.out.print("\nWrong input");
		}
		gcf.exits();
		   
	}
	void logout()		//logsout and closes system also shows end application report
	{
		System.out.print("\nConfirm logout? 1:Yes\t2:No\n");
		System.out.print("\nUser >>  ");
		int p=in.nextInt();
		if(p==1)
		{
			gcf.clrs();
			System.out.print("\n\n\t\t\t\tEnd of the Day Report");
			System.out.print("\n\n\n\t\tTotal number of Customer: "+tc);
			System.out.print("\n\n\t\tTotal PC Customer: "+tcp);
			System.out.print("\n\t\tToal time spend on PC: "+tpct);
			System.out.print("\n\n\t\tTotal PS4 Customer: "+tcps);
			System.out.print("\n\t\tToal time spend on PS4: "+tps4t);
			System.out.print("\n\n\t\tTotal XBOX Customer: "+tcx);
			System.out.print("\n\t\tToal time spend on XBOX: "+txboxt);
			System.out.print("\n\n\t\tTotal VR Customer: "+tcv);
			System.out.print("\n\t\tToal time spend on VR: "+tvrt);
			System.out.print("\n\n\n\t\tToday's Total Cash: "+totalcash);
			try
			{
				String sav=(foldername+"/report.txt");
				FileOutputStream fo=new FileOutputStream(sav);
				fo.close();
				FileWriter fw2=new FileWriter(sav);
				
				fw2.write("\n\n\t\t\t\tEnd of the Day Report");
				fw2.write("\n\n\n\t\tTotal number of Customer: "+tc);
				fw2.write("\n\n\t\tTotal PC Customer: "+tcp);
				fw2.write("\n\t\tToal time spend on PC: "+tpct);
				fw2.write("\n\n\t\tTotal PS4 Customer: "+tcps);
				fw2.write("\n\t\tToal time spend on PS4: "+tps4t);
				fw2.write("\n\n\t\tTotal XBOX Customer: "+tcx);
				fw2.write("\n\t\tToal time spend on XBOX: "+txboxt);
				fw2.write("\n\n\t\tTotal VR Customer: "+tcv);
				fw2.write("\n\t\tToal time spend on VR: "+tvrt);
				fw2.write("\n\n\n\t\tToday's Total Cash: "+totalcash);
				fw2.close();
			}
			catch(Exception e)
			{
				System.out.print("\nFile doesn't Exist");
			}
			System.out.print("\n\n\n\t\t\t\tEnd Program...\n\n");
			gcf.exits();
			System.out.print("\n\n");
			
			System.exit(0);
		}
		else{
			gcf.exits();
		}
	}
}