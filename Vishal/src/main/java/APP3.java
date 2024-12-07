import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class APP3 {
    @Test
    public void addTest() {
    	Application2 app=new Application2();
    	assertEquals(app.add(2,3),5.0);
    }
    
}
