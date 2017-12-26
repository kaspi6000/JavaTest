package com.test.question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;

public class TestDat {
	
	private static int num;
	
	public static void main(String[] args) {
		
		solution9();
	}

	private static void solution9() {
		
//		문제9.
//		리소스] 자바소스.java, 자바예약어.dat
//		요구사항]	소스에서 예약어가 총 몇회 사용되었는지?
//		결과]
//		if : 5회
//		continue : 2회
//		...
//		abstract : 0회
		String path = "D:\\\\파일_입출력_문제\\\\자바예약어.dat";
		String path1 = "D:\\\\파일_입출력_문제\\\\자바소스.java";
		BufferedReader reader = null;
		try {
			
			reader = new BufferedReader(new FileReader(path));
			
			
			String line = "";
			
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			
			ArrayList<String> list = new ArrayList<String>();
			ArrayList<String> list1 = new ArrayList<String>();
			
			while ((line = reader.readLine()) != null) {
			
				String[] temp = line.split("\n");
//				System.out.println(num + ". " + line);
				list.add(temp[0]);
//				num++;
				
//				if (!map.containsKey(line)) {
//					map.put(line, 1);
//					System.out.println(line);
//					System.out.println(map.get(line));
//				}else {
//					map.put(line1, map.get(line1) + 1);
//					System.out.println(map.get(line1));
//				}
			}
			
			reader.close();
			reader = new BufferedReader(new FileReader(path1));
			
			while ((line = reader.readLine()) != null) {
				
//				String test = line1.replace("\r", "").replace("\n", "").replace("\t", "");
				String[] temp = line.split("\n");
				list1.add(temp[0]);
//				System.out.println(Arrays.toString(temp));
			}
			reader.close();
			
			System.out.println(list);
			System.out.println(list1);
			
			for (int i = 0; i < list.size(); i++) {
				
				for (int j = 0; j < list1.size(); j++) {
					
					if (list.get(i).contains(list1.get(j))) {
						num = 0;
						num++;
						System.out.printf("%s : %d회\n", list.get(i), num);						
						break;
					}
				}
			}
//			System.out.println(list.get(7));
//			System.out.println(num);
//			System.out.println(list.get(7).equals(list1.get(2)));
//			System.out.println(list.get(7).contains("class"));
			
		} catch (Exception e) {
			System.out.println("load : " + e.toString());
		}
	}
}
