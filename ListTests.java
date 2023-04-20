import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class ListTests {
    @Test
    public void testFilter() {
        List<String> lst = new 
            ArrayList<>(Arrays.asList("hello", "apple", "pear"));
        StringChecker sc = new StringCheck("a");
        List<String> expected = new 
            ArrayList<>(Arrays.asList("apple", "pear"));

        assertEquals(expected, ListExamples.filter(lst, sc));
    }
}
