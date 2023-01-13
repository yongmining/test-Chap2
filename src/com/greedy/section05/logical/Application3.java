package com.greedy.section05.logical;

public class Application3 {

	public static void main(String[] args) {
		/* AND 연산과 OR 연산의 특징
		 * 논리식 && 논리식 : 앞의 결과가 false 이면 뒤를 실행 안함
		 * 논리식 || 논리식 : 앞의 결과가 true 이면 뒤를 실행 안함
		 * */
		int num1 = 10;
		
		int result1 = (true && ++num1 > 0)? num1 : num1;

		System.out.println("&& 실행확인 : " + result1);
		
		int num2 = 10;
		int result2 = (true || ++num2 > 0)? num2 : num2;
		
		System.out.println("|| 실행확인 : " + result2);
	}

}
