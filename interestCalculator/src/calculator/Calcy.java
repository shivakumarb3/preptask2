package calculator;

public class Calcy {

	public double simpleIntrest(double principal,int time,double rate)
	{
		double interest=(principal * time * rate)/100+principal;
		return interest;
	}
	public double compoundInterest(double principal,int time,double rate)
	{
		rate=rate/100;
		return Math.pow((1+rate), time)*principal;
	}
}
