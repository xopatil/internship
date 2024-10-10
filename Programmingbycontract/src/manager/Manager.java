package manager;
import account.Account;
public class Manager extends Account {
	
	@Override
	public double calsal(double sal) {
		// TODO Auto-generated method stub
		return sal;
	}
	@Override
	public double calsal(double sal, double bonus, double tax) {
		// TODO Auto-generated method stub
		return sal+bonus-tax;
	}
}
