package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.List;

public class FelineTest {
    Feline feline;

    @Before
    public void init() {
        feline = new Feline();
    }

    @Test
    public void testEatMeat() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> result = feline.eatMeat();
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testGetFamily() {
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testGetKittensWithNoArgument() {
        int result = feline.getKittens();
        Assert.assertEquals(1, result);
    }

    @Test
    public void testGetKittensWithArgument3() {
        Assert.assertEquals(3, feline.getKittens(3));
    }
}