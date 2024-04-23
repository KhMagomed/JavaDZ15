import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

public class CompareToTicketTest {


    @Test
    public void TestCompareTo() {

        AviaSouls manager = new AviaSouls();
        Ticket ticket = new Ticket("Став", "Мира", 505, 10, 16);
        Ticket ticket2 = new Ticket("Став2", "Мира2", 60, 12, 17);
        Ticket ticket3 = new Ticket("Став", "Мира", 5055, 10, 16);
        Ticket ticket4 = new Ticket("Став23", "Мира245", 630, 12, 17);
        Ticket ticket5 = new Ticket("Став", "Мира", 50522, 10, 16);
        Ticket ticket6 = new Ticket("Став25", "Мира24", 603, 12, 17);

        manager.add(ticket);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);


        Ticket[] expected = {ticket, ticket3, ticket5};
        Ticket[] actual = manager.search("Став", "Мира");

        Assertions.assertArrayEquals(expected, actual);


    }

    @Test
    public void TestTimeComporator() {

        AviaSouls manager = new AviaSouls();
        Ticket ticket = new Ticket("Став", "Мира", 505, 10, 16);
        Ticket ticket2 = new Ticket("Став2", "Мира2", 60, 12, 17);
        Ticket ticket3 = new Ticket("Став", "Мира", 5055, 10, 18);
        Ticket ticket4 = new Ticket("Став23", "Мира245", 630, 12, 17);
        Ticket ticket5 = new Ticket("Став", "Мира", 50522, 10, 12);
        Ticket ticket6 = new Ticket("Став25", "Мира24", 603, 12, 17);

        manager.add(ticket);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);

        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = {ticket5, ticket, ticket3};
        Ticket[] actual = manager.searchAndSortBy("Став", "Мира", comparator);

        Assertions.assertArrayEquals(expected, actual);
    } @Test
    public void TestTimeComporator3() {

        AviaSouls manager = new AviaSouls();
        Ticket ticket = new Ticket("Став", "Мира", 505, 10, 16);
        Ticket ticket2 = new Ticket("Став2", "Мира2", 60, 12, 17);
        Ticket ticket3 = new Ticket("Став", "Мира", 5055, 10, 18);
        Ticket ticket4 = new Ticket("Став23", "Мира245", 630, 12, 17);
        Ticket ticket5 = new Ticket("Став", "Мира", 50522, 10, 12);
        Ticket ticket6 = new Ticket("Став25", "Мира24", 603, 12, 17);

        manager.add(ticket);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);

        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = {};
        Ticket[] actual = manager.searchAndSortBy("Став", "Мир", comparator);

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void TestTimeComporator4() {

        AviaSouls manager = new AviaSouls();
        Ticket ticket = new Ticket("Став", "Мира", 505, 10, 16);
        Ticket ticket2 = new Ticket("Став2", "Мира2", 60, 12, 17);
        Ticket ticket3 = new Ticket("Став", "Мира", 5055, 10, 18);
        Ticket ticket4 = new Ticket("Став23", "Мира245", 630, 12, 17);
        Ticket ticket5 = new Ticket("Став", "Мира", 50522, 10, 12);
        Ticket ticket6 = new Ticket("Став25", "Мира24", 603, 12, 17);

        manager.add(ticket);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);

        Comparator<Ticket> comparator = new TicketTimeComparator();

        Ticket[] expected = {ticket6};
        Ticket[] actual = manager.searchAndSortBy("Став25", "Мира24", comparator);

        Assertions.assertArrayEquals(expected, actual);
    }
}
