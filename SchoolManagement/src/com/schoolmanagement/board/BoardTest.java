package com.schoolmanagement.board;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class BoardTest {

	private static Scanner scan;
	private static final String PATH = "/home/kang/SchoolManagement/쌍용고등학교/쌍용고등학교_Board";
	private static ArrayList<String> boardList;
	private static BufferedReader reader = null;
	private static BufferedWriter writer = null;
	private static int pageNum = 0;
	private static int pageTotla = 10;
	
	static {
		
		scan = new Scanner(System.in);
		boardList = new ArrayList<String>();
	}
	
	private static void write() {
	
		try {
			
			System.out.println("========================================================================");
			System.out.println("                                                     게시판 글쓰기");
			System.out.println("========================================================================");
			System.out.println();
			
			System.out.print("비밀번호 : ");
			String pwd = scan.nextLine();
			
			System.out.print("제목 : ");
			String title = scan.nextLine();
			
			System.out.print("작성자 : ");
			String author = scan.nextLine();
			
			System.out.print("내용 : ");
			String content = scan.nextLine();
			
			String[] temp = boardList.get(0).split("_");
			String n = temp[0];
			
			int num = Integer.parseInt(n) + 1;
			
			writer = new BufferedWriter(new FileWriter(PATH + "/" + num + "_" + title + "_" + pwd + ".txt"));
			
			writer.write("[" + author + "]");
			writer.newLine();
			writer.write(content);
			
			writer.close();
			
			boardList.add(num + "_" + title + "_" + pwd + ".txt");
			
			System.out.println();
			System.out.println("글쓰기가 정상적으로 완료되었습니다.");
			
			list();
		} catch (Exception e) {
			System.out.println("write : " + e.toString());
		}
	}
	
	public static void read(String num) {
		
		try {
//			System.out.println(boardList);
			BoardData data = new BoardData();
			
			for (int i = 0; i < boardList.size(); i++) {
				
				String[] temp = boardList.get(i).split("_");
				
				data.setNum(temp[0]);
				data.setTitle(temp[1]);
				data.setBoardPwd(temp[2].replace(".txt", ""));
				
				if (num.equals(data.getNum())) {
					
					String path = PATH + "/" + data.getNum()+ "_" + data.getTitle() + "_" + data.getBoardPwd() + ".txt";
					
					reader = new BufferedReader(new FileReader(path));
					
					System.out.println("========================================================================");
					System.out.println("\t\t\t\t\t" + data.getNum() + ". " + data.getTitle().replace(".txt", ""));
					System.out.println("========================================================================");
					System.out.println();
				}
			}
			
			String line = "";
			
			while ((line = reader.readLine()) != null) {
				
				System.out.println(line);
			}
			
			reader.close();
			
			String[] test = boardList.get(0).split("_");
			
			data.setNum(test[0]);
			
			System.out.println();
			
			System.out.println("b : 목록으로, p : 이전 글, n : 다음 글, d : 게시글 삭제");
			String input = scan.nextLine();
			
			if (input.equals("b") || input.equals("B")) list();
			else if (input.equals("p") || input.equals("P")) {
				
				if (num.equals("1")) {
					
					System.out.println("첫번째 글 입니다.");
					read(num);
				}
				
				read(String.valueOf(Integer.parseInt(num) - 1));
			}
			else if (input.equals("n") || input.equals("N")) {
				
				if (num.equals(data.getNum())) {
					
					System.out.println("마지막 글 입니다.");
					read(num);
				}
				
				read(String.valueOf(Integer.parseInt(num) + 1));
			}
			else if (input.equals("d") || input.equals("D")) delete(num);
			
		} catch (Exception e) {
			System.out.println("list : " + e.toString());
		}
	}

	private static void delete(String num) {
		
		System.out.println("========================================================================");
		System.out.println("                                                     게시글 삭제");
		System.out.println("========================================================================");
		System.out.println();
		
		String input = "";
		
		System.out.print("비밀번호 입력 : ");
		input = scan.nextLine();
		
		BoardData data = new BoardData();
		
		for (int i = 0; i < boardList.size(); i++) {
			
			String[] temp = boardList.get(i).split("_");
			
			data.setNum(temp[0]);
			data.setTitle(temp[1]);
			data.setBoardPwd(temp[2].replace(".txt", ""));
			
			if (num.equals(data.getNum())) {
				
				String path = PATH + "/" + data.getNum()+ "_" + data.getTitle() + "_" + data.getBoardPwd() + ".txt";
				
				File file = new File(path);
				
				if (input.equals(data.getBoardPwd())) {
					
					file.delete();
					boardList.clear();
					File dir = new File(PATH);
					
					File[] files = dir.listFiles();
					
					for (File file1 : files) {
						
						if (file1.isFile()) {
							
							boardList.add(file1.getName());
						}
					}
					System.out.println();
					System.out.println("게시글이 정상적으로 삭제가 완료되었습니다.");
				}else {
					
					System.out.println();
					System.out.println("비밀번호가 틀렸습니다.");
				}
			}
		}
		System.out.println();
		System.out.print("b : 목록으로 돌아가기");
		input = scan.nextLine();
		
		if (input.equals("b") || input.equals("B")) list();
	}

	public static void list() {
		
		System.out.println("========================================================================");
		System.out.println("                                                     게시판");
		System.out.println("========================================================================");
		System.out.println();
		
		Collections.sort(boardList, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				String[] test = o1.split("_");
				int t = Integer.parseInt(test[0]);
				
				String[] test1 = o2.split("_");
				int t1 = Integer.parseInt(test1[0]);
//				return o2.compareTo(o1);
				return t1 - t;
			}
		});
		
		BoardData data = new BoardData();
		if (pageNum >= 0) {
		
			if (pageTotla > boardList.size()) {
				for (int i = pageNum; i < boardList.size(); i++) {
					
					String[] temp = boardList.get(i).split("_");
					
					data.setNum(temp[0]);
					data.setTitle(temp[1]);
					
					System.out.println(data);
				}
			}else {
				for (int i = pageNum; i <  pageTotla; i++) {
					
					String[] temp = boardList.get(i).split("_");
					
					data.setNum(temp[0]);
					data.setTitle(temp[1]);
					
					System.out.println(data);
					
				}
			}
		}else {
			
			System.out.println("첫번째 페이지 입니다.");
			System.out.println();
			
			pageNum = 0;
			pageTotla = 10;
			
			list();
		}
		
		System.out.println();
		
		System.out.print("확인하고 싶은 글번호(n 다음페이지, p 전페이지, a 글쓰기)를 입력하시오.");
		
		String input = scan.nextLine();
		
		if (input.equals("a") || input.equals("A")) write();
		else if (input.equals("n") || input.equals("N")) {
			
			pageNum -= 10;
			pageTotla -= 10;
			list();
		}
		else if (input.equals("p") || input.equals("P")) {
			
				pageNum += 10;
				pageTotla += 10;
				list();
		}
		else read(input);
		
	}
	
	public static void main(String[] args) {
	
		File dir = new File(PATH);
		
		File[] files = dir.listFiles();
		
		for (File file : files) {
			
			if (file.isFile()) {
				
				boardList.add(file.getName());
			}
		}
		
		list();
	}
}
