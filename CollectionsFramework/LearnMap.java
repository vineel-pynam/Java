import java.util.*;

class LearnMap{
	public static void main(String[] args){

		// Map<String, int> numbers = new HashMap<>();
		Map<String, int> numbers = new TreeMap<>();


		numbers.put("one", 1);
		numbers.put("two", 2);
		numbers.put("three", 3);
		numbers.put("four", 4);


		numbers.putIfAbsent("two", 200);

		numbers.containsKey("two");
		numbers.containsValue(20);
		numbers.isEmpty();
		numbers.clear();
		numbers.remove("one");

		for( Map.Entry<String, int> mp : numbers.entrySet() ){
			System.out.println(mp);
			System.out.println(mp.getKey());
			System.out.println(mp.getValue());
		}

		for( String e : numbers.keySet() ){
			System.out.println(e);
		}


		for( int e : numbers.values() ){
			System.out.println(e);
		}
	}
}