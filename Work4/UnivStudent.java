package Work4;

public class UnivStudent extends Student{
	private String sname = "Ů����";
	private String sId = "200110";
	private String sSex = "Ů";
	private int sAge = 18;
	private String grade = "2020";
	private String speciality = "�������";
			public void speak(){
				if(grade.equals("2017")){
					System.out.println("�ô�ѧ������:"+this.sname+",ѧ��"+sId+","+this.sSex+","+this.sAge+",��,�����Ǵ���");
				}else if(grade.equals("2018")){
					System.out.println("�ô�ѧ������:"+this.sname+",ѧ��"+sId+","+this.sSex+","+this.sAge+",��,�����Ǵ���");
				}else if(grade.equals("2019")){
					System.out.println("�ô�ѧ������:"+this.sname+",ѧ��"+sId+","+this.sSex+","+this.sAge+",��,�����Ǵ��");
				}else if(grade.equals("2020")){
					System.out.println("�ô�ѧ������:"+this.sname+",ѧ��"+sId+","+this.sSex+","+this.sAge+",��,�����Ǵ�һ");
				}else{
					System.out.println("��֪��");
				}
			}
}