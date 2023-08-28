package ch05reference;

public class C06matrix {
	public static void main(String[] args) {
		int[][] a = {{1,2,3}, {10,20,30}, {100,200,300}};
		int[][] b = a;
		
		System.out.println(a[0][2]);
		System.out.println(b[0][2]);
		
		a[1][1] = 2000;
		
		System.out.println(a[1][1]);
		System.out.println(b[1][1]); // 20? 2000?
		
		b[2][2] = 9999;
		System.out.println(b[2][2]);
		System.out.println(a[2][2]);
		
		b[2] = new int[] {111,222,333};
		
		System.out.println(b[2][2]);
		System.out.println(a[2][2]);
		
		b = new int[][] {{33,44},{22,11}}; // b에 새 객체(instance)의 참조값이 설정됨
		System.out.println(b[0][0]); // 여기서부터는 a=b가 성립 안됨
		System.out.println(a[0][0]);
	}
}
