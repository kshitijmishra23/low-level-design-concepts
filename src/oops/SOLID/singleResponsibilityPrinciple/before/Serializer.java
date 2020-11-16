package oops.SOLID.singleResponsibilityPrinciple.before;

public interface Serializer<S, T> {
    T serialize(final S object);
}
