
public class switchdemo {

	public static void main(String[] args) {
		char x = 'a';
		switch(x) {
		case'l':
			
		case 'L':
			System.out.println(x+ "is letter");
		case'd':
			System.out.println(x + "is digit");
			break;
			default:
				System.out.println(x +"digit");
				break;
		}

	}

}
