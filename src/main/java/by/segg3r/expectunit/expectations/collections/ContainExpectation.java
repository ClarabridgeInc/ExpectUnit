package by.segg3r.expectunit.expectations.collections;

import java.util.Collection;

import by.segg3r.expectunit.Expectation;

public class ContainExpectation<O> extends Expectation<Collection<O>> {

	private Collection<O> entities;
	
	public ContainExpectation(Collection<O> entities) {
		this.entities = entities;
	}
	
	@Override
	public boolean match(Collection<O> object) {
		return object.containsAll(entities);
	}
	
	protected Collection<O> getEntities() {
		return this.entities;
	}

}
