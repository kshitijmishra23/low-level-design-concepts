package oops.SOLID.openClosePrinciple.before.taxes;

import oops.SOLID.openClosePrinciple.before.employees.Employee;

class InternTaxCalculator implements TaxCalculator{

    private final static int INCOME_TAX_PERCENTAGE = 15;


    public double calculate(Employee employee) {
        if(employee.getMonthlyIncome()*12<300000){
            return 0;
        }else{
            return 
                (employee.getMonthlyIncome() * INCOME_TAX_PERCENTAGE) / 100;
        }
        

    }
}