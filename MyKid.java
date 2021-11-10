package week1.day2;

public class MyKid {

	public static void main(String[] args) {
		MyMobile mobl = new MyMobile();
		
		mobl.makeCall();
		mobl.sendMsg();
		//mobl.paybills(); //Private method cannot be called out of class
		System.out.println(mobl.brand);
		System.out.println(mobl.model);
	}

}
