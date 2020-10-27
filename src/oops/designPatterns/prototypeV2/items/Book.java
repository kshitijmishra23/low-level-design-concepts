package oops.designPatterns.prototypeV2.items;

public class Book extends Item{
    private int noOfPage;

    public void setNoOfPage(int noOfPage) {
        this.noOfPage = noOfPage;
    }

    public int getNoOfPage() {
        return noOfPage;
    }
}
