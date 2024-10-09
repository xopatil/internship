package manager;
import account.account;
public class manager extends account {
	
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
