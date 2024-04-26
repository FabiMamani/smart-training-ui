import org.example.DemoCI;
import org.junit.Assert;
import org.junit.Test;

public class TestCI {
    public DemoCI demo =new  DemoCI();
    @Test
    public void test(){
        Assert.assertTrue(demo.buildCI());
    }
}