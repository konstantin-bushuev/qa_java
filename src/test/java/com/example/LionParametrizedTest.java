package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;

@RunWith(Parameterized.class)
public class LionParametrizedTest {
    private final String sex;
    private final boolean hasMane;

    public LionParametrizedTest(String sex, boolean hasMane) {
        this.sex = sex;
        this.hasMane = hasMane;
    }

    Feline felineMock = Mockito.mock(Feline.class);

    @Parameterized.Parameters(name = "Тестовые данные: пол {0}, есть грива {1}")
    public static Object[][] getParameters() {
        return new Object[][] {
                {"Самец", true},
                {"Самка", false}
        };
    }

    @Test
    public void testConstructorSetsHasMane() throws Exception {
        Lion lion = new Lion(sex, felineMock);
        Assert.assertEquals(hasMane, lion.doesHaveMane());
    }

    @Test
    public void testDoesHaveMane() throws Exception {
        Lion lion = new Lion(sex, felineMock);
        Assert.assertEquals(hasMane, lion.doesHaveMane());
    }
}