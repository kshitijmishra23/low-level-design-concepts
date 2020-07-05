package oops.SOLID.DependencyInversionPrinciple.before.repositories;

import java.util.List;

public interface Repository<T> {
	
	void save(T e) throws Exception;
	
	List<T> findAll();

}
