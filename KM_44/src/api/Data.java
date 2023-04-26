package api;

public class Data {
	int num;
	String name;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "Data [num=" + num + ", name=" + name + "]";
	}
	@Override
	public boolean equals(Object obj) {
		//���޵� Ÿ���� Data���� Ȯ��
		if(obj instanceof Data) {
			Data d = (Data) obj;
			if(this.num == d.num && this.name.equals(d.name)) {
				return true;
				}
			else {
				return false;
				}
			}
		//Data�� �ƴϸ� false
		else {
			return false;
			}
		
	}//equals
	
}//Data
