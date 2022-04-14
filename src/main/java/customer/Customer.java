package customer;

import Order.Order;
import book.Book;
import book.value_object.Din;
import common.Entity;
import customer.value_object.Email;
import customer.value_object.Password;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class Customer  extends Entity {

    private Email email;
    private Password password;
    private Din totalMoneySpend;

    //reference to favorite books
    private Set<Book> favoriteBooks;


    //reference to orders
    private Set<Order> orders;

    public Customer(Email email, Password password, Din totalMoneySpend) {
        this.email = email;
        this.password = password;
        this.totalMoneySpend = totalMoneySpend;
        favoriteBooks=new HashSet<>();
        orders=new HashSet<Order>();
    }
}
