package api;

import java.util.ArrayList;
import java.util.Scanner;


public class ArrayListTest2 {

	public static void main(String[] args) {
		ArrayList<Data> list= new ArrayList<Data>();
		Data d = null;
		
		d = new Data();
		d.setNum(1);
		d.setName("�����");
		list.add(d);
		
		d = new Data();
		d.setNum(2);
		d.setName("Ű����");
		list.add(d);
		
		System.out.println(list);
		
		Scanner scan = new Scanner(System.in);
		Data input = new Data();
		input.setNum(scan.nextInt());
		input.setName(scan.next());
		
		//�Է��� ���� ����Ʈ�� �ִ��� ��ġ ���
		int i = list.indexOf(input);
		if (i == -1) {
			System.out.println("�����Ͱ� �����ϴ�.");
		}
		else { 
			System.out.println(i+"����");
		}
		if(input.equals("aaa")) {
			
		}
	}//main

}//ArrayListTest2
