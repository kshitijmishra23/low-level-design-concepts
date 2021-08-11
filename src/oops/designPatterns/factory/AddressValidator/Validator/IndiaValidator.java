package oops.designPatterns.factory.AddressValidator.Validator;

import oops.designPatterns.factory.AddressValidator.Address;

public class IndiaValidator implements Validator{
    @Override
    public boolean validate(Address add) {
        System.out.println("India Validator:  "+ add.getState());
        return true;
    }
}
