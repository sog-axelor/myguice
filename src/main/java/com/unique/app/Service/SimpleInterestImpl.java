
package com.unique.app.Service;

public class SimpleInterestImpl implements SimpleInterest{
	
	@Override
	public int simpleInterest(int p,int r,int n) {
		return p*r*n/100;
	}
}