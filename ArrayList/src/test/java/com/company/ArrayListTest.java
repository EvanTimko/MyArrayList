package com.company;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ArrayListTest {
    ArrayList1 arr;

    @Before
    public void setUp() {
        arr = new ArrayList1();
    }

    @Test
    public void size() {
        int expected = 4;

        arr.add(10);
        arr.add(11);
        arr.add(12);
        arr.add(13);
        int actual = arr.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isEmpty() {
        boolean expected = true;

        boolean actual = arr.isEmpty();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void notEmpty() {
        boolean expected = false;
        arr.add(12);
        arr.add(13);
        boolean actual = arr.isEmpty();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void add() {
        int expected = 1;

        arr.add(10);
        int actual = arr.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addInsert() {
        int expected = 33;

        arr.add(22);
        arr.add(12);
        arr.add(18);
        arr.add(1, 33);
        int actual = (int) arr.get(1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void clear() {
        int expected = 0;

        arr.add(22);
        arr.add(12);
        arr.add(18);
        arr.clear();
        int actual = arr.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void remove() {
        int expected = 2;

        arr.add(22);
        arr.add(12);
        arr.add(18);
        arr.remove(1);
        int actual = arr.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void get() {
        int expected = 12;

        arr.add(22);
        arr.add(12);
        arr.add(18);
        int actual = (int) arr.get(1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void change() {
        int expected = 33;

        arr.add(22);
        arr.add(12);
        arr.add(18);
        arr.change(1, 33);
        int actual = (int) arr.get(1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void checkSize() {
        int expected = 0;

        int actual = arr.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void resize() {
        int expected = 12;

        arr.add(22);
        arr.add(12);
        arr.add(18);
        arr.add(23);
        arr.add(14);
        arr.add(19);
        arr.add(21);
        arr.add(15);
        arr.add(16);
        arr.add(66);
        arr.add(77);
        arr.add(2);

        int actual = arr.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void trim() {
        int expected = 7;

        arr.add(22);
        arr.add(12);
        arr.add(18);//starts here
        arr.add(23);
        arr.add(14);
        arr.add(19);
        arr.add(21);
        arr.add(15);
        arr.add(16);//ends here
        arr.add(66);
        arr.add(77);
        arr.add(2);
        arr.trim(2, 8);
        int actual = arr.size();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void toArray(){
        String expected = "22 12 18 ";

        arr.add(22);
        arr.add(12);
        arr.add(18);

        String actual = arr.toArray();

        Assert.assertEquals(expected, actual);
    }

}

