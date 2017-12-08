import java.util.Scanner;

public class SolutionString {
	
	public static void main(String[] args) {
		//solution1();
		//solution2();
		//solution3();
		solution4();
	}
	
	public static void solution4() {
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("숫자 : ");
//		String num = scan.nextLine();
		
		String test = "1";
		
		String num1 = "일";
		String num2 = "이";
		String num3 = "삼";
		String num4 = "사";
		String num5 = "오";
		String num6 = "육";
		String num7 = "칠";
		String num8 = "팔";
		String num9 = "구";
		
		String num10 = "십";
		String num11 = "백";
		String num12 = "천";
		
		int count = 0;
		int len = test.length();
		int target = 0;
		
		for (int i = 0; i < len; i++) {
//			target = Integer.parseInt();
			System.out.println(target);
		}
		
	}
	
	public static void solution3() {
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("숫자 : ");
//		String num = scan.nextLine();
		
		String test = "1256232";
		String result = "";
		
		for (int i = test.length() - 3; i > 0; i -= 3) {
			 String test1 = test.substring(0, i);
			 String test2 = test.substring(i);
			 System.out.println("test1 : " + test1);
			 System.out.println("test2 : " + test2);
			 result = test1 + ',' + test2;
			 System.out.println(i + " : " + result);
//			 System.out.println("result1 : " + result.substring(i, 4));
			 
		}
		System.out.println(result);
//		System.out.println(test);
	}
	
	public static void solution2() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		String num = scan.nextLine();
		
		if (num.length() <= 3) {
			for (int i = num.length(); i < 3; i++) {
				num+="0";	
			}
//			for (int j = num.length() - 1; j >= 0; j--) {
//				System.out.print(num.charAt(j));
//			}
			System.out.println(num);
		}
	}
	
	public static void solution1() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("문자 : ");
		String str = scan.nextLine();
		
		System.out.print("결과 : ");
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		
		System.out.println();
	}
}
