package Work1;
import java.util.Scanner;
public class People {
	private String name;
	private String id;
		public void input(){
			Scanner sc = new Scanner(System.in);
			id = sc.nextLine();
		}
		public String getId(){
			return id;
		}
}
