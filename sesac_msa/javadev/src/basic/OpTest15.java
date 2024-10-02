package basic;

import java.util.Scanner;

public class OpTest15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("주민번호 7번째 숫자 입력 > ");
		int n = sc.nextInt();
		System.out.println(n == 1 || n == 3 ? "남자" :
							n == 2 || n == 4 ? "여자" :
									"에러");
				
		System.out.println("종료");
		sc.close();
		
	
	}
}
