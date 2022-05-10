package week10;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyPoint a = new MyPoint(3,20);
		System.out.println(a);
	}
}

class MyPoint {
	int i,j;

	public MyPoint(int i, int j) {
		super();
		this.i = i;
		this.j = j;
	}

	@Override
	public String toString() {
		return "MyPoint(" + i + ","+ j+ ")";
	}
	
	
}
