package Work1;

import java.util.Scanner;

public class Student extends People{
	private String name="�ź�";
	private String id;
	private String age = "15";
	private String banji = "S1��";
	private String hobby = "����";
		public void input(){
			super.input();
			id = super.getId();
		}
		public void output(){
				System.out.println(id);
				System.out.println(name);
				System.out.println("����:"+age);
				System.out.println("�Ͷ���:"+banji);
				System.out.println("����:"+hobby);
			}
				public void gotoClass(){
					Scanner sc = new Scanner(System.in);
					System.out.println("������Ҫȥ�ϿεĽ���:");
					String to = sc.nextLine();
					System.out.println("ȥ"+to+"�����Ͽ�");
				}
		}

