import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by User on 2015/03/08.
 */
public class TestSingleton extends TestCase {

    Singleton single1=null;
    Singleton single2=null;
    @Before
    public void setUp() throws Exception
    {
                single1= Singleton.newInstance();
                single2= Singleton.newInstance();

    }

    @Test
    public void testSingleton()
    {
        assertEquals(single1,single2);
    }

}
