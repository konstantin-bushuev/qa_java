package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline felineMock;

    @Test
    public void testConstructorThrowException() {
        try {
            Lion lion = new Lion("Лев", felineMock);
        } catch (Exception e) {
            Assert.assertEquals("Используйте допустимые значения пола животного - Самец или Самка", e.getMessage());
        }
    }

    @Test
    public void testGetKittens() throws Exception {
        Lion lion = new Lion("Самец", felineMock);
        Mockito.when(felineMock.getKittens()).thenReturn(1);
        int result = lion.getKittens();
        Mockito.verify(felineMock, Mockito.times(1)).getKittens();
        Assert.assertEquals(1, result);
    }

    @Test
    public void testGetFood() throws Exception {
        Lion lion = new Lion("Самец", felineMock);
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(felineMock.getFood("Хищник")).thenReturn(expected);
        List<String> result = lion.getFood();
        Mockito.verify(felineMock, Mockito.times(1)).getFood("Хищник");
        Assert.assertEquals(expected, result);
    }
}
