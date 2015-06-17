# ExpectUnit
behaviour-driven assertions for Java, inspired by Jasmine

###Expectations

```java
expect(2).to(equal(2));
expect(true).to(beTruthy());
expect(Arrays.asList(new Integer[] {1, 5, 25})).toContain(5);
```

###More complicated conditions

```java
expect(2).to(beGreaterThan(1).and(beLessThan(5));
```

###Verify exception throwing

```java
expect(someObject).not().toThrow().when().doingSomeWork();
expect(someObject).toThrow(RuntimeException.class).when().methodShouldThrowException();
```
