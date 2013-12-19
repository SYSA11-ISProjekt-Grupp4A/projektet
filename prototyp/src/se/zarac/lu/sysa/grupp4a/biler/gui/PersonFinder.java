package se.zarac.lu.sysa.grupp4a.biler.gui;

import se.zarac.lu.sysa.grupp4a.biler.Biler;
import se.zarac.lu.sysa.grupp4a.biler.models.Person;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Iterator;
import java.util.List;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

@SuppressWarnings("serial")
public class PersonFinder extends JPanel implements KeyListener, DocumentListener {
    protected JTextField find;
    protected JPanel found;
    protected GUI gui;
    protected Biler biler;
    
    public PersonFinder(GUI gui) {
        this.gui = gui;
        this.biler = gui.getBiler();
        setLayout(new BorderLayout());
        find = new JTextField();
//        find.addKeyListener(this);
        find.getDocument().addDocumentListener(this);
        found = new JPanel();
        found.setLayout(new FlowLayout());
        found.add(new JLabel("Haven't found anything yet."));
        add(find, BorderLayout.NORTH);
        add(found, BorderLayout.CENTER); }
    
    public void findPerson() {
        String key = find.getText();
        List<Person> matches = biler.findPerson(key);
        found.removeAll();
        Iterator<Person> p = matches.iterator();
        System.out.println("matches for " + key);
        System.out.println(matches);
        while (p.hasNext()) {
            Person person = p.next();
            System.out.println("found person");
            System.out.println(person);
            PersonView view = new PersonView(person);
            found.add(view); }

        found.revalidate();
        found.repaint(); }
    
    @Override
    public void keyPressed(KeyEvent e) {
        findPerson(); }

    @Override
    public void keyReleased(KeyEvent arg0) { }

    @Override
    public void keyTyped(KeyEvent arg0) { }

    @Override
    public void changedUpdate(DocumentEvent arg0) {
        System.out.println("changed update"); }

    @Override
    public void insertUpdate(DocumentEvent arg0) {
        // TODO Auto-generated method stub
        System.out.println("insert update");
        findPerson(); }

    @Override
    public void removeUpdate(DocumentEvent arg0) {
        System.out.println("remove update");
        findPerson(); }    
    
    protected class PersonView extends JLabel implements MouseListener {
        protected Person person;
        
        public PersonView(Person person) {
            this.person = person;
            setText(person.getName());
            addMouseListener(this); }
        
        @Override
        public void mouseClicked(MouseEvent arg0) {
            // TODO Auto-generated method stub
            System.out.println("view person aiiit");
            System.out.println(person);
            gui.view(person); }
        
        @Override
        public void mouseEntered(MouseEvent arg0) { }
        
        @Override
        public void mouseExited(MouseEvent arg0) { }
        
        @Override
        public void mousePressed(MouseEvent arg0) { }
        
        @Override
        public void mouseReleased(MouseEvent arg0) { } } }