package oops.designPatterns.factory.AddressValidator;

import oops.designPatterns.factory.AddressValidator.Validator.IndiaValidator;
import oops.designPatterns.factory.AddressValidator.Validator.UsaValidator;
import oops.designPatterns.factory.AddressValidator.Validator.Validator;

import java.util.HashMap;
import java.util.Map;

public class AddressValidatorFactory {
    private Map<String,Validator> validatorMap;
    private static AddressValidatorFactory instance=null;
    private AddressValidatorFactory(){
        this.loadMap();
    }
    public static AddressValidatorFactory getInstance(){
        if(instance==null){
            return new AddressValidatorFactory();
        }else{
            return instance;
        }
    }

    public Validator getValidator(String cc){
        return validatorMap.get(cc);
    }
    private void loadMap(){
        this.validatorMap=new HashMap<>();
        this.validatorMap.put("US",new UsaValidator());
        this.validatorMap.put("IN",new IndiaValidator());
    }
}
