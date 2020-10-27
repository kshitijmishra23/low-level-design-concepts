package oops.designPatterns.prototype.books;

public class AudioBook extends Book{
    private String runtime;
    private String narrator;

    public void setRuntime(String runtime) {
        this.runtime = runtime;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }

    public String getNarrator() {
        return narrator;
    }

    public String getRuntime() {
        return runtime;
    }
}
