package Work4;

public class Pupil extends Student{
	private String sname = "С�ϵ�";
	private String sId = "215030";
	private String sSex = "��";
	private int sAge = 12;
	private String grade = "2015";
		public void speak(){
			if(grade.equals("2015")){
				System.out.println("��Сѧ��"+this.sname+","+this.sSex+","+this.sAge+"��,�Ѿ����꼶����");
			}else if(grade.equals("2016")){
				System.out.println("��Сѧ��"+this.sname+","+this.sSex+","+this.sAge+"��,�Ѿ����꼶����");
			}else if(grade.equals("2016")){
				System.out.println("��Сѧ��"+this.sname+","+this.sSex+","+this.sAge+"��,�Ѿ����꼶����");
			}else if(grade.equals("2017")){
				System.out.println("��Сѧ��"+this.sname+","+this.sSex+","+this.sAge+"��,�Ѿ����꼶����");
			}else if(grade.equals("2018")){
				System.out.println("��Сѧ��"+this.sname+","+this.sSex+","+this.sAge+"��,�Ѿ����꼶����");
			}else if(grade.equals("2019")){
				System.out.println("��Сѧ��"+this.sname+","+this.sSex+","+this.sAge+"��,�Ѿ�һ�꼶����");
			}else {
				System.out.println("��֪����");
			}
		}
}
