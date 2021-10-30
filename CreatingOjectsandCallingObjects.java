package week1.day1;

public class CreatingOjectsandCallingObjects {

// mobile phone
	String mobile_name;
	String ram;
	int memory;
	
	public void printMobileName() {
		System.out.println(mobile_name);
	}
	
	public void printMobileram() {
		System.out.println(ram);
	}
	
	public void printMobilememory() {
		System.out.println(memory);
	}
	
	public static void main(String[] args) {
		CreatingOjectsandCallingObjects onepls = new CreatingOjectsandCallingObjects();
		onepls.mobile_name = "ONE PLUS 1+";
		onepls.ram = "12 GB";
		onepls.memory = 256;
		
		onepls.printMobileName();
		onepls.printMobilememory();
		onepls.printMobileram();
	}

}
