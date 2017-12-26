package com.test.question;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Arrays;
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
		String path = "/home/kang/eclipse-workspace/JavaTest1216/자바예약어.dat";
		String path1 = "/home/kang/eclipse-workspace/JavaTest1216/자바소스.java";
		BufferedReader reader = null;
		String test = "";
		String[] t;
//		int num;
		try {
			
			reader = new BufferedReader(new FileReader(path));
			
			
			String line = "";
			
			HashMap<String, Integer> map = new HashMap<String, Integer>();
			
			ArrayList<String> list = new ArrayList<String>();
			ArrayList<String> list1 = new ArrayList<String>();
			ArrayList<String> testt = new ArrayList<String>();
			ArrayList<Integer> cntList = new ArrayList<Integer>();
			
			while ((line = reader.readLine()) != null) {
			
				line = line.trim();
				String[] temp = line.split("\n");
				list.add(temp[0]);
			}
			reader.close();
			
			reader = new BufferedReader(new FileReader(path1));
			
			while ((line = reader.readLine()) != null) {
				
				line = line.trim();
				String[] temp = line.split(" ");
				for (int i = 0; i < temp.length; i++) {
					
					list1.add(temp[i]);
				}
//				System.out.println(Arrays.toString(temp));
			}
			System.out.println("list : " + list);
			System.out.println("list1 : " + list1);
			
			for (int i = 0; i < list1.size(); i++) {
				
				for (int j = 0; j < list.size(); j++) {
					
					if (list1.get(i).contains(list.get(j))) {
						
						num = 0;
						num++;
						test += list.get(j) + " ";
						
//						System.out.println(test);
//						System.out.printf("%s : %d회\n", list.get(j), num);
					}
				}
			}
			t = test.split(" ");
			System.out.println(Arrays.toString(t));
			for (int i = 0; i < t.length; i++) {
				testt.add(t[i]);
				int cnt = 0;
				for(int searchIndex = i; searchIndex < t.length; searchIndex++){
                    if(t[i] == t[searchIndex]){
                        cnt++;
                    }
				}
				cntList.add(cnt);
				System.out.println(cnt);
			}
//			ArrayList<String> liss = new ArrayList<String>();
//			String[] lis = test.split("\n");
//			for (int i = 0; i < lis.length; i++) {
//				liss.add(lis[i]);
//				
//			}
//			for (int i = 0; i < list.size(); i++) {
//				for (int j = 0; j < liss.size(); j++) {
//					
//					if (list.get(i).contains(liss.get(j))) {
//						num = 0;
//						num++;
//						System.out.printf("%s : %d회\n", list.get(i), num);
//					}
//				}
//			}
			
//			System.out.println("lis" + Arrays.toString(lis));
//			System.out.println(liss);
			System.out.println("test : " + test);
			System.out.println(list.size());
			System.out.println(list1.size());
//			for (int i = 0; i < list.size(); i++) {
//				
//				for (int j = 0; j < list1.size(); j++) {
////					String test = list.get(i);
//					if (list.get(i).contains(list1.get(j))) {
////					if(list1.contains(test)) {
////						System.out.println("list1 : " + list1.get(0));
//						num = 0;
//						num++;
//						System.out.printf("%s : %d회\n", list.get(i), num);
//						break;
//					}
//				}
//			}
//			System.out.println(list.get(7));
//			System.out.println(num);
//			System.out.println(list.get(7).equals(list1.get(2)));
			System.out.println(list.get(7).contains(list1.get(4)));
			System.out.println(list1.get(4).contains(list.get(7)));
			
			reader.close();
		} catch (Exception e) {
			System.out.println("load : " + e.toString());
		}
	}
}
