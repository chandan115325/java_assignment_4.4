
public class Employee {
	double basic_salary, travel_allowance,gross_income;
	
	public void salary(double basic_salary,double travel_allowance)
	{
		gross_income = basic_salary + (basic_salary*travel_allowance)/100;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager m = new Manager();
		m.Calculate();
		/*
		e.salary(100.00,15.00);
		System.out.println("Gross income of Manager is "+ e.gross_income);
		*/
		Trainee train = new Trainee();
		train.Calculate();
		/*
		e.salary(100.00,10.00);
		System.out.println("Gross income of Trainee is "+ e.gross_income);
		*/
	}

}

class Manager extends Employee
{
	/*public void salary(double basic_salary,double travel_allowance)
	{
		gross_income = basic_salary + (basic_salary*travel_allowance)/100;
	}*/
	public void Calculate(){
	Employee e = new Manager();
	
	e.salary(100.00,15.00);
	System.out.println("Gross income of Manager is "+ e.gross_income);
	}
	
}

class Trainee extends Employee
{
	/*public void salary(double basic_salary,double travel_allowance)
	{
		gross_income = basic_salary + (basic_salary*travel_allowance)/100;
	}*/
	public void Calculate()
	{
	Employee t = new Trainee();
	
	t.salary(100.00,10.00);
	System.out.println("Gross income of Trainee is "+ t.gross_income);

	}
}