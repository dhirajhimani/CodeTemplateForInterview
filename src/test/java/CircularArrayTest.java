import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CircularArrayTest {

    CircularArray<String> array;
    int size = 5;
    String[] arr = {"3", "4", "0", "1", "2", };

    @Before
    public void setup() throws Exception {

        array = new CircularArray<String>(size);
        for (int i = 0; i < size; i++) {
            array.set(i, String.valueOf(i));
        }
    }

    @Test
    public void sampleTest() {
        assertEquals(4, 2 * 2);
    }

    @Test
    public void MyTestWorks() throws Exception {

        array.rotate(3);
        for (int i = 0; i < size; i++) {
            assertEquals(arr[i], array.get(i));
        }
    }

}