
package com.unique.app.Module;

import com.google.inject.AbstractModule;
import com.unique.app.Service.SimpleInterest;
import com.unique.app.Service.SimpleInterestImpl;

public class SimpleIntrestModule extends AbstractModule{
	@Override
	protected void configure() {
		bind(SimpleInterest.class).to(SimpleInterestImpl.class);
	}
	
}