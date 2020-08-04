package com.scaler.attribute;

public class AgeAttribute extends ObjectAttribute{

    private int age;

    public AgeAttribute(int age) {
        this.age = age;
    }

    @Override
    public String getObjectAttributeValue() {
        return String.valueOf(age);
    }

    @Override
    public String getObjectAttributeSpecifier() {
        return "age";
    }

    @Override
    public AttributeType getObjectAttributeType() {
        return AttributeType.INTEGER;
    }

}
