package work1.day1;

public class Mobile1 {

	//2 Methods,2 Variables
		//rideCycle,ringBell
		
		//2 Variables (brand,tyreWidth
		
		int batterypercentage=90;
		String model="Samsung";
		
		public void dialcaller() 
		{

			System.out.println("Calling the user");
		}
		public boolean sendSMS()
		{
			return true;
		
		}

		public static void main(String[]args)
		
		{
			Mobile1 obj= new Mobile1();
			obj.dialcaller();
			boolean sendSMS =obj.sendSMS();
			System.out.println(sendSMS);
			System.out.println(obj.batterypercentage);
			System.out.println(obj.model);
		
		}
		}
		