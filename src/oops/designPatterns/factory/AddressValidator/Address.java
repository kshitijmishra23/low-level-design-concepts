package oops.designPatterns.factory.AddressValidator;
import lombok.Getter;

//Implemented Builder Pattern so that user can give address in any format. It can also be done by simple getter and setters
// Just tried this example. Builder are only implemented when we need immutable objects and parameters can be of any order.

@Getter
public class Address {
    private String cc;
    private String country;
    private String state;
    private String district;
    private String zipcode;
    private String landmark;
    private String street;
    private String houseNo;

    public Address(Builder b){
        this.cc=b.cc;
        this.country=b.country;
        this.state=b.state;
        this.district=b.district;
        this.zipcode=b.zipcode;
        this.landmark=b.landmark;
        this.street=b.street;
        this.houseNo=b.houseNo;
    }

    static class Builder{
        private String cc;
        private String country;
        private String state;
        private String district;
        private String zipcode;
        private String landmark;
        private String street;
        private String houseNo;
        public Builder(){}

        public Builder setCc(String cc){
            this.cc=cc;
            return this;
        }
        public Builder setCountry(String country){
            this.country=country;
            return this;
        }
        public Builder setState(String state){
            this.state=state;
            return this;
        }
        public Builder setDistrict(String district){
            this.district=district;
            return this;
        }
        public Builder setZipcode(String zipcode){
            this.zipcode=zipcode;
            return this;
        }
        public Builder setLandmark(String landmark){
            this.landmark=landmark;
            return this;
        }
        public Builder setStreet(String street){
            this.street=street;
            return this;
        }
        public Builder setHouseNo(String houseNo){
            this.houseNo=houseNo;
            return this;
        }
        public Address build(){
            return new Address(this);
        }
    }

}
