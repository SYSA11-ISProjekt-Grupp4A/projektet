package se.zarac.lu.sysa.grupp4a.biler;

import se.zarac.lu.sysa.grupp4a.biler.models.Item;

public class SizeFilter implements Filter {
    protected int size;

    public int getSize() {
        return size; }

    public void setSize(int size) {
        this.size = size; }

    @Override
    public boolean filter(Item item) {
        return true; } }
