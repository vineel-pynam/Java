class Employee{
	String Name;
	String Company;
	int Age;


	public Employee(String name, String company, int age){
		this.Name = name;
		this.Company = company;
		this.Age = age;
	}


	public void introduceYourSelf(){
		System.out.println(
			"Name: " + Name + "\n" + 
			"Company: " + Company + "\n" +
			"Age: " + Age
		);
	}
}


class Developer extends Employee{
	String FavProgrammingLanguage;

	Developer(String name, String company, int age, String favProgrammingLanguage){
		super(name, company, age);
		this.FavProgrammingLanguage = favProgrammingLanguage;
	}

	public void fixBug(){
		System.out.println(Name + " fixed bug using " + FavProgrammingLanguage);
	}
}

class Inheritence{
	public static void main(String[] args){
		Developer d1 = new Developer("Vineel", "Google", 23, "C++");
		Developer d2 = new Developer("Suresh", "Tinder", 23, "Java");

		d1.fixBug();
		d2.fixBug();

	}
}