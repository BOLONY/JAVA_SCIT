package ch05;

public class Student {

		// TODO Auto-generated method stub
		String name;
		int age;
		String address;
		
//		public Student() {}
		
		//명시적 생성자
		public Student(String n, int a, String ad) {
			name = n;
			age = a;
			address = ad;
		}
		
		/*public Student() {}
	
	public String toString() {
		return String.format("이름 :%s, 나이:%d, 주소:%s",name, age, address);
	}*/
	
//	System.out.println("이름 :%s, 나이:%d, 주소:%s",name, age, address);

}
