package Work6;
import java.util.Scanner;
public class Test6 {
	public static void main(String args[]){
		Graduate g = new Graduate();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please input the study fee:");
		g.setFee(sc.nextInt());
		System.out.println("Please input the salary:");
		g.setPay(sc.nextInt());
		if (g.getPay()-g.getFee()<=2000){
			System.out.println("provide a loan");
		}else {
			System.out.println("no provide a loan");
		}
	}
}
