package overriding;

class employee{
	void displaySal(int salary,int bonus) {
		System.out.println(salary + bonus);
	}
}

class salary extends employee {
	@Override
	void displaySal(int salary, int bonus) {
		// TODO Auto-generated method stub
		System.out.println(salary-bonus);
	}
	
}


public class Overridee {
	public static void main(String[] args) {
		salary salary = new salary();
		salary.displaySal(10000, 122);
	}

}
