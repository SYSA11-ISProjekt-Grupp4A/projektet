package se.zarac.lu.sysa.grupp4a.biler;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import se.zarac.lu.sysa.grupp4a.biler.models.Person;
import se.zarac.lu.sysa.grupp4a.biler.models.Product;
import se.zarac.lu.sysa.grupp4a.biler.models.Vehicle;
import se.zarac.lu.sysa.grupp4a.biler.models.Booking;

public class Biler {
    protected List<Person> customers;
    protected List<Product> products;
    protected List<Booking> bookings;
    
    public Biler() {
        this.customers = new LinkedList<Person>();
        this.products = new LinkedList<Product>();
        this.bookings = new LinkedList<Booking>(); }
        
    public void testish() {
        // some customers
        Person kalle = new Person("Kalle", "4803051932");
        Person lisa = new Person("Lisa", "4402025155");

        customers.add(kalle);
        customers.add(lisa);

        System.out.println(customers);
        
        // some vehicles
        Vehicle volvon = new Vehicle("vulvan", 5);

        Vehicle saaben = new Vehicle("saaben", 4);
        
        products.add(volvon);
        products.add(saaben);

        System.out.println(products);
        
        // and a booking bookings
        Booking kalleTarVolvon = new Booking(kalle, volvon, new Date(2013, 12, 19), new Date(2013, 12, 19));
        
        bookings.add(kalleTarVolvon);
        
        System.out.println(bookings);
        
        // what's available?
        //System.out.println(getEverythingAvailable());
        } }