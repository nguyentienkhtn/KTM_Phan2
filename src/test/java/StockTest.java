import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StockTest {

    @Test
    void testToString() {
        Stock stock = new Stock("acb", "Ngan hang A Chau", 15, 20, 100);
        String expected = "Stock{id='acb', name='Ngan hang A Chau', initPrice=15.0, lastPrice=20.0, holdings=100}";
        assertEquals(expected, stock.toString());
    }
}