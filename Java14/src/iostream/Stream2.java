package iostream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Stream2 {
	public static void main(String[] args) {
		// File 클래스를 통해서 파일을 읽고 쓰기
		// Stream : input == 내 프로그램으로 가져온다, output == 내 프로그램에서 내보낸다
		ControlFile cf = new ControlFile();
		//cf.readFile("C:\\log\\log.txt");			// 읽는 부분	
		//cf.createFile("C:\\log\\");				// 만드는 부분
		//cf.putFile("C:\\log\\myfile.txt");		// 쓰는 부분
		cf.deleteFile("C:\\log\\myFile.txt"); 		// 삭제하는 부분
	}
}

class ControlFile{
	private Scanner sc = new Scanner(System.in);
	
	// 파일 읽기 : FileInputStream, InputStreamReader, BufferedReader
	public void readFile(String path) {
		// FileInputStream : 파일(file)에 있는 데이터를 내 프로그램으로(Stream) 가져온다(Input)
		FileInputStream fis = null;		// null을 넣는 이유는 try-catch 때문
		
		try {
			// 파일에 있는 데이터를 읽음 (1바이트 단위로)
			fis = new FileInputStream(path);
			// utf-8이라는 것을 알려줌
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			BufferedReader br = new BufferedReader(isr);		// byte[] -> String
			
			String str = null;
			while((str = br.readLine()) != null) {		// 한줄을 읽어 str에 저장하고 null 먼저 비교
				System.out.println(str);			// 읽어왔다면 출력
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("파일 읽기 실패..");
		}catch(Exception e) {
			System.out.println("변환 실패");	
		} finally {
			// try를 실행하건, catch를 실행하건 무조건 마무리 작업
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}		// readFile()
	
	// 파일 만들기 :
	public void createFile(String path) {
		System.out.println("파일명을 입력하세요>>");
		String filename = sc.next();
		File file = new File(path+filename+".txt");
		
		// 해당 파일이 이미 있다면 만들지 않는다
		if(file.exists()) {
			System.out.println("이미 존재하는 파일입니다.");
			return;			// return을 하는 순간 함수 즉시 종료
		}
		
		try {
			file.createNewFile();			// 파일 생성 코드
			System.out.println(filename+"파일을 생성했습니다.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 입력하기 : 내 프로그램 -> 운영체제 프로그램 (OutputStream)
	public void putFile(String pathfile) {			 
		FileOutputStream fos = null;
		
		try {
			fos = new FileOutputStream(pathfile);		// 기존에 있는 문자에 이어쓰고 싶으면 true ==> FileOutputStream(pathfile, true)
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("입력할 내용>>");
		String str = sc.nextLine();
		str += "\n";		// 줄바꿈
		
		// 파일로 옮기기 위해선 byte단위로 바꿔야함
		byte[] byteArray = str.getBytes();		// String -> byte[]
		try {
			fos.write(byteArray);		// 파일에 쓰기
			System.out.println("입력 성공");
		} catch (IOException e) {		
			e.printStackTrace();
		} finally {
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}		// putFile()
	
	// 삭제하기 : 파일 경로와 확장자를 입력하면 삭제
	public void deleteFile(String _file) {
		File file = new File(_file);
		boolean result = file.delete();			// 해당 파일을 삭제하는 코드
		
		if(result == true) {
			System.out.println("삭제 성공");
		}
		else {
			System.out.println("삭제 실패");
		}
	}
}

