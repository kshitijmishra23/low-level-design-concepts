package oops.SOLID.singleResponsibilityPrinciple.before;

public interface Save<T> {

	void saveRecord(T... record);
}
