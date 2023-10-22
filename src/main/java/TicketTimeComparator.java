import java.util.Comparator;

public class TicketTimeComparator implements Comparator<Ticket> {

    @Override
    public int compare(Ticket t1, Ticket t2) {
        int diff1 = t1.getTimeTo() - t1.getTimeFrom();
        int diff2 = t2.getTimeTo() - t2.getTimeFrom();

//return diff1 - diff2
        if (diff1 < diff2) {
            return -1;
        }
        if (diff1 > diff2) {
            return 1;
        } else {
            return 0;
        }
    }
}

