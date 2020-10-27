package oops.designPatterns.prototypeV2.items;

public class Movie extends Item {
    private String runtime;

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public String getRuntime() {
        return runtime;
    }
}
