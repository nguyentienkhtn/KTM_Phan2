import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class StockListTest {

    @Test
    void add() {
        StockList stockList = new StockList();
        for (int i = 0; i < 10; i++) {
            Stock temp = new Stock(""+i, "Stock " + i, 10, 10+i, 100);
            stockList.add(temp);
        }
        String expected = "[Stock{id='0', name='Stock 0', initPrice=10.0, lastPrice=10.0, holdings=100}, Stock{id='1', name='Stock 1', initPrice=10.0, lastPrice=11.0, holdings=100}, Stock{id='2', name='Stock 2', initPrice=10.0, lastPrice=12.0, holdings=100}, Stock{id='3', name='Stock 3', initPrice=10.0, lastPrice=13.0, holdings=100}, Stock{id='4', name='Stock 4', initPrice=10.0, lastPrice=14.0, holdings=100}, Stock{id='5', name='Stock 5', initPrice=10.0, lastPrice=15.0, holdings=100}, Stock{id='6', name='Stock 6', initPrice=10.0, lastPrice=16.0, holdings=100}, Stock{id='7', name='Stock 7', initPrice=10.0, lastPrice=17.0, holdings=100}, Stock{id='8', name='Stock 8', initPrice=10.0, lastPrice=18.0, holdings=100}, Stock{id='9', name='Stock 9', initPrice=10.0, lastPrice=19.0, holdings=100}]";
        assertEquals(expected, stockList.getStocks().toString());
    }

    @Test
    void summary() {
        StockList stockList = new StockList();
        for (int i = 0; i < 10; i++) {
            Stock temp = new Stock(""+i, "Stock " + i, 10, 10+i, 100);
            stockList.add(temp);
        }

        String expected = "9, 8, 7, 6, 5, 4, 3, 2, 1, 0";
        assertTrue(stockList.summary().contains(expected));

    }

    @Test
    void getStocks() {
        StockList stockList = new StockList();
        for (int i = 0; i < 10; i++) {
            Stock temp = new Stock(""+i, "Stock " + i, 10, 10+i, 100);
            stockList.add(temp);
        }
        String expected = "[Stock{id='0', name='Stock 0', initPrice=10.0, lastPrice=10.0, holdings=100}, Stock{id='1', name='Stock 1', initPrice=10.0, lastPrice=11.0, holdings=100}, Stock{id='2', name='Stock 2', initPrice=10.0, lastPrice=12.0, holdings=100}, Stock{id='3', name='Stock 3', initPrice=10.0, lastPrice=13.0, holdings=100}, Stock{id='4', name='Stock 4', initPrice=10.0, lastPrice=14.0, holdings=100}, Stock{id='5', name='Stock 5', initPrice=10.0, lastPrice=15.0, holdings=100}, Stock{id='6', name='Stock 6', initPrice=10.0, lastPrice=16.0, holdings=100}, Stock{id='7', name='Stock 7', initPrice=10.0, lastPrice=17.0, holdings=100}, Stock{id='8', name='Stock 8', initPrice=10.0, lastPrice=18.0, holdings=100}, Stock{id='9', name='Stock 9', initPrice=10.0, lastPrice=19.0, holdings=100}]";
        assertEquals(expected, stockList.getStocks().toString());
    }

    @Test
    void testAdd() {
        File input = new File("data/stocks.txt");
        StockList stockList = new StockList();
        stockList.add(input);

        String expected = "Stock{id='mbs', name='Chung khoan Saigon', initPrice=15.0, lastPrice=20.0, holdings=100}, Stock{id='vci', name='Chung khoan Ban Viet', initPrice=16.0, lastPrice=36.0, holdings=100}, Stock{id='tcb', name='Ngan hang Ky Thuong', initPrice=55.0, lastPrice=15.0, holdings=100}, Stock{id='abc', name='Ngan hang A Chau', initPrice=200.0, lastPrice=10.0, holdings=100}, Stock{id='tdc', name='Phat trien Binh Duong', initPrice=20.0, lastPrice=45.0, holdings=100}, Stock{id='bts', name='Xi mang But Son', initPrice=10.0, lastPrice=130.0, holdings=100}";
        assertTrue(stockList.getStocks().toString().contains(expected));
    }

    @Test
    void maxChange() {
        StockList stockList = new StockList();
        for (int i = 0; i < 10; i++) {
            Stock temp = new Stock(""+i, "Stock " + i, 10, 10+i, 100);
            stockList.add(temp);
        }
        String temp = stockList.maxChange();
        String expected = "9";
        assertEquals(expected, temp);
    }

    @Test
    void maxProfitable() {
        StockList stockList = new StockList();
        for (int i = 0; i < 10; i++) {
            Stock temp = new Stock(""+i, "Stock " + i, 10, 10+i, 100);
            stockList.add(temp);
        }
        String temp = stockList.maxProfitable();
        String expected = "9";
        assertEquals(expected, temp);
    }

    @Test
    void getProfit() {
        StockList stockList = new StockList();
        for (int i = 0; i < 10; i++) {
            Stock temp = new Stock(""+i, "Stock " + i, 10, 10+i, 100);
            stockList.add(temp);
        }
        double profit = stockList.getProfit();
        double expected = 4500.0;
        assertEquals(expected, profit);
    }

    @Test
    void search() {
        StockList stockList = new StockList();
        for (int i = 0; i < 10; i++) {
            Stock temp = new Stock(""+i, "Stock " + i, 10, 10+i, 100);
            stockList.add(temp);
        }
        assertEquals(true, stockList.search("0"));
        assertEquals(false, stockList.search("1000"));
    }
}