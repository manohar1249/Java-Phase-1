import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		StringMatch sm = new StringMatch();
		System.out.println("enter a email");
		String email = s.nextLine();
		sm.setEmail(email);
		sm.match();
	}

}
