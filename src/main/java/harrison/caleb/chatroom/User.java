package harrison.caleb.chatroom;

import lombok.Data;

@Data
public class User {
	private String name = "unknown";
	private SocketEndPoint endPoint;
	private boolean online;
	
	
	public String getName() {
		return name;
	}

	public boolean getOnlineStatus() {
		return online;
	}

	public void setOnlineStatus(boolean newStatus) {
		this.online = newStatus;
	}
	
}


