package api;

import java.util.Scanner;

//java.lang.string �׽�Ʈ
public class StringTest1 {
	public static void main(String[] args) {
		String a;
		String b = null;
		String c = "";
		String d = "abc";
		String e = "abc";
		String f = new String("abc");
		String g = new String("abc");
		
		//System.out.println(a); �ʱ�ȭ ���� ���� ����
		//���ڿ� ������ ��ü�� �� ������ ����Ǿ��ִ�.
		System.out.println(b);
		System.out.println(c);
		
		System.out.println(d == e);
		System.out.println(d.equals(e));
		System.out.println(e);
		//stack�� ����ִ� �ּҰ��� �ٸ��ϱ� false
		System.out.println(f == g);
		//equals �޼ҵ� :�ּڰ� �������� �ƴ� �����
		System.out.println(f.equals(g));
		System.out.println(f.equals("abc"));		
		System.out.println(f.equals("ABC"));
		System.out.println(f.equalsIgnoreCase("ABC"));
		
		//string��ü.�޼��� ȣ��
		String s = "abcdefg";
		System.out.println(s.length()); //���ڿ��� ����
		System.out.println(s.charAt(0)); //1���� �б�
		System.out.println(s.substring(3,6)); //�κй��ڿ� �б�
		System.out.println(s.substring(4)); //�ҷ��� ���ں��� ������
		System.out.println(s.substring(2,5).length());
		System.out.println(s.substring(s.length() - 1));
		System.out.println();
		System.out.println(s.indexOf('c'));
		System.out.println(s.indexOf("de")); //-1�̸� ��ã����.
		//de �ؼ� 3�� ������ ������ �ܾ��� ù���� ���ڸ� ã�°Ŷ�
		System.out.println();
		System.out.println(s.contains("def"));
		System.out.println(s.compareTo("abd")); //99-100 ��������
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		//Ư�����ڸ� �ڿ������� ã��
		//"abc"�� �����ϴ°�?
		System.out.println();
		
		s = "a";
		s = s + "b";
		s = s + "c";
		System.out.println(s);
		s = "010-1111-2222";
		String s2 = s.replaceAll("-", "/");
		System.out.println(s2);
		String s3[] = s.split("-");
		System.out.println(s3[0] + s3[1] + s3[2]);
		//"fg"�� �����°�?
		System.out.println('g');
		System.out.println("a".compareTo("aaa"));
	
		
	}
	
}
