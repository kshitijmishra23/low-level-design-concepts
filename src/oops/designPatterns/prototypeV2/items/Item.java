package oops.designPatterns.prototypeV2.items;

public abstract class Item implements Cloneable{
    private String title;
    private String url;
    private double price;

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public double getPrice() {
        return price;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }
}
