
package week1.day2;

import java.lang.reflect.Method;
import java.security.PublicKey;

public class MyMobile {
	String brand = "One Plus";
	String model = "7T";
	boolean iswirelesscharging;
	
	public void makeCall() {
		 System.out.println("Making Calls");
	}
	
	public void sendMsg() {
		System.out.println("Sending Message");
	}
	
	private void paybills() {
		System.out.println("Paying Bills");
	}
	
	public boolean charging() {
		iswirelesscharging = true;
		return iswirelesscharging;
	}
	public static void main(String[] args) {
		
		MyMobile mob = new MyMobile();
			
		mob.makeCall();
		mob.sendMsg();
		mob.paybills();
		
	}

}
