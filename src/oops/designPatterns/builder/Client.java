package oops.designPatterns.builder;

import oops.designPatterns.builder.stringBuilder.StringBuilder;

public class Client {

    public static void main(String[] args) {

        SubWaySandwichOrderV1 sub1 = new SubWaySandwichOrderV1();
        sub1.setBread("Wheat bread");
        sub1.setCondiments("Chilly");
        sub1.setFillings("Chana chatpata");
        sub1.setVeggies("Lettuce");


        System.out.println(sub1.getBread());
        System.out.println(sub1.getCondiments());
        System.out.println(sub1.getFillings());
        System.out.println(sub1.getVeggies());

        SubWaySandwichOrderV3 sub3
                = new SubWaySandwichOrderV3.Builder()
                .setBread("Multigrain bread")
                .setCondiments("Olives")
                .build();

        System.out.println(sub3.getBread());
        System.out.println(sub3.getCondiments());

        StringBuilder sb = new StringBuilder.Builder().append("String 1").build();
        System.out.println(String.format("Data: %1$s, Reference: %2$s", sb.getString(), sb.toString()));
    }

}
