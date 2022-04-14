package cupon;

import book.Book;
import common.Entity;
import cupon.value_object.EndDate;
import cupon.value_object.Percent;
import cupon.value_object.StartDate;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class Cupon extends Entity {

    private StartDate dateFrom;
    private EndDate dateTo;
    private Percent discount;

    //reference to books
    private Set<Book> books;

    public Cupon(StartDate dateFrom, EndDate dateTo, Percent discount) {
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.discount = discount;
        books=new HashSet<>();
    }
}
