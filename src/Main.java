import java.util.Scanner;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Input number between 1-9");
		int a=scan. nextInt();

		if (a>=1 && a<=3){
			a= a*5;
			System.out.println(a);
		}else if (a>=4 && a<=6){
			a=a*10;
			System.out.println(a);
		}
		if (a>=7 && a<=9){
			a=a*50;
			System.out.println(a);
		}else{
			System.out.println("Number out of range");
		}

			
		}
				



			
	}
	


