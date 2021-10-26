import java.util.*;

class LearnArrayList{
	public static void main(String[] args){

		List<Integer> list = new ArrayList<>();

		// add functions adds elements to end
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);

		List<Integer> new_list = new ArrayList<>();
		new_list.add(10);
		new_list.add(20);
		new_list.add(20);
		new_list.add(20);
		

		// addAll function is for combinig two lists
		list.addAll(new_list);


		// removes based on index
		list.remove(1);

		// removes based on value
		list.remove(Integer.valueOf(20));

		// removes all elements
		list.clear();

		// sets 2 index to 100
		list.set(2, 100);

		// returns true or false
		list contains(50);


		// looping 

		for( Integer ele : list ){
			System.out.println(ele);
		}


		Iterator<Integer> it = List.iterator();
		while( it.hasNext() ){
			System.out.println(it.next());
		}

		System.out.println(list);

	}
}