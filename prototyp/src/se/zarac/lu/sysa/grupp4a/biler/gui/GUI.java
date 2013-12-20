package se.zarac.lu.sysa.grupp4a.biler.gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
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
        Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println("screenSize" + screenSize);
        //setSize(800, 600);
        setBounds(0, 0, screenSize.width, screenSize.height);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        personFinder = new PersonFinder(this);
        add(personFinder, BorderLayout.CENTER);
        // TODO bug-1 : needs to be set here AND after JFrame is instantiated
        setVisible(true); }

    public Biler getBiler() {
        return biler; }

    public void view(Person person) {
        removeAll();
        System.out.println("!NI!" + person); }
    
    public void view(Booking booking) {
        removeAll();
        System.out.println("!NI!" + booking); } }