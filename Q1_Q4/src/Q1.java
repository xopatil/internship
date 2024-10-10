class emp{
	String name= "soham";
	@Override
	public String toString() {
		return "emp [name=" + name + ", id=" + id + ", salary=" + salary + ", address=" + address + "]";
	}
	int id = 15;
	int salary =15000;
	String address= "borivli west";
	
}

public class Q1 {
	public static void main(String[] args) {
		emp emp = new emp();
		System.out.println(emp.toString());
		
	}

}
