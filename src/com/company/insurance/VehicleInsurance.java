package com.company.insurance;

public class VehicleInsurance implements Insurance {
	String holderName;
	int vehicleType;
	double value;
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public int getVehicleType() {
		return vehicleType;
	}
	public void setVehicleType(int vehicleType1) {
	    if (vehicleType1!=2
	            && vehicleType1!=4) {
	        System.err.println("Enter valid vehicle Type");
	        return;
	    }
	    this.vehicleType = vehicleType1;
	}

	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		if(value<=0)
		{
			System.err.println("Enter valid amount");
			return;
		}
		this.value = value;
	}
	@Override
	public void calculationRule(double amount) {
		 if (vehicleType == 0) {
		        System.err.println("Vehicle type not set. Cannot calculate insurance.");
		        return;
		    }
		if(vehicleType==2)
		{
			amount=((amount*2)/100);
		}
		else if(vehicleType==4)
		{
			amount=((amount*4)/100);
		}
		System.out.println("Final Amount:"+amount);
		
	}
	

}
