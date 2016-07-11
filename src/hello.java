import org.testng.Assert;
import org.testng.annotations.Test;


public class hello {

    @Test()
    public void testEmailGenerator() {

        testJava obj = new testJava();
        String email = obj.generate();


        Assert.assertNotNull(email);
        Assert.assertEquals(email, "feedback@yoursite.com");

    }

}
