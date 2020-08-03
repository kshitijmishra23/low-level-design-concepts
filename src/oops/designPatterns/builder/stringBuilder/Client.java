package oops.designPatterns.builder.stringBuilder;

public class Client {
    public static void main(String[] args) {

        StringBuilderImpl stringBuilderImpl = new StringBuilderImpl();

        stringBuilderImpl.append("This ").append("is my ").append("own StringBuilder ").append("implementation");

        String result = stringBuilderImpl.toString();

        System.out.println(result);

    }
}
