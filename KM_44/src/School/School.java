package School;

public class School {
	
	int a;

	public static void main(String[] args) {
		Student s = new Student();
		Teacher t = new Teacher();
		
		Student s2 = new Student("ȫ�浿", "990101-1111111","010-1111-1111",100, 90, 80);
		Teacher t2 = new Teacher("��ö��", "880101-1111111", "010-2222-2222", 1000000);
		
		/*System.out.println(s2.getKor()+ s2.getEng() + s2.getMat());
		System.out.println(s2.getTotal()); //int������ ������ �����ϴ� �޼ҵ�
		System.out.println(s2.getAverage()); //double������ ��� ����
		System.out.println(s2.getGrade()); // "A", "B"�� ��� ����*/
		
//int������ ������ �����ϴ� �޼ҵ�
//�����ھȿ� �ƹ��͵� ������ �ڵ�����  �������

//		Person p = new Student();
//		Person p2 = new Teacher();
//		person p3 = new person();
//		���� ���Թ޴¾ְ� ����Ÿ���̰� ����Ÿ���̸� �ȵȴ�.
//		Object o = new Student();
//		����Ÿ���� ����Ÿ���� ��ü�� �����Ҽ��ִ�.
		/*System.out.println(s2.getName());
		System.out.println(s2);
		System.out.println(t2);*/
//		System.out.println(s2); �ؽ���
		
		test(s2);
		test(t2);
	}
	
	public static void test(Person p) {
		System.out.println(p.toString());
		//���ʿ� �ִ� ��ü�� ������ Ÿ���̳�?
		if(p instanceof Student) {
			//p��� ��ü�� Studendt Ÿ���� ����Ű�� �ִ�. Person p => Student P
			//�θ�� �ڽĿ��� ���� �� �� ����. extends����� ����.
			//Student s���� p�� �ּҰ��� �ش�.
			/*Student s = (Student) p;
			System.out.println(s.getKor());*/ //�������� ���
			System.out.println(((Student)p).getKor());
		}
		else if(p instanceof Teacher) {
			System.out.println(((Teacher)p).getSalary());
		}
	}
	
}
