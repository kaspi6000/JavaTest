package com.test.question;

public class MyStack {

	//1. 멤버 변수
		private String[] list;	//데이터 저장
		private int index; 		//입출력 요소의 위치
		private int capacity;	//배열 초기 크기
		
		//2. 생성자
		public MyStack() {
			
			index = 0;
			
			capacity = 4;
			
			list = new String[capacity];
		}
		
		public MyStack(int capacity) {
			
			index = 0;
			
			list = new String[capacity];
		}
		
		//3. toString() 재정의 -> 배열 데이터 덤프
		@Override
		public String toString() {
			
			for (String list : list) {
				
//				System.out.printf("%s\t%5s\t%s\t%s\n", m.getName(), m.getAge(), m.getTel(), m.getAddress());
			}
			return null;
		}
		
		//4. 주업무
		public void push(String s) {
			
//			list[++index] = s;
			
			if (list.length == capacity) newArray();
			 
			list[++index] = s;
			
			System.out.println(list[index]);
		}
		
		public void newArray() {
			
			String[] newlist = new String[capacity * 2];
			
			for (int i = 0; i < capacity; i++) {
				
				newlist[i] = list[i];
			}
			
			list = newlist;
		}
		
		public String pop() {
			
			System.out.println(list[index]);
			return list[--index];
		}
		public void size() {
			
			System.out.println(index);
		}
		public void peak() {
			
			System.out.println(list[index]);
		}
		public void trimToSize() {
			
			
		}
}


	//	a. push
	//	b. pop
	//	c. size
	//	d. peak
	//	e. trimToSize