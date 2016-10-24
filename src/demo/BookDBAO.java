package demo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chitboon on 10/23/15.
 */
public class BookDBAO {
    // get book details given the bookId
    // this method is dummy for now
    public BookDetails getBookDetails(String bookId) {
        // return dummy book for testing now
        return createDummyBook(bookId);
    }

    public List<BookDetails> getAllList() {

        ArrayList<BookDetails> ba = new ArrayList<BookDetails>();


        BookDetails b1 = new BookDetails();
        b1.setBookId("1");
        b1.setDescription("hhherrw");
        b1.setFirstName("Jeeava");
        b1.setSurname("Exeqwpert");
        b1.setInventory(5);
        b1.setOnSale(false);
        b1.setPrice(5.9f);
        b1.setTitle("Web components for developers");
        b1.setYear(2015);


        BookDetails b2 = new BookDetails();
        b2.setBookId("2");
        b2.setDescription("hrrrrrrhherrw");
        b2.setFirstName("Jeerwwava");
        b2.setSurname("Exeqwpert");
        b2.setInventory(5);
        b2.setOnSale(false);
        b2.setPrice(5.9f);
        b2.setTitle("Web components for developers");
        b2.setYear(2015);


        BookDetails b3 = new BookDetails();
        b3.setBookId("3");
        b3.setDescription("hhrwerweherrw");
        b3.setFirstName("Jrrrreeava");
        b3.setSurname("Exeqwpert");
        b3.setInventory(5);
        b3.setOnSale(false);
        b3.setPrice(4.9f);
        b3.setTitle("Web components for developers");
        b3.setYear(2015);


        ba.add(b1);
        ba.add(b2);
        ba.add(b3);

        return ba;


    }

    // convenient method to create a dummy book detail
    // this method is meant for testing
    private BookDetails createDummyBook(String bookId) {
        BookDetails details = new BookDetails();
        details.setBookId(bookId);
        details.setDescription("Web components for developers talks about how web components can transfor the way you develop application for the web");
        details.setFirstName("Java");
        details.setSurname("Expert");
        details.setInventory(5);
        details.setOnSale(false);
        details.setPrice(5.9f);
        details.setTitle("Web components for developers");
        details.setYear(2015);
        return details;
    }
}