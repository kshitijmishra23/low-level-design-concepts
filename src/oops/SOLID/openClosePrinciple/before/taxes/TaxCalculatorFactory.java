package oops.SOLID.openClosePrinciple.before.taxes;

import java.util.HashMap;
import java.util.Map;

public class TaxCalculatorFactory {

    private final Map<String, TaxCalculator> provider = new HashMap<>();

    public void register(final String typeOfEmployee, final TaxCalculator calculator){
        provider.put(typeOfEmployee, calculator);
    }

    public TaxCalculator getTaxCalculator(final String typeOfEmployee){
        return provider.get(typeOfEmployee);
    }
}
