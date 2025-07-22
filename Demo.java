import java.util.*;
public class Demo {
	public static void main(String[] args) {
		Set<String> friends=new HashSet<String>();
		friends.add("Pratiksha");
		friends.add("manoj");
		friends.add("suhani");
		friends.add("aniket");
		friends.add("virendra");
		if(friends.contains("virendra"))
		{
			System.out.println("virendra is your friends :");
		}
		else
		{
			System.out.println("virendra is not your friends :");
		}
		
		System.out.println("total friends "+friends.size());
		for(String friend:friends)
		{
			System.out.println(friend);
		}
			
	}

}
