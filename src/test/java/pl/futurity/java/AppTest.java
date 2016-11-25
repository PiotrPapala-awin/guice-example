package pl.futurity.java;

import com.google.inject.Inject;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Guice;
import org.testng.annotations.Test;
import pl.futurity.java.utils.TestUtils;

@Guice(modules = TestUtils.class)
public class AppTest
{
    @Inject
    private Provider dataProvider;

    @BeforeClass
    public void init() {
        System.out.println("Initialization");
        System.out.println("Data = " + dataProvider.getData());
    }

    @Test
    public void stepOne() {
        System.out.println("Step 1");
        Assert.assertEquals(4, 2+2);
    }
}
