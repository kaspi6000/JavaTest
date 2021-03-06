package com.test.example;
import java.util.Random;
import java.util.Scanner;

public class Ex29_Array {

	public static void main(String[] args) {
		
		//배열, Array
		//	- 자료형, 참조형
		//	- 같은 자료형의 변수들을 여러개(연속적으로) 모아놓은 집합
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();
		//m8();
		//m9();
		//m10();
		//m11();
		//m12();
		m13();
	}
	public static void m13() {
		
		//2개의 변수값을 서로 교환
		//swap
		int a = 10;
		int b = 20;
		
		int temp;
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
	}
	
	public static void m12() {
		
		//문제 풀이
		int[][] nums = new int[5][5];
		
		int n = 1;
		
		//배열 초기화
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				nums[i][j] = n;
				n++;
			}
		}
		
		//출력용(수정 금지)
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.printf("%4d", nums[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void m11() {
		
		//배열 복사
		//1. 얕은 복사(기본)
		//	- 참조 변수의 복사 -> 주소값 복사
		//2. 깊은 복사
		//	- 실제 배열의 복사본을 만들기
		
		int[] ns = {10, 20, 30, 40, 50}; //원본배열
		int[] copy1;
		int[] copy2;
		
		//얕은 복사
		copy1 = ns;
		
		//얕은 복사의 특징
		copy1[0] = 100;
		System.out.println(ns[0]);
		
		//깊은 복사
		copy2 = new int[ns.length];
		
		for (int i = 0; i < ns.length; i++) {
			//방 -> 방
			//int -> int
			//값 복사
			copy2[i] = ns[i];
		}
		
		copy2[1] = 200;
		System.out.println(ns[1]);
		
		int[] copy3 = deepCopy(ns);
	}
	
	//배열 깊은 복사 메소드(int[])
	public static int[] deepCopy(int[] ns) {
		
		int[] temp = new int[ns.length];
		
		for (int i = 0; i < ns.length; i++) {
			temp[i] = ns[i]; //깊은 복사, 값복사
		}
		
		return temp;
	}
	
	public static void m10() {
		
		//초기화 리스트
		int[] ns1 = {10, 20, 30};
		int[][] ns2 = { {10, 20, 30}, {40, 50, 60} };
		int[][][] ns3 = { { {10, 20, 30}, {40, 50, 60} }, { {10, 20, 30}, {40, 50, 60} } };
	}
	
	public static void m9() {
		
		//다차원 배열
		//	- 1차원 배열
		//	- 2차원 배열
		//	- 3차원 배열
		//	- n차원 배열
		
		//2차원 배열
		int[][] ns = new int[2][3]; //2행 3열 -> 6개
		
		ns[0][0] = 100;
		ns[0][1] = 200;
		ns[0][2] = 300;
		
		ns[1][0] = 400;
		ns[1][1] = 500;
		ns[1][2] = 600;
		
		//1차원 배열 탐색 -> 단일 for문
		//2차원 배열 탐색 -> 2중 for문
		//3차원 배열 탐색 -> 3중 for문
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.printf("ns[%d][%d] = %d\n", i, j, ns[i][j]);
			}
		}
		
		int[][][] ns2 = new int[2][3][4]; //24개
		
		ns2[0][2][3] = 100;
		ns2[1][1][1] = 200;
		ns2[1][0][0] = 300;
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				for (int j2 = 0; j2 < 4; j2++) {
//					System.out.printf("ns2[%d][%d][%d] = %d\n", i, j, j2, ns2[i][j][j2]);
					System.out.print(ns2[i][j][j2] + "\t");
				}
				System.out.println();
			}
			System.out.println();
		}
		
		//향상된 for문 - 비권장 -> 일반 for문
		for (int[] temp : ns) {
			for (int n : temp) {
				System.out.println(n);
			}
		}
		
		System.out.println();
		
		ns[0][0] = 100;
		ns[0][1] = 200;
		ns[0][2] = 300;
		
		ns[1][0] = 400;
		ns[1][1] = 500;
		ns[1][2] = 600;
		
		System.out.println(ns.length);
		
		for (int i = 0; i < ns.length; i++) {
			for (int j = 0; j < ns[0].length; j++) {
				System.out.printf("ns[%d][%d] = %d\n", i, j, ns[i][j]);
			}
		}
		
		int[][][] ns3 = new int[3][4][5];
		
		//질문
		//1. ns3의 자료형 -> int[][][], int 3차원 배열
		//2. ns3[0] 의 자료형? -> int[][], int 2차원 배열
		//3. ns3[0][0] 의 자료형? -> int[], int 1차원 배열
		//4. ns3[0][0][0] 의 자료형? -> int, int 방
	}
	
	public static void m8() {
		
		//Tip
		//프로젝트
		//	- 임의의 데이터 생성
		
		//회원 관리 프로그램
		//1. 회원 정보
		//	- 이름 : ? -> 숫자
		//	- 주소 : ? -> 숫자
		//	- 나이 : 숫자
		//	- 성별 : 숫자 논리(true, false)
		
		//Random + 배열 (+ 클래스)
		//회원 100명 분량
		int count = 100;
		Random rnd = new Random();
		
		//이름을 임의로 생성하기 위한 준비물
		String[] n1 = {"김", "이", "박", "최", "정", "한", "지", "임", "안", "조"}; //성
		String[] n2 = {"대", "은", "창", "미", "준", "수", "영", "우", "진", "리", "인", "재", "하", "혁"}; //이름
		
		//주소
		String[] a1 = {"서울시", "인천시", "부산시", "대전시", "광주시"};
		String[] a2 = {"중구", "남구", "서구", "동구"};
		String[] a3 = {"역삼동", "대치동", "상일동", "중앙동", "하일동"};
		
		int[] age = new int[count];
		
		String[] gender = new String[count];
		
		String[] name = new String[count];
		
		String[] address = new String[count];
		
		for (int i = 0; i < count; i++) {
			
			//나이(20 ~ 60 -> 0 ~ 40 + 20)
			age[i] = rnd.nextInt(41) + 20;
			
			//0 -> 남자, 1 -> 여자
			gender[i] = rnd.nextInt(2) == 0 ? "남자" : "여자";
			
			//이름
			name[i] = n1[rnd.nextInt(n1.length)] + n2[rnd.nextInt(n2.length)] + n2[rnd.nextInt(n2.length)];
			
			//주소
			address[i] = a1[rnd.nextInt(a1.length)] + " " + a2[rnd.nextInt(a2.length)] + " " + a3[rnd.nextInt(a3.length)] + " " + (rnd.nextInt(50) + 1) + "번지";
		}
		
		//출력
		System.out.println("[이름]\t[나이]\t[성별]\t[주소]\t");
		for (int i = 0; i < count; i++) {
			System.out.printf("%s\t%d세\t%s\t%s\n", name[i], age[i], gender[i], address[i]);
		}
	}
	
	public static void m7() {
		
		//배열 초기화
		//	- 배열은 방을 만든 직후에 사용자가 직접 초기화를 하지 않더라도 자동으로 초기화가 된다.
		//	- 모든 참조형의 특징.
		//	- 정수형 : 0
		//	- 실수형 : 0.0
		//	- 논리형 : false
		//	- 문자형 : \0(null 문자)
		//	- 참조형 : null
		
		int[] nums = new int[3];
		System.out.println(nums[0]);
		
		//개발자가 직접 배열 초기화
		int[] ns1 = new int[5];
		
		//배열 초기화
		ns1[0] = 95;
		ns1[1] = 57;
		ns1[2] = 3;
		ns1[3] = 39;
		ns1[4] = 22;
		
		//배열 초기화 리스트
		//java 배열선언 {}
		int[] ns2 = new int[] {95, 57, 3, 39, 22};
		
		int[] ns3;
		ns3 = new int[] {95, 57, 3, 39, 22};
		
		int[] ns4 = {95, 57, 3, 39, 22};
		
		boolean[] flags = {true, false, false, true, false};
		
		String[] names = {"홍길동", "아무개", "호호", "테스트"};
		
		int[] seq1 = new int[3];
		int seq2[] = new int[3];
	}
	
	public static void m6() {
		
		//제어문
		//	- (향상된) for문
		//	- 배열(컬렉션)을 대상으로 하는 루프
		
		int[] nums = new int[5];
		
		nums[0] = 100;
		nums[1] = 200;
		nums[2] = 300;
		nums[3] = 400;
		nums[4] = 500;
		
		//배열 탐색 -> 요소들을 원하는 순서대로 접근
		for (int i = 0; i < nums.length; i++) {
			//System.out.println(nums[i]);
			//nums[i] *= 2;
		}
		
		//향상된 for문
//		for(변수 : 배열) {
//		}
		
		//장점
		//1. 개발자가 루프 제어를 안해도 된다.
		//2. 코드 절약, 가독성 높음
		//3. 속도가 빠르다.(일반 for문보다)
		
		//단점
		//1. 요소의 접근을 순차적으로밖에 못한다.(0~마지막)
		//2. 읽기 전용(요소의 값을 수정하는 용도로는 사용 불가능)
		
		for(int n : nums) {
			//System.out.println(n);
			n *= 3;
		}
		
		System.out.println("결과");
		for(int n : nums) {
			System.out.println(n);
		}
	}
	
	public static void m5() {
		
		//배열의 복사(참조형의 복사)
		int[] list1 = new int[3]; //원본
		
		list1[0] = 30;
		list1[1] = 60;
		list1[2] = 90;
		
		int[] list2;
		
		//참조형 복사(주소값 복사가 이루어진다)
		list2 = list1;
		
		System.out.println(list2[0]); //
		
		list1[0] = 120;
		
		System.out.println(list1[0]); //120
		System.out.println(list2[0]); //
	}
	
	public static void m4() {
		
		//문자열의 불변 > 메모리의 할당된 공간의 크기는 변경할 수 없다.
		//	- 배열에도 적용
		
		//배열도 한번 생성하면 절대로 방의 갯수를 늘리거나 줄일 수 없다.
		//	-> 배열의 길이를 미리 예측!
		
		//요구사항] 중학교 > 성적처리
		
		//배열의 길이를 정적으로 할당.
		int[] kors = new int[300];
		
		//배열의 길이를 동적으로 할당할 수 있다.
		Scanner scan = new Scanner(System.in);
		System.out.print("학생 수 : ");
		int size = scan.nextInt();
		
		int[] engs = new int[size];
	}
	
	public static void m3() {
		
		//각 자료형들로 배열 만들기
		int[] list1 = new int[3];
		list1[0] = 100;
		System.out.println(list1[0]);
		
		//실수 배열
		double[] list2 = new double[3];
		list2[0] = 3.14;
		System.out.println(list2[0]);
		
		//논리 배열
		boolean[] list3;
		list3 = new boolean[3];
		list3[0] = true;
		System.out.println(list3[0]);
		
		//문자 배열
		char[] list4 = new char[3];
		list4[0] = '홍';
		list4[1] = '길';
		list4[2] = '동';
		for (int i = 0; i < list4.length; i++) {
			System.out.print(list4[i]);
		}
		System.out.println();
		
		//배열의 메소드와 문자열의 메소드가 비슷하다.
		
		//참조형 배열
		String[] list5 = new String[3];
		list5[0] = "하나";
		System.out.println(list5[0]);
		
		//
		Scanner scan = new Scanner(System.in);
		scan.nextLine();
		
		Scanner[] scans = new Scanner[3];
		scans[0] = new Scanner(System.in);
		scans[0].nextLine();
	}
	
	public static void m2() {
		
		int[] nums = new int[5];
		
		//루프 변수의 변화 -> 배열의 방번호 변화
		for (int i = 0; i < nums.length; i++) {
			nums[i] = (i + 1) * 100;
		}
		
		for (int i = 0; i < nums.length; i++) {
			System.out.printf("nums[%d] = %d\n", i, nums[i]);
		}
		
		//배열 사용시 주의할 점!
		//	- 첨자 주의!!
		System.out.println(nums.length); //5개
		
		System.out.println(nums[0]);
		//System.out.println(nums[5]); //6개째
	}
	
	public static void m1() {
		
		//요구사항] 학생 3명 > 국어 점수 > 총점, 평균
		//			학생 300명
		
		int kor1,
			kor2,
			kor3;
		// + 297
		
		kor1 = 90;
		kor2 = 80;
		kor3 = 70;
		// + 297
		
		int total = kor1 + kor2 + kor3;	// + kor4 + kor5 + ... + kor300
		double avg = total / 3.0;	//300.0
		
		System.out.printf("총점 : %d점, 평균 : %.1f점\n", total, avg);
		
		//위의 요구사항을 배열로 바꾸기
		//1. 배열 선언
		//	- 자료형[] 배열명(변수명) = new 자료형[길이];
		//	- 	  [] : 차원(수)
		int kor;
		kor = 10;
		
		int[] kors = new int[3];
		
		System.out.println(kors.length); //배열의 방의 갯수 -> 배열 길이
		
		kors[0] = 95;
		kors[1] = 85;
		kors[2] = 75;
		// + 297
		
		total = 0;
		//total = kors[0] + kors[1] + kors[2];
		
		for (int i = 0; i < kors.length; i++) {
			//System.out.println(kors[i]);
			total += kors[i];
		}
		
		avg = total / (double)kors.length;
		
		System.out.printf("총점 : %d점, 평균 : %.1f점\n", total, avg);
	}
}
