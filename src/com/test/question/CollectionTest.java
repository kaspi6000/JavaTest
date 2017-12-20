package com.test.question;

public class CollectionTest {

	public static void main(String[] args) {
		
		MyStack stack = new MyStack(100);
		
		System.out.println("test");
		stack.push("100");
		stack.pop();
		stack.size();
		stack.push("100");
		stack.size();
		
		MyStack stack1 = new MyStack();
		
		stack1.push("100");
		stack1.push("200");
		stack1.push("300");
		stack1.push("400");
		stack1.push("500");
		stack1.push("600");
		stack1.push("510");
		stack1.push("620");
		stack1.push("530");
		stack1.push("640");
		
		
		
		//컬렉션 클래스를 선언하시오.
		
		//공통
		//	a. 멤버변수
		//	b. 생성자
		//	c. toString()
		
		//1. ArrayList
		//	a. add
		//	b. get
		//	c. set
		//	d. remove
		//	e. size
		//	f. trimToSize
		
		//2. HashMap
		//	a. put : 추가, 수정
		//	b. get
		//	c. remove
		//	d. size
		//	e. trimToSize
		
		//3. Stack
		//	a. push
		//	b. pop
		//	c. size
		//	d. peak
		//	e. trimToSize
		
		//4. Queue
		//	a. add
		//	b. poll
		//	c. size
		//	d. peak
		//	e. trimToSize
		
		//1. ArrayList
		//2. HashMap
		//3. Stack
		//4. Queue
	}
}
