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
		
		//학생정보를 반복적으로 입력받아 저장
		exit:
		while (true) {
			Student s = new Student();
//			Student s = new Student(name, id, phone, k, e, m);
			//학생의 이름, 학번, 전화번호, 국영수점수를 입력받아 Student객체 타입으로 ArrayList에 저장
			System.out.print("이름: ");
//			name = scanner.next();
			s.setName(sc.next());
			System.out.print("학번: ");
			s.setId(sc.next());
			System.out.print("전화번호: ");
			s.setPhone(sc.next());
			System.out.print("국어: ");
			s.setKor(sc.nextInt());
			System.out.print("영어: ");
			s.setEng(sc.nextInt());
			System.out.print("수학: ");
			s.setMat(sc.nextInt());
			
//			s = new Student(name, id, phone, kor, eng, math);
			list.add(s);
			
			System.out.print("계속 입력하시겠습니까? (y/n)");
			String a = sc.next();
			
//			if (a.equalsIgnoreCase("n")) break;
			if(a.equals("y") ) {
				continue;
			}
			else if( a.equals("n") ){
				break exit;
			}
			
			//"y"입력하면 계속 "n"입력하면 종료
		}//while
		
		//모든학생정보 출력
		//System.out.println(list);
		//학번 이름 총점 평균
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
		//초기화
		
		//전체학생의 평균점수
		double avg = 0.0;
		for (Student st: list) {
			//반복계산
			avg += st.getAverage();
		}
		System.out.println(list.size());
		avg /= list.size();
		//사용
		
		System.out.println("전체 평균: " + avg);
		
	}

}
