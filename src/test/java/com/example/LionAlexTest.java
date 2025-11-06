package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionAlexTest {

    @Mock
    Feline felineMock;

    @InjectMocks
    LionAlex lionAlex;

    @Test
    public void testGetKittens() {
        Assert.assertEquals(0, lionAlex.getKittens());
    }

    @Test
    public void testGetFriends() {
        Assert.assertEquals(List.of("Марти", "Глория", "Мелман"), lionAlex.getFriends());
    }

    @Test
    public void testGetPlaceOfLiving() {
        Assert.assertEquals("Нью-Йоркский зоопарк", lionAlex.getPlaceOfLiving());
    }
}
