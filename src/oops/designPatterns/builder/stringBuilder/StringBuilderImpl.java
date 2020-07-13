package oops.designPatterns.builder.stringBuilder;

import java.util.Arrays;

public class StringBuilderImpl {

    char[] result;

    int count;

    int capacity;

    public StringBuilderImpl() {
        this.count = 0;
        this.capacity = 16;
        this.result = new char[this.capacity];
    }

    public StringBuilderImpl(String str) {
        this.count = str.length();
        this.capacity = this.count + 16;
        this.result = new char[this.capacity];
        append(str);
    }

    public StringBuilderImpl(Object object) {
        this(String.valueOf(object));
    }

    public StringBuilderImpl append(Object obj){
        return append(String.valueOf(obj));
    }

    public StringBuilderImpl append(String str){
        int len = str.length();
        enableStringAppend(len);
        str.getChars(0, len, result, count);
        count += len;
        return this;
    }

    private void enableStringAppend(int len){
        if(this.capacity-this.count < len){
            int newCapacity = this.count+len+16;
            this.result = Arrays.copyOf(this.result, newCapacity);
            this.capacity = newCapacity;
        }
    }

    // This can be considered to be the equivalent of build method
    public String toString() {
        return String.valueOf(result);
    }

}
