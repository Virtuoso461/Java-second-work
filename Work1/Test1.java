package Work1;

public class Test1 {
	public static void main(String args[]){
		Student s = new Student();
		Teacher t = new Teacher();
		System.out.println("�������źƵ�ѧ��:");
		s.input();
		System.out.println("����������ʦ�Ĺ���:");
		t.input();
		s.output();
		t.output();
		s.gotoClass();
		t.plus();
	}
}
