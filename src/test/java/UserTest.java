import org.junit.Test;

        import java.io.ByteArrayOutputStream;
        import java.io.PrintStream;
        import java.util.ArrayList;

        import static junit.framework.TestCase.assertEquals;


public class UserTest {
    private User user = new User("Spike");
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Test
    public void printPeeps() throws Exception {
        System.setOut(new PrintStream(outContent));
        user.post("First message");
        user.printPeeps();
        assertEquals("These are the messages created so far:\nFirst message\n", outContent.toString());
    }

    @Test
    public void getName() throws Exception {
        assertEquals("Returns username", "Spike", user.getName());
    }

    @Test
    public void post() throws Exception {
        user.post("First message");
        ArrayList<String> peeps = new ArrayList<>();
        peeps.add("First message");
        assertEquals(1, user.peeps.size());
        assertEquals(peeps, user.peeps);
    }

    @Test
    public void follow() throws Exception {
        user.follow("Spike");
        ArrayList<String> following = new ArrayList<>();
        following.add("Spike");
        assertEquals(1, user.following.size());
        assertEquals(following, user.following);
    }
}