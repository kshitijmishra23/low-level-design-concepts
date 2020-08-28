package assignment2.model;

public class PriceRange {

    private Integer begin;
    private Integer end;

    public PriceRange(Integer begin, Integer end) {
        this.begin = begin;
        this.end = end;
    }

    public Integer getBegin() {
        return begin;
    }

    public void setBegin(Integer begin) {
        this.begin = begin;
    }

    public Integer getEnd() {
        return end;
    }

    public void setEnd(Integer end) {
        this.end = end;
    }
}
