package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Spy
    Feline feline = new Feline();

    @Test
    public void testEatMeat() throws Exception {
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        List<String> result = feline.eatMeat();
        Mockito.verify(feline, Mockito.times(1)).getFood("Хищник");
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testGetFamily() {
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void testGetKittensWithNoArgument() {
        int result = feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
        Assert.assertEquals(1, result);
    }

    @Test
    public void testGetKittensWithArgument3() {
        Assert.assertEquals(3, feline.getKittens(3));
    }
}