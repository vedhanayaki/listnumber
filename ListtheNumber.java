package player;
import java.util.Scanner;
public class ListtheNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the number");
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int sum=0;
for(int i=0;i<=a;i++){
	sum+=i;
}
System.out.println("The Number is:"+sum);
	}

}
