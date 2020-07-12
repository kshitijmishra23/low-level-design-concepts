package oops.designPatterns.singleton;

/**
 * Easiest and widely used implementation of SQL Connection class
 *
 * @author rajatgoyal715
 */
public class SQLConnectionSingletonInnerClass {

    private SQLConnectionSingletonInnerClass() {}

    private static class BillPughSingleton {
        private static final SQLConnectionSingletonInnerClass INSTANCE = new SQLConnectionSingletonInnerClass();
    }

    /**
     * This way there is lazy initialization of the object overall but eager initialization in the inner static class.
     * Very easy to implement. Widely used.
     * @return
     */
    public static SQLConnectionSingletonInnerClass getInstance() {
        return BillPughSingleton.INSTANCE;
    }
}
