package com.test.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class Ex80_Collection {

	public static void main(String[] args) {
		
		//m1();
		//m2();
		m3();
	}

	private static void m3() {
		
		//정렬, Sort
		//	-> 스왑, Swap
		//1. 버블 정렬
		//2. 선택 정렬
		//3. 삽입 정렬
		//===========
		//4. 퀵 정렬
		//5. 힙 정렬
		//6. 병합(머지) 정렬
		//7. 기수 정렬
		
		int[] nums = new int[] {10, 50, 30};
		
		//for
		int temp = 0;
		
		if (nums[0] < nums[1]) {
			temp = nums[0];
			nums[0] = nums[1];
			nums[1] = temp;
		}
		
		System.out.println(Arrays.toString(nums));
	}

	private static void m2() {
		
		//순수 배열
		String[] list = new String[] {
				"홍길동", "아무개", "하하하", "호호호", "유재석", "박명수", "정형돈", "정준하", "강호동", "이수근"
		};
		
		//규모
		//1. 작은 코드 > 도움말
		//2. 큰 코드 > 구글
		//3. 대형 코드(소규모 프로젝트 단위) -> 구글, 코드프로젝트
		//4. 문제 > 구글, 스택오버플로우
		
		String[] copy = list.clone(); //깊은 복사
		String[] copy2 = list; //얕은 복사
		
		list[0] = "김길동";
		System.out.println(copy[0]);
		System.out.println(copy2[0]);
		
		//컬렉션 생성하기
		List<String> temp = Arrays.asList("아무개", "하하하", "호호호");
		System.out.println(temp.get(0));
		
		//순수배열 -> 컬렉션 변환하기
		List<String> temp2 = Arrays.asList(list);
		System.out.println(temp2.toString());
		
		//배열 부분 복사(깊은 복사) *****
		String[] temp3 = Arrays.copyOf(list, 3);
		System.out.println(Arrays.toString(temp3));
		
		//배열 부분 복사 *****
		String[] temp4 = Arrays.copyOfRange(list, 3, 6);
		System.out.println(Arrays.toString(temp4));
		
		//배열 비교
		Integer[] ns1 = new Integer[] {100, 200, 300};
		Integer[] ns2 = new Integer[] {100, 200, 300};
		System.out.println(ns1 == ns2); //참조 변수 비교 = 주소값 비교
		System.out.println(ns1.equals(ns2));
		
		System.out.println(Arrays.deepEquals(ns1, ns2));
		
		//배열 채우기
		String[] temp5 = new String[10]; //null
		//loop -> [i] = "미정";
		//Arrays.fill(temp5, "미정");
		Arrays.fill(temp5, 3, 7, "미정");
		System.out.println(Arrays.toString(temp5));
	}

	private static void m1() {
		
		//List 계열
		//1. ArrayList
		//2. Vector
		//	- 동일한 컬렉션
		//	- 쓰레드 작업 시 동기화 지원 유무
		
		int[] nums1 = new int[3];
		
		nums1[0] = 10;
		nums1[1] = 30;
		nums1[2] = 20;
		
		System.out.println(Arrays.toString(nums1));
		
		ArrayList<Integer> nums2 = new ArrayList<Integer>();
		
		nums2.add(100);
		nums2.add(300);
		nums2.add(200);
		
		System.out.println(nums2.toString());
		
		Vector<Integer> nums3 = new Vector<Integer>();
		
		nums3.add(1000);
		nums3.add(3000);
		nums3.add(2000);
		
		System.out.println(nums3.toString());
	}
}
