package basic;

import java.util.Scanner;

public class OpTest14{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("짝수 홀수를 판별합니다. 정수 x 입력 > ");
		int x = sc.nextInt();
		System.out.println(x % 2 == 0 ? "짝수" : "홀수");
		//System.out.println(x % 2 == 1 ? "홀수" : "짝수"); 이렇게 했을때는 x가 음수가 나올경우 잘못된 답이 나올 수 있음
		
		System.out.println("종료");
		sc.close();
		
	
	}
}