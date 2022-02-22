package oops.designPatterns.factory.AddressValidator;

public class FactoryDemoClient {

    public static void main(String[] args) {
        Address addUsa=new Address.Builder().setCc("US").setCountry("USA").setZipcode("74738").setStreet("Baker's Lane").setHouseNo("114").build();
        Address addIndia=new Address.Builder().setCc("IN").setCountry("India").setZipcode("841227").setState("Bihar").setDistrict("Siwan").setLandmark("Near Tarwara More").setStreet("Atarsua Tola").build();
//        Address add=new Address("India","Bihar","Siwan","841226","IN");
//        Address add1=new Address("USA","Bihar","Siwan","841226","US");
        System.out.println(AddressValidatorFactory.getInstance().getValidator(addUsa.getCc()).validate(addUsa));
        System.out.println(AddressValidatorFactory.getInstance().getValidator(addIndia.getCc()).validate(addIndia));
    }
}
