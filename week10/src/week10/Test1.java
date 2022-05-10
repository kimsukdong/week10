package week10;

public class Test1 {
	public static void main(String[] args) {
		Integer num1 = 1234;
		Double num2 = 3.14;
		
		System.out.println("1,234을 2진수로 표현 : "+Integer.toBinaryString(num1));
		System.out.println("1,234을 8진수로 표현 : "+Integer.toOctalString(num1));
		System.out.println("1,234을 16진수로 표현 : "+Integer.toHexString(num1));
		
		System.out.println("3.14를 16진수로 표현 : "+Double.toHexString(num2));
	}

}
