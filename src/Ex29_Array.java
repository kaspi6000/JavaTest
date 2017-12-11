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
		m8();
	}
	
	public static void m8() {
		
		//Tip
		//프로젝트
		
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
