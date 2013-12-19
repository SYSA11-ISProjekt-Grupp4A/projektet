package se.zarac.lu.sysa.grupp4a.biler.models;

import java.util.Date;

public class Booking {
    protected Person by;
    protected Product item;
    protected Date start;
    protected Date end;

    public Booking (Person by, Product item, Date start, Date end) {
        this.by = by;
        this.item = item;
        this.start = start;
        this.end = end; } }
