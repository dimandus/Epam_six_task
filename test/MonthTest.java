import org.junit.Test;

import static org.junit.Assert.*;

public class MonthTest {

    @Test
    public void testNextMonth() throws Exception {
        assertTrue(Month.JANUARY.nextMonth()== Month.FEBRUARY);
        assertTrue(Month.DECEMBER.nextMonth()== Month.JANUARY);
    }

    @Test
    public void testGetDayCount() throws Exception {
        assertEquals(Month.FEBRUARY.getDayCount(),28);
    }
}