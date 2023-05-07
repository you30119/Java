package iostream;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

public class MySocketServer {
	public static void main(String[] args) {
		MyServer server = new MyServer();
		server.start();
	}
}

class MyServer extends Thread{
	// 서버소켓은 내 컴퓨터의 IP를 자동으로 가져옴
	// Port는 정해줘야 함
	// 서버는 접속용 소켓1개와 통신용 소켓 여러개를 따로 관리
	ServerSocket serverSocket;			// 서버를 시작하기 위한 소켓(접속용)
	Socket socket;				// 각 소켓을 관리하기 위한 소켓(개개인별)
	
	// 사용자의 정보와 IP를 저장할 수 있는 Map
	HashMap<String, ClientHandler> clients = new HashMap<>();
	
	@Override
	public void run() {
		// 소켓을 연다
		try {
			serverSocket = new ServerSocket(8089); 			// 소켓을 연다(서버 시작)
			while(true) {
				System.out.println("서버 시작 - 요청 대기");
				socket = serverSocket.accept();			// 클라이언트의 접속을 대기하고 들어오면 socket에 옮김
				System.out.println("접속한 클라이언트 : "+socket.getInetAddress());
				
				String clientIp = socket.getInetAddress().toString();
				// MyServer : 접속용 쓰레드, ClientHandler : 통신용 쓰레드
				ClientHandler client = new ClientHandler(socket);
				clients.put(clientIp, client);		// 사용자 정보 배열(Map)로 저장
				client.start();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}

class ClientHandler extends Thread{
	InputStream is;				// 클라이언트의 메시지를 받을 수 있게
	OutputStream os;			// 클라이언트에 메시지를 보낼 수 있게
	ObjectInputStream ois;		// 매핑
	ObjectOutputStream oos;		// 매핑
	Socket socket;			// 대상자의 정보
	String clientIP;		// 대상의 아이피
	
	public ClientHandler(Socket socket) {
		this.socket = socket;
		clientIP = socket.getInetAddress().toString();
	}
	
	@Override
	public void run() {
		try {
			is = socket.getInputStream();
			os = socket.getOutputStream();
			ois = new ObjectInputStream(is);
			oos = new ObjectOutputStream(os);
			
			while(true) {
				String msg = (String)ois.readObject();			// 메시지를 받음 (받을 때까지 대기함)
				System.out.println(clientIP+" 클라이언트의 메시지 : "+msg);
				oos.writeObject("서버로부터 되돌아온 메시지 : "+msg); 		// 클라이언트에 메시지 전송
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
	}
}