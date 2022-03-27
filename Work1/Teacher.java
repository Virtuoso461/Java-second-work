package Work1;

public class Teacher extends People{
	private String name = "王老师";
	private String id;
	private String major = "计算机";
	private String teach = "使用Java语言理解程序逻辑";
	private String age = "5";
	public void input(){
		super.input();
		id = super.getId();
	}
		public void output(){
			System.out.println(id);
			System.out.println(name);
			System.out.println("专业方向:"+major);
			System.out.println("教授课程:"+teach);
			System.out.println("教龄:"+age);
		}
		public void plus(){
			System.out.println(name+"教师的教龄为"+age);
		}
}
