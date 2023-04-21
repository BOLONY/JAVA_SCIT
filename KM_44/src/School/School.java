package School;

public class School {
	
	int a;

	public static void main(String[] args) {
		Student s = new Student();
		Teacher t = new Teacher();
		
		Student s2 = new Student("홍길동", "990101-1111111","010-1111-1111",100, 90, 80);
		Teacher t2 = new Teacher("김철수", "880101-1111111", "010-2222-2222", 1000000);
		
		/*System.out.println(s2.getKor()+ s2.getEng() + s2.getMat());
		System.out.println(s2.getTotal()); //int형으로 총점을 리턴하는 메소드
		System.out.println(s2.getAverage()); //double형으로 평균 리턴
		System.out.println(s2.getGrade()); // "A", "B"등 등급 리턴*/
		
//int형으로 총점을 리턴하는 메소드
//생성자안에 아무것도 없으면 자동으로  만들어줌

//		Person p = new Student();
//		Person p2 = new Teacher();
//		person p3 = new person();
//		왼쪽 대입받는애가 하위타입이고 상위타입이면 안된다.
//		Object o = new Student();
//		상위타입이 하위타입의 객체를 참조할수있다.
		/*System.out.println(s2.getName());
		System.out.println(s2);
		System.out.println(t2);*/
//		System.out.println(s2); 해쉬값
		
		test(s2);
		test(t2);
	}
	
	public static void test(Person p) {
		System.out.println(p.toString());
		//왼쪽에 있는 객체가 오른쪽 타입이냐?
		if(p instanceof Student) {
			//p라는 객체가 Studendt 타입을 가리키고 있다. Person p => Student P
			//부모는 자식에게 관여 할 수 없다. extends기능이 없다.
			//Student s에게 p의 주소값을 준다.
			/*Student s = (Student) p;
			System.out.println(s.getKor());*/ //국어점수 출력
			System.out.println(((Student)p).getKor());
		}
		else if(p instanceof Teacher) {
			System.out.println(((Teacher)p).getSalary());
		}
	}
	
}
