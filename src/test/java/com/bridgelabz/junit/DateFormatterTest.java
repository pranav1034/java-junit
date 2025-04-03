package com.bridgelabz.junit;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.text.ParseException;

public class DateFormatterTest {
    private final DateFormatter dateFormatter = new DateFormatter();

    @Test
    public void testValidDateFormat() throws ParseException {
        assertEquals("31-12-2023", dateFormatter.formatDate("2023-12-31"));
    }

    @Test
    public void testInvalidDateFormat() {
        assertThrows(ParseException.class, () -> dateFormatter.formatDate("31-12-2023"));
    }
}
