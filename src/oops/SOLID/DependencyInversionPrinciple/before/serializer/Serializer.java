/**
 * 
 */
package oops.SOLID.DependencyInversionPrinciple.before.serializer;

/**
 * Interface to serialize employee
 */
public interface Serializer<T> {

	String serialize(T e);
}
