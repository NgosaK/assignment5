import junit.framework.TestCase;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by User on 2015/03/08.
 */
public class TestAbstaractFactory extends TestCase {


    AbstractFactory absFac= null;
    VehicleFactory vehicle1=null;
    VehicleFactory vehicle2=null;
    Car mclaren=null;
    Car bmw=null;
    @Before
    public void setUp() throws  Exception
    {
         absFac= new AbstractFactory();
    }

    @After
    public void tearDown() throws Exception
    {
        vehicle1=null;
        absFac=null;
        bmw=null;
        mclaren=null;
        vehicle2=null;
    }

    @Test
    public void TestAbstraction()
    {
         vehicle1= absFac.getVehicleType("Hybrid");
         mclaren= vehicle1.getCarName("P1");

         vehicle2= absFac.getVehicleType("Hybrid");
        Car bmw= vehicle2.getCarName("M3");

        assertEquals("43",mclaren.getTopSpeed());
    }

}
