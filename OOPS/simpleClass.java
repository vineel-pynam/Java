class simpleClass{
	public static void main(String args[]){
		Employee emp1 = new Employee("Vineel", "Google", 23);
		Employee emp2 = new Employee("Suresh", "Facebook", 33);

		emp1.introduceYourSelf();
		emp2.introduceYourSelf();
	}
}

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