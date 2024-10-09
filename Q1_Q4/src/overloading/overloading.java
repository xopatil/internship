package overloading;
class emp{
	int calsal(int sal,int bonus,int tax) {
		return sal+bonus-tax;
	}
	int calsal(int sal,int bonus) {
		return sal+bonus;	
	}
	
}

public class overloading {
	public static void main(String[] args) {
		emp emp = new emp();
		System.out.println(emp.calsal(15000, 1110));
		System.out.println(emp.calsal(150000, 2220, 220));
	}
	

}
