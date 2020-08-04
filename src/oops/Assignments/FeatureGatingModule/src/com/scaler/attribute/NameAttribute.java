package com.scaler.attribute;

public class NameAttribute extends ObjectAttribute{

    private String firstName;
    private String lastName;

    public NameAttribute(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String getObjectAttributeValue() {
        return "\"" + firstName+lastName +"\"";
    }

    @Override
    public String getObjectAttributeSpecifier() {
        return "name";
    }

    @Override
    public AttributeType getObjectAttributeType() {
        return AttributeType.STRING;
    }
}
