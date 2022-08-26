package P7_StandaloneCollections;

import java.util.Map;

public class Ex2_Map {
	
	Map<String, Integer> courses;

	public Map<String, Integer> getCourses() {
		return courses;
	}

	public void setCourses(Map<String, Integer> courses) {
		this.courses = courses;
	}

	public Ex2_Map(Map<String, Integer> courses) {
		super();
		this.courses = courses;
	}

	public Ex2_Map() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Ex2_Map [courses=" + courses + "]";
	}
	
	

}
