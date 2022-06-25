package org.emp;

public class IcIcIBank extends GreensBank {

	@Override
	public void savings() {
		System.out.println("6%");		
	}

	@Override
	public void fixed() {
		System.out.println("7%");
		
	}

	@Override
	public void deposite() {
	System.out.println("8%");
		
	}
public static void main(String[] args) {
	IcIcIBank i = new IcIcIBank();
	i.savings();
	i.fixed();
	i.deposite();
}

}
