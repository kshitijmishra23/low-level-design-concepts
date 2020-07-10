package oops.designPatterns.adapter.factory;

import oops.designPatterns.adapter.employees.Employee;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

public class EmployeeAdapterFactory {

    private Map<String, Function<Object, Employee>> adapterInitializers = new HashMap<>();

    public void registerAdapterInitializer(final String clazz, final Function<Object, Employee> adapterInitializer){
        adapterInitializers.putIfAbsent(clazz, adapterInitializer);
    }

    public Employee getAdapter(final Object object){
        return adapterInitializers.get(object.getClass().getTypeName()).apply(object);
    }
}
