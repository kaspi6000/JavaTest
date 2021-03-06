class Ex14_Operator {
	public static void main(String[] args) {

		//연산자, Operator
		//	- 피연산자(Operand)를 대상으로 미리 정해진 연산을 한 후에 결과값을 반환하는 역할

		//1. 산술 연산자
		//	- +, -, *, /, %
		//	- 이항 연산자(2항)

		int a = 10;
		int b = 3;

		System.out.println(a + b);	//13
		System.out.println(a - b);	//7
		System.out.println(a * b);	//30
		System.out.println(a / b);	//3
		System.out.println(a % b);	//1

		//나머지 작업
		// -> 모든 산술 연산은 두 피연산자 중 더 큰 자료형으로 연산 결과가 반환된다.
		System.out.println(10 / 3);
		System.out.println(10.0 / 3.0);
		System.out.println(10 / 3.0);
		System.out.println(10.0 / 3);

		byte b1 = 10;
		int n1 = 20;
		System.out.println(b1 + n1);

		int n2 = 2000000000;
		int n3 = 1000000000;
		System.out.println((long)n2 + n3);


		//정수형 리터럴 = int형

		byte b2 = 10,
			 b3 = 20,
			 b4;

		b4 = (byte)(b2 + b3);
		System.out.println(b4);


		//2. 비교 연산자
		//	- 피연산자들의 비교 우위를 반환하는 역할
		//	- 이항 연산자
		//	- >, >=, <, <=, ==(equal), !=(not equal)
		//	- A > B : 정수형, 실수형 대상
		//	- 항상 연산의 결과를 boolean을 반환한다.(true, false)

		int result = 0;

		result = 1 + 2 + 3 + 4;

		System.out.println(result);


		a = 10;

		b = 3;
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);
		
		//실수와 정수간의 비교
		System.out.println(3.5 > 3);
		
		//논리형 비교x
		//System.out.println(true > false);
		System.out.println(true == false);

		//문자형 비교
		System.out.println('A' > 'B'); //유효성 검사
		
		//사용자 문자 입력 -> 'c' -> 영어 소문자?
		char input = 'D';
		System.out.println(input >= 'a');
		System.out.println(input <= 'z');
		

		//문자열(참조형) 비교
		String s1 = "홍길동";

		String s2 = "홍길동";

		String s3 = "홍";

		s3 = s3 + "길동";
		System.out.println(s3);
		//System.out.println(s1 > s2);
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);

		//모든 참조형(문자열)의 비교는 비교 연산자(==, !=)를 사용할 수 없다.
		// -> equals() 메소드 사용
		System.out.println();
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println();

		int m1 = 10;

		int m2 = 10;

		int m3 = 5;

		m3 = m3 + 5;
		System.out.println(m1 == m2);
		System.out.println(m1 == m3);

		System.out.println(2 * 3 > 4 / 2);
		System.out.println((2 * 3) > (4 / 2));
		
		//3. 논리 연산자
		//	- 이미 정해진 연산 규칙에 따라 결과를 반환
		//	- 이항 연산자(&&, ||)
		//	- 일항 연산자(!)
		//	- &&(and), ||(or), !(not)
		//	- 피연산자를 boolean만 갖는다.
		//	- 연산의 결과를 boolean만 반환한다.

		System.out.println();
		System.out.println();

		boolean f1 = true;

		boolean f2 = false;
		System.out.println(f1 && f2);
		System.out.println(f1 || f2);

		//나이 입력 -> 통과, 거절
		//조건 : 20세 이상 ~ 60세 미만
		int age = 25;
		//System.out.println(20 <= age < 60);
		System.out.println((20 <= age) && (age < 60));
		System.out.println((age >= 20) && (age < 60));

		//&& -> ||
		System.out.println(!((age < 20) || (age >= 60)));

		//age >= 20	//O
		//20 <= age	//X

		//short circuit
		age = 10;
		System.out.println((age >= 20) && (age < 60));
		System.out.println(!((age < 20) || (age >= 60)));

		//4. 대입 연산자
		//	- 할당 연산자
		//	- 이항 연산자
		//	- LValue(변수) = RValue(상수, 변수)
		//	- LValue와 RValue는 반드시 자료형 동일(형변환 관계)
		//	- =
		//	- +=, -=, *=, /=, %= //복합 대입 연산자
		//	- 연산자 우선 순위가 가장 낮다.
		
		int num = 10;

		//10 = 5;

		num = num + 1;
		num += 1;
		System.out.println(num);	//12
		num = num - 1;
		num -= 1;
		System.out.println(num);	//10

		num *= 3; //num = num * 3;
		System.out.println(num);	//30

		num /= 4; //num = num / 4;
		System.out.println(num);	//7

		num %= 3; //num = num % 3;
		System.out.println(num);	//1

		//주의
		//num = 100 - num;
		//num -= 100;

		//연산 우선 순위
		//	- 한 문장내에서 연산자들이 2개 이상 존재할 때 실행할 순서
		//	- () > 산술 > 비교 > 논리 > 대입

		//연산자 실행 방향
		//	- 한 문장내에서 동급의 연산자가 2개 이상 존재할 때
		//	- 대부분 : 왼쪽 -> 오른쪽
		//	- 대입 연산자 : 왼쪽 <- 오른쪽

		/*int a,
			b,
			c;
		a = 10;

		b = a;

		c = a;

		c = b = a;*/

		//5. 증감 연산자
		//	- ++(증가), --(감소)
		//	- 단항연산자
		//	- 피연산자의 값을 +1 / -1
		//	- 상황에 따라 연산자 우선 순위 변경된다.
		//		a. ++num : 전위(연산자 우선 순위 최고)
		//		b. num++ : 후위(연산자 우선 순위 최하)

		num = 10;
		
		//num = num + 1;
		//num += 1;
		++num;
		System.out.println(num); //11

		--num;
		System.out.println(num); //10

		num = 10;
		result = 0;

		//result = 20 + ++num;
		++num;
		result = 20 + num;
		System.out.println(result);

		num = 10;
		result = 0;

		//result = 20 + num++;
		result = 20 + num;
		num++;
		System.out.println(num);
		System.out.println(result);

		int o = 10;
		System.out.println(--o-o--);

		num++;
		++num;
		num--;
		--num;

		//6. 조건 연산자
		//	- 조건을 제시하고 그 결과에 따라 연산의 결과를 반환
		//	- 삼항 연산자
		//	- A ? B : C
		//	- A(조건식 -> 반드시 boolean값)
		//	- B, C : 변수, 상수

		num = true ? 10 : 20;
		System.out.println(num);

		age = 25;
		String msg = (age >= 20 && age < 60) ? "통과" : "거절";
		System.out.printf("나이 %d세는 '%s'입니다.\n", age, msg);
		


		
		
	}
}
