package book;

import author.Author;
import book.value_object.*;
import category.Category;
import common.Entity;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

public class Book  extends Entity {
    private UUID id;
    private Name name;
    private Din price;
    private Pages numberOfPages;
    private Rating rating;
    private Stock stock;
    private Description description;
    private ReleaseDate releaseDate;

    //reference to authors
    private Set<Author> authors;

    //reference to categories
    private  Set<Category> categories;



    public Book(Name name, Din price, Pages numberOfPages, Rating rating, Stock stock, Description description, ReleaseDate releaseDate) {
        this.name = name;
        this.price = price;
        this.numberOfPages = numberOfPages;
        this.rating = rating;
        this.stock = stock;
        this.description = description;
        this.releaseDate = releaseDate;
        authors=new HashSet<>();
        categories=new HashSet<>();
    }



}
