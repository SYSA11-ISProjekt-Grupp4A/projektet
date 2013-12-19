package se.zarac.lu.sysa.grupp4a.biler;

import se.zarac.lu.sysa.grupp4a.biler.gui.GUI;

public class Main {
    public static void main(String[] argv) {
        Biler biler = new Biler();
        GUI gui = new GUI(biler);
        biler.testish(); } }