package com.test.question;

public class Test {

	/*
	 	문제1.
	 	요구사항] 음악 파일이 100개 있다. 파일명 앞에 숫자를 붙이시오.
	 	리소스]	음악파일
	 	결과]		
	 	[001]7 go up-Yum-Yum (얌얌).mp3
	 	[002]10cm-봄이 좋냐__.mp3
	 	..
	 	[100]헤이즈-돌아오지마 (Feat. 용준형 Of 비스트).mp3
	 	
	 	문제2.
		요구사항] 이미지 파일이 확장자별로 있다. 확장자별로 몇개인지 카운트?
		리소스] 	확장자별 카운트
		결과]		*.gif : 10개
				*.jpg : 5개
				*.png : 3개
		추가]		mouse.bmp 추가
				-> 소스 수정없이 *.bmp : 1개
		힌트]		HashMap 사용
		
		문제3.
		요구사항] delete 폴더를 삭제하시오
		리소스]	폴더 삭제 > delete
		결과]		폴더를 삭제했습니다.
		힌트]		파일 개수 -> 재귀 메소드
		추가]		폴더 3개와 파일 6개를 삭제했습니다.
		
		문제4.
		요구사항] 사이즈가 0byte인 파일만 골라서 삭제하시오.
		리소스]	파일 제거
		결과]		총 34개의 파일을 삭제했습니다.
		
		문제5.
		요구사항] Music_1 과 Music_2 폴더를 서로 비교해서 양쪽 폴더에 모두 존재하는 파일만을 출력하시오.(중복 파일 골라내기)
		리소스]	동일 파일
		결과]
		7 go up-Yum-Yum (얌얌).mp3
		10cm-봄이 좋냐_.mp3
		..
		
		문제6.
		요구사항] 모든 폴더의 파일을 대상으로 크기가 큰 순으로 정렬하시오.
		리소스]	크기 정렬
		결과]		모든 폴더의 파일을 한번에 출력
		[파일명]		[크기]		[폴더]
		aaa.exe		57KB		AAA
		bbb.exe		50KB		BBB
		ccc.dat		41KB		AAA
		ddd.txt		20B			CCC
		힌트]	처음 시작(각 폴더의 모든 파일을 1개의 ArrayList<File>에 모아놓고 시작) + 정렬(버블 정렬)

	  	문제7.
	  	요구사항] 직원 폴더를 접근 -> 직원별 이름으로 폴더 생성 -> 년도별 폴더 생성 -> 각 파일들을 해당 폴더로 이동
	  	리소스]	직원
	  	결과]		분류가 완료되었습니다.
	 */
}