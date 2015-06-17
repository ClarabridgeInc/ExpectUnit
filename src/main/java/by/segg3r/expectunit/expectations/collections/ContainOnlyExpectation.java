package by.segg3r.expectunit.expectations.collections;

import java.util.Collection;

public class ContainOnlyExpectation<O> extends ContainExpectation<O> {

	public ContainOnlyExpectation(Collection<O> entities) {
		super(entities);
	}
	
	@Override
	public boolean match(Collection<O> object) {
		return object.containsAll(this.getEntities()) && object.size() == this.getEntities().size();
	}

}
