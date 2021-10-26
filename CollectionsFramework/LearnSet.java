import java.util.*;

class LearnSet{
	public static void main(String[] args){

		Set<Integer> s = new HashSet<>();
		// Set<Integer> s = new LinkedHashSet<>();
		// Set<Integer> s = new TreeSet<>();

		s.add(10);
		s.add(2);
		s.add(100);
		s.add(54);


		s.size();
		s.isEmpty();
		s.remove(54);
		s.contains(54);
		s.clear();
		
		System.out.println(s);

	}
}