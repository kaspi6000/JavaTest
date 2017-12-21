package com.test.homework;

import java.io.File;
import java.util.HashMap;
import java.util.Set;

public class FileEx02 {
	
	public static void main(String[] args) {
		
//		문제2.
//
//		요구사항] 이미지 파일이 확장자별로 있다. 확장자별로 파일이 몇개인지?
//		리소스] 확장자별 카운트
//		결과] *.gif	: 10개
//		        *.jpg : 15개
//				*.png : 5개
//		추가] mouse.bmp 추가
//				-> 소스 수정 없이 *.bmp : 1개
//		힌트] HashMap 사용
		
		String path = "D:\\파일_디렉토리_문제\\확장자별 카운트";
		File dir = new File(path);
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		File[] list = dir.listFiles();
		
		for (File file : list) {
			if (file.isFile()) {
				
				String fileName = file.getName();
				String ext = fileName.substring(fileName.lastIndexOf(".")+1);
				
				if (!map.containsKey(ext)) {
					map.put(ext, 0);
				} else {
					map.put(ext, map.get(ext) + 1);
				}
				
			}
		}
		
		
		System.out.println("최종 결과");
		
		Set<String> set = map.keySet();
		
		for (String ext : set) {
			System.out.printf("%s : %d개\n", ext, map.get(ext));
		}
		
		
	}
	
}
