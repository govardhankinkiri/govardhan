package day1;
class HelloWorld {
	String getMessage (){
		return "Hello World!" ;
	}
	
}

public class LaunchHelloWorld {
	public static void main(String[] args) {
		HelloWorld h =new HelloWorld();
		System.out.println(h.getMessage());
		
	}
}
