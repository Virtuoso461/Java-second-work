package Work4;

public class Pupil extends Student{
	private String sname = "小老弟";
	private String sId = "215030";
	private String sSex = "男";
	private int sAge = 12;
	private String grade = "2015";
		public void speak(){
			if(grade.equals("2015")){
				System.out.println("该小学生"+this.sname+","+this.sSex+","+this.sAge+"岁,已经六年级啦。");
			}else if(grade.equals("2016")){
				System.out.println("该小学生"+this.sname+","+this.sSex+","+this.sAge+"岁,已经五年级啦。");
			}else if(grade.equals("2016")){
				System.out.println("该小学生"+this.sname+","+this.sSex+","+this.sAge+"岁,已经四年级啦。");
			}else if(grade.equals("2017")){
				System.out.println("该小学生"+this.sname+","+this.sSex+","+this.sAge+"岁,已经三年级啦。");
			}else if(grade.equals("2018")){
				System.out.println("该小学生"+this.sname+","+this.sSex+","+this.sAge+"岁,已经二年级啦。");
			}else if(grade.equals("2019")){
				System.out.println("该小学生"+this.sname+","+this.sSex+","+this.sAge+"岁,已经一年级啦。");
			}else {
				System.out.println("不知道。");
			}
		}
}
