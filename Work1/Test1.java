package Work1;

public class Test1 {
	public static void main(String args[]){
		Student s = new Student();
		Teacher t = new Teacher();
		System.out.println("请输入张浩的学号:");
		s.input();
		System.out.println("请输入王老师的工号:");
		t.input();
		s.output();
		t.output();
		s.gotoClass();
		t.plus();
	}
}
