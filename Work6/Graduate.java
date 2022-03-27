package Work6;

public class Graduate implements StudentInterface,TeacherInterface{
	private String name = "ÁÖ·²";
	private String sex = "ÄĞ";
	private String age = "33Ëê";
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


