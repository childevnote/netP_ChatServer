package netP_ChatServer;
import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
	private int id; //채팅방id
	private List<User> userList; //채팅방에 참가한 유저들 리스트
	private User master; //방장
	
	public ChatRoom(User user) { //유저가 방을 만들때
		userList = new ArrayList<User>();
		user.enterChat(this);
		userList.add(user);
		this.master=user;
	}
	
	public void enterUser(User user) { //채팅방에 타 유저 참가
		user.enterChat(this);
		userList.add(user);
	}
	
	public void exitUser(User user) { //유저가 방을 나갔을때
		user.exitChat(this);
		userList.remove(user);
		if(userList.size()<1) { //다 나갔을때
			//채팅방을 제거하는 코드
		}
		if(userList.size()<2) { //한명 빼고 다 나가면
			this.master=userList.get(0);
		}
	}
	
	
}
