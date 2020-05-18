
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User webUser = new User.Builder().firstName("Aditya").firstName("Ado").lastName("Gupta").age("25").email("a@gmail.com").build();
	
		System.out.println(webUser);
	}

}
