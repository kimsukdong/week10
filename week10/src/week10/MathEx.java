package week10;
import java.util.*;
public class MathEx {
	static final int cnt = 6;
	static int num;
	static int data[] = new int[cnt];
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("행운의  당첨 번호는 ");
		System.out.print("original = ");
		for(int i =0; i<cnt; i++) {
		
				while(true) {
					num = (int)(Math.random()*45.0+1);
					if(chk_num(i, num)) break ;
				}		
			data[i]=num;
			System.out.print(num+" ");
		}
		Arrays.sort(data);
		System.out.println(" ");
		System.out.print("sort = ");
		for(int k =0; k< cnt; k++)
			System.out.print(data[k]+" ");
	}
	static boolean chk_num(int i, int n) {
		for(int j = 0; j<i; j++)
			if(data[j]==n)
				return false;
		return true;
	}

}
