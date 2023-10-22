import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

public class TicketManagerTest {
    @Test
    public void sortTickets3() {

        AviaSouls manager = new AviaSouls();
        Ticket t1 = new Ticket("Madrid", "Barcelona", 1123, 12, 14);
        Ticket t2 = new Ticket("Valencia", "Paris", 253, 4, 6);
        Ticket t3 = new Ticket("Munich", "Philadelphia", 3234, 9, 15);
        Ticket t4 = new Ticket("Madrid", "Barcelona", 987, 8, 15);
        Ticket t5 = new Ticket("Luxembourg", "Milan", 2533, 6, 9);
        Ticket t6 = new Ticket("Madrid", "Barcelona", 852, 2, 8);

        manager.add(t1);
        manager.add(t2);
        manager.add(t3);
        manager.add(t4);
        manager.add(t5);
        manager.add(t6);

        Ticket[] actual = manager.search("Madrid", "Barcelona");
        Ticket[] expected = {t6, t4, t1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void sortTickets1() {

        AviaSouls manager = new AviaSouls();
        Ticket t1 = new Ticket("Madrid", "Barcelona", 1123, 12, 14);
        Ticket t2 = new Ticket("Valencia", "Paris", 253, 4, 6);
        Ticket t3 = new Ticket("Munich", "Philadelphia", 3234, 9, 15);
        Ticket t4 = new Ticket("Madrid", "Barcelona", 987, 8, 15);
        Ticket t5 = new Ticket("Luxembourg", "Milan", 2533, 6, 9);
        Ticket t6 = new Ticket("Madrid", "Barcelona", 852, 2, 8);

        manager.add(t1);
        manager.add(t2);
        manager.add(t3);
        manager.add(t4);
        manager.add(t5);
        manager.add(t6);

        Ticket[] actual = manager.search("Valencia", "Paris");
        Ticket[] expected = {t2};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void sortTickets0() {

        AviaSouls manager = new AviaSouls();
        Ticket t1 = new Ticket("Madrid", "Barcelona", 1123, 12, 14);
        Ticket t2 = new Ticket("Valencia", "Paris", 253, 4, 6);
        Ticket t3 = new Ticket("Munich", "Philadelphia", 3234, 9, 15);
        Ticket t4 = new Ticket("Madrid", "Barcelona", 987, 8, 15);
        Ticket t5 = new Ticket("Luxembourg", "Milan", 2533, 6, 9);
        Ticket t6 = new Ticket("Madrid", "Barcelona", 852, 2, 8);

        manager.add(t1);
        manager.add(t2);
        manager.add(t3);
        manager.add(t4);
        manager.add(t5);
        manager.add(t6);

        Ticket[] actual = manager.search("Miami", "Kramatorsk");
        Ticket[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void sortComparatorTickets3() {

        AviaSouls manager = new AviaSouls();
        Ticket t1 = new Ticket("Madrid", "Barcelona", 1123, 1, 3);
        Ticket t2 = new Ticket("Valencia", "Paris", 253, 4, 6);
        Ticket t3 = new Ticket("Munich", "Philadelphia", 3234, 9, 15);
        Ticket t4 = new Ticket("Madrid", "Barcelona", 987, 8, 11);
        Ticket t5 = new Ticket("Luxembourg", "Milan", 2533, 6, 9);
        Ticket t6 = new Ticket("Madrid", "Barcelona", 852, 2, 6);

        manager.add(t1);
        manager.add(t2);
        manager.add(t3);
        manager.add(t4);
        manager.add(t5);
        manager.add(t6);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] actual = manager.searchAndSortBy("Madrid", "Barcelona", comparator);
        Ticket[] expected = {t1, t4, t6};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void sortComparatorTickets1() {

        AviaSouls manager = new AviaSouls();
        Ticket t1 = new Ticket("Madrid", "Barcelona", 1123, 12, 14);
        Ticket t2 = new Ticket("Valencia", "Paris", 253, 4, 6);
        Ticket t3 = new Ticket("Munich", "Philadelphia", 3234, 9, 15);
        Ticket t4 = new Ticket("Madrid", "Barcelona", 987, 8, 15);
        Ticket t5 = new Ticket("Luxembourg", "Milan", 2533, 6, 9);
        Ticket t6 = new Ticket("Madrid", "Barcelona", 852, 2, 8);

        manager.add(t1);
        manager.add(t2);
        manager.add(t3);
        manager.add(t4);
        manager.add(t5);
        manager.add(t6);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] actual = manager.searchAndSortBy("Luxembourg", "Milan", comparator);
        Ticket[] expected = {t5};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void sortComparatorTickets0() {

        AviaSouls manager = new AviaSouls();
        Ticket t1 = new Ticket("Madrid", "Barcelona", 1123, 12, 14);
        Ticket t2 = new Ticket("Valencia", "Paris", 253, 4, 6);
        Ticket t3 = new Ticket("Munich", "Philadelphia", 3234, 9, 15);
        Ticket t4 = new Ticket("Madrid", "Barcelona", 987, 8, 15);
        Ticket t5 = new Ticket("Luxembourg", "Milan", 2533, 6, 9);
        Ticket t6 = new Ticket("Madrid", "Barcelona", 852, 2, 8);

        manager.add(t1);
        manager.add(t2);
        manager.add(t3);
        manager.add(t4);
        manager.add(t5);
        manager.add(t6);
        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] actual = manager.searchAndSortBy("Kiev", "Kramatorsk", comparator);
        Ticket[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

}