package se.zarac.lu.sysa.grupp4a.biler;

import java.util.LinkedList;
import java.util.List;

import  se.zarac.lu.sysa.grupp4a.biler.models.Booking;

public class Biler {
    public Booking b1;
    
    protected List<Booking> bookings;
    
    public Biler() {
        this.bookings = new LinkedList<Booking>();
        
        this.bookings.add(new Booking("kalle", "lisa", "asdf", "feg")); }
    
    @Override
    public String toString() {
        return "Biler har " + this.bookings.size() + " bokningar.";
    }
}