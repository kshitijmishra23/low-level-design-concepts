package oops.designPatterns.factory.AddressValidator.Validator;

import oops.designPatterns.factory.AddressValidator.Address;

public class UsaValidator implements Validator{
    @Override
    public boolean validate(Address add) {
        System.out.println("US Validator:  "+ add.getStreet());
        return true;
    }
}
