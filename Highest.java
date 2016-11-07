import java.util.Scanner;
public class Highest {

	public static void main(String[] args) {
		Scanner FirstNum = new Scanner(System.in);
		System.out.println("Please Enter 1st Num: ");
		int a = FirstNum.nextInt();
		Scanner SecondNum = new Scanner(System.in);
		System.out.println("Please Enter 2nd Num: ");
		int b = SecondNum.nextInt();
		Scanner ThirdNum = new Scanner(System.in);
		System.out.println("Please Enter 3rd Num: ");
		int c = ThirdNum.nextInt();
		System.out.printf("1stNum=%d, 2ndNum=%d, 3rdNum=%d\n", a,b,c);
		if (a>b && a>c){
			System.out.printf("1stNum(%d) is highest\n",a);
		}
		else if(b>a && b>c){
			System.out.printf("2ndNum(%d) is highest\n",b);
		}
		else if(c>a && c>b){
			System.out.printf("3rdNum(%d) is highest\n",c);
		}
		else if(a==b && a>c){
			System.out.printf("1st and 2nd Numbers are highest\n");
		}
		else if(a==c && a>b){
			System.out.printf("1st and 3rd Numbers are highest\n");
		}
		else if(b==c && b>a){
			System.out.printf("2nd and 3rd Numbers are highest\n");
		}
		else{
			System.out.println("All numbers are equal");
		}
	}

}

