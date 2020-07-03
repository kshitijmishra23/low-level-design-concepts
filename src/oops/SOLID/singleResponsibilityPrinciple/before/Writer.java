package oops.SOLID.singleResponsibilityPrinciple.before;

import java.io.IOException;

public interface Writer<T> {
    void write(final T object) throws IOException;
}
