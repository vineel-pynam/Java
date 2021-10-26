abstract class AbstractEmployee{
	abstract void AskForPromotion();
}

interface EmployeeMethods{
	void disclaimer();
}

class Employee implements EmployeeMethods{
	
	private String Name;
	private String Company;
	private int Age;

	public void setName(String name){
		this.Name = name;
	}

	public String getName(){
		return this.Name;
	}

	public void setCompany(String company){
		this.Company = company;
	}

	public String getCompany(){
		return this.Company;
	}

	public void setAge(int age){
		this.Age = age;
	}

	public int getAge(){
		return this.Age;
	}




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


	public void AskForPromotion(){
		if( Age > 30 ){
			System.out.println("Promoted!");
		}else{
			System.out.println("Not Eligible For Promotion!");
		}
	}

	public void Work(){
		System.out.println("Employee is doing some work!");
	}

	@Override
	public void disclaimer(){
		System.out.println("All Employees Should Work!");
	}
}


class Developer extends Employee{
	String FavProgrammingLanguage;

	Developer(String name, String company, int age, String favProgrammingLanguage){
		super(name, company, age);
		this.FavProgrammingLanguage = favProgrammingLanguage;
	}

	public void fixBug(){
		System.out.println(getName() + " fixed bug using " + FavProgrammingLanguage);
	}

	@Override
	public void Work(){
		System.out.println(getName() + " is coding in " + FavProgrammingLanguage);
	}
}

class Interfaces{
	public static void main(String[] args){
		Developer d1 = new Developer("Vineel", "Google", 23, "C++");
		Developer d2 = new Developer("Suresh", "Tinder", 23, "Java");

		d1.Work();
		d2.Work();
	}
}