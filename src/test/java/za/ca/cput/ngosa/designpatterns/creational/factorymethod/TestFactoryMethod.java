import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by User on 2015/03/08.
 */
public class TestFactoryMethod extends TestCase {

    SpeciesFactory spFac= null;
    Species spec= null;


@Before
    public void setUp() throws Exception
{
    spFac= new SpeciesFactory();
    spec=  spFac.makeSpecie("S");
}

    @Test
    public void testFactoryMethod()
    {
        assertEquals("Boo",spec.getName());
    }

}
