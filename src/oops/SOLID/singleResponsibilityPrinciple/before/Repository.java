package oops.SOLID.singleResponsibilityPrinciple.before;

import java.util.List;

public interface Repository<T> {

	  public List<T> findAll();
	  
	  public  void save(T... record);
}
