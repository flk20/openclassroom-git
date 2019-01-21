public class App{

	
	private Strinf text;

	public App(String text){
		this.text = text;
	}


	public void sayHello(String text){
		System.out.println(this.text);
	}

	public static void main(String[] args) {
		
		App test = new App("Hello");
		test.sayHello;

	}
}