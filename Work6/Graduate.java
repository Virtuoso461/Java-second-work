package Work6;

public class Graduate implements StudentInterface,TeacherInterface{
	private String name = "�ַ�";
	private String sex = "��";
	private String age = "33��";
	private int f;
	private int p;
		public int getFee(){
			return f;
		}
		public void setFee(int f){
			this.f = f;
		}
		public int getPay(){
			return p;
		}
		public void setPay(int p){
			this.p = p;
		}
		
}


