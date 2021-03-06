class Ex08_Casting {
	public static void main(String[] args) {

		//형변환
		//1. 암시적인 형변환
		//2. 명시적인 형변환

		//정수 -> 정수
		
		byte b1 = 10; //원본 1byte
		long l1; //복사본 8byte

		//암시적인 형변환(원본 손실X)
		l1 = b1;
		//l1 = (long)b1;

		System.out.println(l1); //복사본 확인
		

		//실수형
		float f1 = 3.14F; //원본
		double d1; //복사본

		//암시적인 형변환
		d1 = f1;

		//키 매크로
		System.out.println(d1);

		double d2 = 1.23456789012345; //원본
		float f2; //복사본

		System.out.println(d2);

		f2 = (float)d2;

		System.out.println(f2);

		//실수 <-> 정수
		double d3 = 3.99;
		int n3;
		
		//
		n3 = (int)d3; //무조건 버림(floor, trunc)

		System.out.println(n3);
		System.out.println(Math.round(d3));


		float f4 = 3.14F;
		long l4;
		
		//큰형(8) = 작은형(4)
		//수의 범위(O), 바이트 크기(X)
		l4 = (long)f4;

		System.out.println(l4);

		//기본형의 범위 비교
		//byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)
		//			char(2)
		//boolean(1)

		//** 기본형과 참조형끼리는 변환이 불가능(메모리 구조 때문)

		//boolean은 형변환의 대상이 될 수 없다.
		//(int)true;

		
		//문자형
		//	- 'A' -> 65(문자 코드값)
		char c5 = 'A'; //2byte
		short s5; //2byte

		//숫자 = 문자
		s5 = (short)c5;

		System.out.println(s5);

		System.out.println((char)66);


		char c6 = '가'; //2byte
		int n6; //4byte

		n6 = c6;

		System.out.println(n6);
		

		int n7 = 5;
		char c7 = '5';

		System.out.println(n7);
		System.out.println((int)c7);

		System.out.println((int)'A');
		System.out.println((int)'Z');
		System.out.println((int)'a');
		System.out.println((int)'z');
		System.out.println((int)'0');
		System.out.println((int)'9');

		System.out.println((int)'가');
		System.out.println((int)'힣');

		//Validation injection query (a-z A-Z 0-9) 클라이언트단에서 할 수 있는 예외처리
		//특수문자 허용시 공격자가 유저 계정 획득
		
		
	}
}
