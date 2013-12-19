package se.zarac.lu.sysa.grupp4a.biler.gui;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import se.zarac.lu.sysa.grupp4a.biler.Biler;
import se.zarac.lu.sysa.grupp4a.biler.models.Booking;
import se.zarac.lu.sysa.grupp4a.biler.models.Person;


@SuppressWarnings("serial")
public class GUI extends JFrame {
    protected Biler biler;
    
    // ze aktivitiez
    protected JPanel personFinder;
    
    public GUI(Biler biler) {
        this.biler = biler;
        setSize(800, 600);
        setBounds(130, 30, 930, 630);
        setResizable(false);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        personFinder = new PersonFinder(this);
        
        add(personFinder, BorderLayout.CENTER); 
        repaint(); }

    public Biler getBiler() {
        return biler; }

    public void view(Person person) {
        removeAll();
        System.out.println("!NI!" + person); }
    
    public void view(Booking booking) {
        removeAll();
        System.out.println("!NI!" + booking); } }