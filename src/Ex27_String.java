import java.io.*;

public class Ex27_String {
	public static void main(String[] args) throws IOException {
		
		//인텔리센스(VS), Code Assist(Eclipse)
		//System.out.println("홍길동");
		
		//Code Template
		//System.out.println();
		
		//Shift + Alt + Y : 자동 줄바꿈
		//ㅈㄷㄹㅈㄷㄹㅈㄷㄹㅈㄷㄹㅈㄷㄹㅈㄷㄹㅛㅛㅛ
		
		//Ctrl + /
//		int a;
//		int b;
//		int c;
		
		//Ctrl + Shift + /
		//Ctrl + Shift + \
		/*int d;
		int e;
		int f;*/
		
		/*
		 * 문자열, String
		 * - 기본형(원시형) vs 참조형
		 * - 문자열은 참조형이다.
		 * - String 클래스*/
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();
		//m8();
		//m9();
		
		//q1();
		
		m10();
	}
	
	public static void m10() {
		
		//지역 변수
		//	- 메소드나 제어문안에서 선언된 변수
		
		if (true) {
			int n = 10;
			System.out.println(n);
		}
		
		//System.out.println(n);
		
		for (int i = 0; i < 10; i++) {
			
		}
		
		//i?
		//System.out.println(i);
	}
	
	public static void q1() {
		
		//요구사항]
		//	- 경로 : "D:\Class\Java\JavaTest\src\Ex27_String.java"
		//	- 경로 : "C:\Images\dog.png"
		//1. 파일명? -> "Ex27_String.java"
		//2. 확장자를 뺀 순수한 파일명? -> "Ex27_String"
		//3. 확장자? -> ".java"
		
		//사용]
		//1. indexOf / LastIndexOf
		//2. substring
		
		String path = "D:\\Class\\Java\\JavaTest\\src\\Ex27_String.java";
		
		//파일명
		System.out.println( path.substring(path.lastIndexOf('\\')+1) );
		
		//순수한 파일명
		System.out.println( path.substring(path.lastIndexOf('\\')+1, path.lastIndexOf('.')) );
		
		//확장자
		System.out.println( path.substring(path.lastIndexOf('.')) );
		
	}
	
	public static void m9() {
		
		//문자열 추출
		//	- char charAt(int index)
		//	- String substring(int start, int end);
		//							포함			미포함
		
		String str = "안녕하세요. 홍길동님.";
		System.out.println(str.substring(3, 8));
		System.out.println(str.substring(7, 10));
		
		String jumin = "923456-1234567";
		
		//성별?
		if (jumin.substring(7, 8).equals("1")) {
			System.out.println("male");
		}else {
			System.out.println("female");
		}
		
		//몇년생?
		System.out.println("19" + jumin.substring(0, 2));
		
		//몇월생?
		System.out.println(jumin.substring(2, 4));
		
		
		System.out.println(str.substring(3, 8));
		System.out.println(str.substring(3));
		System.out.println(str.substring(3, str.length())); //x
	}
	
	public static void m8() {
		
		//패턴 검색
		//	- boolean startsWith(String str)
		//	- boolean endsWith(String str)
		
		String name = "홍길동";
		
		//'홍'씨 입니까?
		System.out.println(name.startsWith("홍"));
		System.out.println(name.charAt(0) == '홍');
		System.out.println(name.indexOf("홍") == 0);
		
		//'동'으로 끝납니까?
		System.out.println(name.endsWith("동"));
		System.out.println(name.charAt(name.length() - 1) == '동');
		System.out.println(name.indexOf("동") == name.length() - 1);
		System.out.println(name.lastIndexOf("동") == name.length() - 1);
		
	}
	
	public static void m7() {
		
		//문자열 검색
		//	- 문자열내에서 원하는 문자(열)을 검색 -> 찾은 위치를 반환
		//	- int indexOf(char c);
		//	- int indexOf(String s);
		//	- int indexOf(char c, int startIndex);
		//	- int indexOf(String s, int startIndex);
		
		//	- int lastIndexOf(char c)
		//	- int lastIndexOf(String s)
		
		String str = "안녕하세요. 홍길동님.";
		System.out.println(str.indexOf('홍'));
		String string = "홍길동";
		System.out.println(str.indexOf(string));
		System.out.println(str.indexOf("아무개"));
		
		if (str.indexOf(string) > -1) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
		String jumin = "923456-2345678";
		
		if (jumin.indexOf('-') == 6) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
		//게시판 글쓰기
		//	- 관리자 모드
		//	- 금지어
		String content = "게시판 테스트입니다. eeeee";
		String word = "바보";
		
		if (content.indexOf(word) > -1) {
			System.out.println("금지어 사용 불가");
		}else {
			System.out.println("글쓰기 완료");
		}
		
		//
		str = "안홍길동녕하세요.dfff 홍길동님. 안녕히가세요. 홍길동님.";
		
		System.out.println(str.indexOf(string));
		System.out.println(str.indexOf(string, 8));
		
		int index = str.indexOf(string);
		System.out.println(index);
		
		index = str.indexOf(string, index + string.length());
		System.out.println(index);
		
		index = str.indexOf(string, index + string.length());
		System.out.println(index);
		
		str = "안홍길동녕하세요.dfff 홍길동님. 안녕히가세요. 홍길동님.";
		
		System.out.println(str.indexOf(string));
		System.out.println(str.lastIndexOf(string));
		
	}
	
	public static void m6() {
		
		//문자열 공백 제거
		//	- String trim();
		String str = "		one		two      three		";
		System.out.printf("[%s]\n", str);
		System.out.printf("[%s]\n", str.trim());
	}
	
	public static void m5() {
		//주민번호 입력 -> 반드시 '-'를 입력
		String jumin = "942342-1456786";
		
		if (jumin.charAt(6) == '-') {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
		if (jumin.charAt(7) == '1') {
			System.out.println("male");
		}else {
			System.out.println("female");
		}
	}
	
	public static void m4() throws IOException {
		
		//사용자 아이디 입력 -> 유효성 검사
		//조건]
		//1. 영어 소문자만
		//2. 길이 4자 ~ 12자 이내
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("아이디 입력 : ");
		String id = reader.readLine();
		
		boolean flag = false;
		
		//한글자씩 추출 -> 문자 코드값 비교
		for (int i = 0; i < id.length(); i++) {
			
			char c = id.charAt(i);
			
//			if (c >= 'a' && c <= 'z') {
//				System.out.println("pass");
//			}else {
//				System.out.println("fail");
//			}
			
			if ((c < 'a' || c > 'z') && (c < 'A' || c > 'Z')) {
				flag = true;
				
				break;
			}//문자 검사
			
			//길이 검사
			if (id.length() < 4 || id.length() > 12) {
				flag = true;
			}
		}
		
		//마무리
		if (!flag) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
		
	}

	//Alt + 위아래 방향키 //코드 이동
	//Ctrl + Alt + 위아래 방향키 //코드 복제
	public static void m1() {
		
		//문자열, String
		//	- 자바에서 String 클래스내에 여러가지 기능을 구현
		
		//문자열의 길이
		//	- 문자열을 구성하는 문자의 갯수
		//	- 영문자, 숫자, 한글, 특수문자 등에 상관없이 문자 1개당 1개로 계산(유니 코드)
		//	- int length();
		
		String str = "홍길동입니다.";
		System.out.println(str.length());
		
	}

	private static void m2() throws IOException {
		
		//유효성 검사
		//회원 가입 > 이름 > 길이 제한
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String name = "";
		
		System.out.print("이름 입력 : ");
		name = reader.readLine();
		
//		System.out.println(name.length());
		//이름은 2자 ~ 5자 이내
		if (name.length() >= 2 && name.length() <= 5) {
			System.out.println("회원 가입 완료");
		}else {
			System.out.println("이름을 다시 입력하세요.");
		}
		
		//
		System.out.println(name.length());
		System.out.println("홍길동".length());
	}

	
	private static void m3() {
		
		//문자열 추출
		//	- char charAt(int index)
		//	- 문자열 내에 특정 위치에 있는 문자 1개를 추출
		//	- 자바는 서수를 0부터 시작. Zero-bassed Index 사용
		//	- 문자열 첨자 범위 : 0 ~ (길이 - 1)
		
		String str = "안녕하세요. 홍길동님.";
		
		char c = str.charAt(3);
		
		System.out.println(c);
		
		c = str.charAt(str.length() - 1);
		
		System.out.println(c);
		
		System.out.println();
		
		str = "가나다라마바사"; //사용자 입력
		
		//요구사항] str을 1문자씩 추출해주세요.
		//str.charAt(0)
		//str.charAt(1)
		//str.charAt(2)
		//..
		
		for (int i = 0; i < str.length(); i++) {
			System.out.println(str.charAt(i));
		}
	}
}
