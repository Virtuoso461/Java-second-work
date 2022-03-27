package Work1;

import java.util.Scanner;

public class Student extends People{
	private String name="张浩";
	private String id;
	private String age = "15";
	private String banji = "S1班";
	private String hobby = "篮球";
		public void input(){
			super.input();
			id = super.getId();
		}
		public void output(){
				System.out.println(id);
				System.out.println(name);
				System.out.println("年龄:"+age);
				System.out.println("就读于:"+banji);
				System.out.println("爱好:"+hobby);
			}
				public void gotoClass(){
					Scanner sc = new Scanner(System.in);
					System.out.println("请输入要去上课的教室:");
					String to = sc.nextLine();
					System.out.println("去"+to+"教室上课");
				}
		}

