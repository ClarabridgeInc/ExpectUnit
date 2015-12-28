package by.segg3r.expectunit.expectors;

import java.util.Collection;

import by.segg3r.expectunit.Expectation;
import by.segg3r.expectunit.Expectations;
import by.segg3r.expectunit.Expector;

public class CollectionExpector<O> extends Expector<Collection<O>> {

	public CollectionExpector(Collection<O> collection) {
		super(collection);
	}

	public CollectionExpector(Collection<O> collection, boolean negative) {
		super(collection, negative);
	}
	
	@Override
	public CollectionExpector<O> not() {
		return new CollectionExpector<O>(getObject(), !isNegative());
	}
	
	public Expectation<Collection<O>> toContain(Collection<O> other) {
		return this.to(Expectations.<O>contain(other));
	}
	
	public Expectation<Collection<O>> toContain(O... other) {
		return this.to(Expectations.<O>contain(other));
	}
	
	public Expectation<Collection<O>> toContainOnly(Collection<O> other) {
		return this.to(Expectations.<O>containOnly(other));
	}
	
	public Expectation<Collection<O>> toContainOnly(O... other) {
		return this.to(Expectations.<O>containOnly(other));
	}
	
}
