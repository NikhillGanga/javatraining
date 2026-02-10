package com.policy.insurance;

import com.policy.insurance.HealthInsurance.PolicyStatus;

interface Policy {

	abstract public double calculationRule();

	public abstract PolicyStatus getPolicyStatus();
	
}
