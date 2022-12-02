/*
This class stores the filing status and annual income for filing taxes.
Meant to be used with ComputeTaxes
*/

public class FilingInfo{
	private int status;
	private double income;

	public FilingInfo(){
		status = 1;
		income = 75000;
	}

	public FilingInfo(int status, double income){
		this.status = status;
		this.income = income;
	}

	public int getStatus(){
		return status;
	}

	public double getIncome(){
		return income;
	}

	public void setStatus(int status){
		this.status = status;
	}

	public void setIncome(double income){
		this.income = income;
	}
}