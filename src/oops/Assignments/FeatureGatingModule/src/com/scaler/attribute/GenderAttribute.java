package com.scaler.attribute;

public class GenderAttribute extends ObjectAttribute{

    private String gender;

    public GenderAttribute(String gender) {
        this.gender = gender;
    }

    @Override
    public String getObjectAttributeValue() {
        return "\"" + gender + "\"";
    }

    @Override
    public String getObjectAttributeSpecifier() {
        return "gender";
    }

    @Override
    public AttributeType getObjectAttributeType() {
        return AttributeType.STRING;
    }
}
