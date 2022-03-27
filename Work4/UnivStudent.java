package Work4;

public class UnivStudent extends Student{
	private String sname = "女汉子";
	private String sId = "200110";
	private String sSex = "女";
	private int sAge = 18;
	private String grade = "2020";
	private String speciality = "软件工程";
			public void speak(){
				if(grade.equals("2017")){
					System.out.println("该大学生姓名:"+this.sname+",学号"+sId+","+this.sSex+","+this.sAge+",岁,今年是大四");
				}else if(grade.equals("2018")){
					System.out.println("该大学生姓名:"+this.sname+",学号"+sId+","+this.sSex+","+this.sAge+",岁,今年是大三");
				}else if(grade.equals("2019")){
					System.out.println("该大学生姓名:"+this.sname+",学号"+sId+","+this.sSex+","+this.sAge+",岁,今年是大二");
				}else if(grade.equals("2020")){
					System.out.println("该大学生姓名:"+this.sname+",学号"+sId+","+this.sSex+","+this.sAge+",岁,今年是大一");
				}else{
					System.out.println("不知道");
				}
			}
}