
package com.unique.app;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.unique.app.Module.SimpleIntrestModule;
import com.unique.app.Service.SimpleInterest;

public class MainClient{
	public static void main(String[] args) {
		Injector ij = Guice.createInjector(new SimpleIntrestModule());
		SimpleInterest si = ij.getInstance(SimpleInterest.class);
	int s = si.simpleInterest(10000, 3, 2);
		System.out.println("SImple Interest is : " + s);
	}
}