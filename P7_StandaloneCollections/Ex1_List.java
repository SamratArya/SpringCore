package P7_StandaloneCollections;

import java.util.List;

public class Ex1_List {
	
	List<String> friends;

	public Ex1_List(List<String> friends) {
		super();
		this.friends = friends;
	}

	public Ex1_List() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	@Override
	public String toString() {
		return "Ex1_List [friends=" + friends + "]";
	}
	
	

}
