package pl.futurity.java;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AppTest
{
    @BeforeClass
    public void init() {
        System.out.println("Initialization");
    }

    @Test
    public void stepOne() {
        System.out.println("Step 1");
        Assert.assertEquals(4, 2+2);
    }
}
