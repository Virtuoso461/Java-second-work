package Work1;

public class Teacher extends People{
	private String name = "����ʦ";
	private String id;
	private String major = "�����";
	private String teach = "ʹ��Java�����������߼�";
	private String age = "5";
	public void input(){
		super.input();
		id = super.getId();
	}
		public void output(){
			System.out.println(id);
			System.out.println(name);
			System.out.println("רҵ����:"+major);
			System.out.println("���ڿγ�:"+teach);
			System.out.println("����:"+age);
		}
		public void plus(){
			System.out.println(name+"��ʦ�Ľ���Ϊ"+age);
		}
}
