import java.util.*;

class LearnStack{
	public static void main(String[] args){

		Stack<String> s = new Stack<>();

		s.push("Cat");
		s.push("Dog");
		s.push("Horse");
		s.push("Lion");

		s.pop();

		System.out.println(s.peek());

	}
}