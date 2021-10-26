import java.util.*;


public class LearnCustomSet{
	public static void main(String[] args){

		Set<Student> s = new HashSet<>();

		s.add(new Student("Vineel", 10));
		s.add(new Student("Rajesh", 10));
		s.add(new Student("Suresh", 10));

		System.out.println(s);

	}
}