package ch06;

//Singleton pattern�� ����� Ŭ����
public class Company {
	//2. �ڱ��ڽ��� ��ü�� ����� static�ϰ� �Ѵ�.
	private static Company c = new Company();
	private int total;
	
	//1. �ܺο��� ��ü�� �������� ���ϵ��� ���������ڸ� private���� �Ѵ�.
	private Company() {
		System.out.println("Company ��ü ����");
	} //private�̴� ������ Ŭ���� ���̴�.
	
	//3. �ܺο��� �ش� Ŭ������ ��ü�� ������ �� �� �ִ� getter ����.
	public static Company getCompany() { //�޼��嵵 �ϳ��� ������ Ÿ���̴�.
		return c;
	}
	
	public void addTotal(int total) {
		this.total += total;
	}
	
	public int getTotal() {
		return total; 
	}
}
