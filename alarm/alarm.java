import java.util.Scanner;

public class setalarm2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter bed time");
		int n = sc.nextInt();
		System.out.println("Enter sleeping hours");
		int m = sc.nextInt();
		int a = 0;
		if (m>=0 && m<=24) {
		if (n>=0 && n<=12) {
			a = n+m;
			if (a>12) {
				a = a-12;
				System.out.println("Set alarm to wakeup" +a);
			}
			else if (a<=12) {
				System.out.println("Set alarm to wakeup" +a);
			}
		}
		else if (n>=13 && n<=24) {
			n = n-12;
			a = n+m;
			if (a>12) {
				a = a-12;
				System.out.println("Set alarm to wakeup" +a);
			}
			else if (a<=12) {
				System.out.println("Set alarm to wakeup" +a);
			}
		}
		else if (n>=25) {
			System.out.println("Wrong time entered");
		}
	}
		else if (m>= 25){
			System.out.println("please dont bother to sleep");
		}
}
}
