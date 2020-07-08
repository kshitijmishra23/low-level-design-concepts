package oops.designPatterns.builder.stringBuilder;

import java.util.ArrayList;
import java.util.List;

public class StringBuilder {

    List<Character> stringAsCharList;

    public StringBuilder(Builder b) {
        this.stringAsCharList = b.stringAsCharList;
    }

    public String getString() {
        return stringAsCharList.toString();
    }

    public static class Builder {

        ArrayList<Character> stringAsCharList = new ArrayList<>();

        public Builder append(String o) {
            List<Character> temp = new ArrayList<>();
            for (char c : o.toCharArray()) {
                temp.add(c);
            }
            this.stringAsCharList.addAll(temp);
            return this;
        }

        public StringBuilder build() {
            return new StringBuilder(this);
        }

    }
}
