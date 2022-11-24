package netP_ChatServer;
import java.net.Socket;

public class User {
	private String user_id; //이름
	private ChatRoom room; //유저가 속한 채팅방
	private Socket sock; //소켓
	private boolean status; //유저상태 (true면 로그인, false면 오프라인)
	
	public User(String user_id) { //아이디 받고 생성
		this.user_id=user_id;
	}
	public void enterChat(ChatRoom room) {
		this.room=room;
	}
	public void exitChat(ChatRoom room) { //방에서 퇴장
		this.room=null;
	}
	
	public boolean getStatus() { //유저상태 리턴
		return this.status;
	}
	public void setStatus(boolean status) { //유저상태변경
		this.status=status;
	}
	
	public Socket getSocket() { //소켓리턴
		return this.sock;
	}
	public void setSocket(Socket sock) { //소켓셋팅
		this.sock=sock;
	}
	
	
}
