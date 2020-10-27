package oops.designPatterns.prototype.books;

import java.time.LocalDate;
import java.util.Date;

public class TextBook extends Book{
    private LocalDate dateOfPrint;
    private int numberOfPage;

    public void setDateOfPrint(LocalDate dateOfPrint) {
        this.dateOfPrint = dateOfPrint;
    }

    public LocalDate getDateOfPrint() {
        return dateOfPrint;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }
}
