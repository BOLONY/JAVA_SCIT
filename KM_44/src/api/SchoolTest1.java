package api;

import java.util.ArrayList;
import java.util.Scanner;

import School.Student;


public class SchoolTest1 {

	public static void main(String[] args) {
		ArrayList<Student> list= new ArrayList<>();
//		Student s;
//		String name, id, phone;
//		int k, e, m;
		Scanner sc = new Scanner(System.in);
		
		//�л������� �ݺ������� �Է¹޾� ����
		exit:
		while (true) {
			Student s = new Student();
//			Student s = new Student(name, id, phone, k, e, m);
			//�л��� �̸�, �й�, ��ȭ��ȣ, ������������ �Է¹޾� Student��ü Ÿ������ ArrayList�� ����
			System.out.print("�̸�: ");
//			name = scanner.next();
			s.setName(sc.next());
			System.out.print("�й�: ");
			s.setId(sc.next());
			System.out.print("��ȭ��ȣ: ");
			s.setPhone(sc.next());
			System.out.print("����: ");
			s.setKor(sc.nextInt());
			System.out.print("����: ");
			s.setEng(sc.nextInt());
			System.out.print("����: ");
			s.setMat(sc.nextInt());
			
//			s = new Student(name, id, phone, kor, eng, math);
			list.add(s);
			
			System.out.print("��� �Է��Ͻðڽ��ϱ�? (y/n)");
			String a = sc.next();
			
//			if (a.equalsIgnoreCase("n")) break;
			if(a.equals("y") ) {
				continue;
			}
			else if( a.equals("n") ){
				break exit;
			}
			
			//"y"�Է��ϸ� ��� "n"�Է��ϸ� ����
		}//while
		
		//����л����� ���
		//System.out.println(list);
		//�й� �̸� ���� ���
//		System.out.println(list.get(0).getId());
//		System.out.println(list.get(0).getPhone());
//		System.out.println(list.get(0).getKor()+list.get(0).getKor()+list.get(0).getKor());
//		System.out.println((list.get(0).getKor()+list.get(0).getKor()+list.get(0).getKor())/3);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getId());
			System.out.println(list.get(i).getPhone());
			System.out.println(list.get(i).getKor()+list.get(i).getKor()+list.get(i).getKor());
			System.out.println((list.get(i).getKor()+list.get(i).getKor()+list.get(i).getKor())/3);
		}
		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list.get(i).getName() + "\t" + list.get(i).getId() + "\t"  
//			+list.get(i)+ list.get(i).getName());
//		}
		
//		for(Student st : list) {
//			st.get
//		}
		//�ʱ�ȭ
		
		//��ü�л��� �������
		double avg = 0.0;
		for (Student st: list) {
			//�ݺ����
			avg += st.getAverage();
		}
		System.out.println(list.size());
		avg /= list.size();
		//���
		
		System.out.println("��ü ���: " + avg);
		
	}

}
