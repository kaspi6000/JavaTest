package com.schoolmanagement.board;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Board {
	
	private ArrayList<BoardData> board;
	
	public Board() {

		board = new ArrayList<BoardData>();
	}
		
	public List<BoardData> list(){
			
		ArrayList<BoardData> result = new ArrayList<BoardData>();
			
		for (BoardData rec : board){
			rec.setNum(board.indexOf(rec)+1);
			result.add(rec);
        }
		
		Collections.reverse(result);
        
		return result;
    }
	
    public void write(BoardData brd) {
    
        board.add(brd);
    }

    public BoardData read(int num) {
    
    	return board.get(num);
    }
	    
}

//public class Board {
//
//	public static void main(String[] args) {
//		
//		System.out.println("========================================================================");
//		System.out.println("\t\t\t\t게시판");
//		System.out.println("========================================================================");
//		System.out.println();
//		
//		BufferedReader reader = null;
//		
//		ArrayList<String> list = new ArrayList<String>();
//		
//		String path = "D:\\SchoolManagement\\월봉고등학교\\월봉고등학교_Board";
//		
//		File dir = new File(path);
//		
//		File[] files = dir.listFiles();
//		
//		String test = "";
//		String[] test1 = null;
//		
//		for (File file : files) {
//			
//			if (file.isFile()) {
//				list.add(file.getName());
//				test += file.getName() + ",";
//			}
//		}
//		System.out.println(list);
//		System.out.println();
//		System.out.println(test);
//		
////		try {
////		
////			path = path + "\\" + list.get(0);
////			reader = new BufferedReader(new FileReader(path));
////			
////			String line = "";
////			
////			while ((line = reader.readLine()) != null) {
////				
////				System.out.println(line);
////			}
////			
////			reader.close();
////			
////		} catch (Exception e) {
////			System.out.println("main : " + e.toString());
////		}
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("확인하고 싶은 글번호( 다음페이지(n), 전페이지(p), 글쓰기(a) )를 입력하시오.");
//		
//		String input = scanner.nextLine();
//		
//		if (input.equals("n")) n();
//		else if (input.equals("p")) p();
//		else if (input.equals("a")) a();
//	}
//
//	private static void a() {
//		
//		System.out.println("글쓰기가 완료되었습니다.");
//	}
//
//	private static void p() {
//		
//		System.out.println("전 페이지 입니다.");
//	}
//
//	private static void n() {
//		
//		System.out.println("다음 페이지 입니다.");
//	}
//}
