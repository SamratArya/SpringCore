package P4_ConstructorInjection;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Ex2_Map1 {
	
	String question;
	int id;
	Map<String, String> answer;

	public Ex2_Map1() {
		super();
		
	}

	public Ex2_Map1(String question, int id, Map<String, String> answer) {
		super();
		question = question;
		this.id = id;
		this.answer = answer;
	}
	
	
	public void checkAnswer()
	{
		System.out.println("Question : "+question);
		System.out.println("Question ID : "+id);
		
		System.out.println("Answer : ");
		Set set = answer.entrySet();
		Iterator itr = set.iterator();
		
		while(itr.hasNext())
		{
			Map.Entry entry = (Entry) itr.next();
			System.out.println("Key : "+entry.getKey()+" Value : "+entry.getValue());
		}
		
	}

}
