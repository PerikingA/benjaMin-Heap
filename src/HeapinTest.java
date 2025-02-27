import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class HeapinTest {

    @Test
    public void addOneItem() {
        Heapin hi = new Heapin();
        hi.add(4);

        int peeking = hi.peek();
        int getSize = hi.size();
        assertEquals(1, getSize);
        assertEquals(4, peeking);
    }

    @Test
    public void addTwoItems() {
        Heapin hi = new Heapin();
        hi.add(4);
        hi.add(3423);

        int peeking = hi.peek();
        int getSize = hi.size();
        assertEquals(2, getSize);
        assertEquals(4, peeking);
    }

    @Test
    public void addMultipleItems() {
        Heapin hi = new Heapin();
        hi.add(49373);
        hi.add(3423);
        hi.add(87422);
        hi.add(134);
        hi.add(49246);
        hi.add(5454);

        int peeking = hi.peek();
        int getSize = hi.size();
        assertEquals(6, getSize);
        assertEquals(134, peeking);
    }

    @Test
    public void addWithPoll() {
        Heapin hi = new Heapin();
        hi.add(4);
        hi.add(3423);
        hi.poll();
        hi.add(3);

        int peeking = hi.peek();
        int getSize = hi.size();
        assertEquals(2, getSize);
        assertEquals(3, peeking);
        assertEquals(2, hi.size());
    }

    @Test
    public void addWithPollMoreNums() {
        Heapin hi = new Heapin();
        hi.add(4);
        hi.poll();
        hi.add(3423);
        hi.add(133);
        hi.poll();
        hi.add(3);
        hi.add(1);
        hi.poll();
        hi.add(6535);

        int peeking = hi.peek();
        int getSize = hi.size();
        assertEquals(3, getSize);
        assertEquals(3, peeking);
        assertEquals(3, hi.size());
    }

    @Test
    public void addWithPollMultipleTimes() {
        Heapin hi = new Heapin();
        hi.add(4);
        hi.add(3423);
//        hi.poll();
//        hi.add(3);
//        hi.poll();
//        hi.poll();
//        hi.poll();
//        hi.poll();
//        hi.poll();
//        hi.poll();

//        int peeking = hi.peek();
//        int getSize = hi.getSize();
//
//        hi.peek();
//        assertEquals(0, getSize);
//        assertEquals(0, hi.getSize());
    }

    @Test
    public void remove() {
        Heapin hi = new Heapin();
        hi.add(49373);
        hi.add(234);
        hi.add(1);
        hi.add(322);
        hi.remove(49373);

        int peeking = hi.peek();
        int getSize = hi.size();
        assertEquals(3, getSize);

    }

    @Test
    public void remove2() {
        Heapin hi = new Heapin();
        hi.add(49373);
        hi.add(234);
        hi.poll();
        hi.add(1);
        hi.add(322);
        hi.remove(49373);

        int peeking = hi.peek();
        int getSize = hi.size();
        assertEquals(2, getSize);

    }

    @Test
    public void removePollandPeek() {
        Heapin hi = new Heapin();
        hi.add(49373);
        hi.add(234);
        hi.poll();
        hi.add(1);
        hi.add(322);
        hi.remove(49373);
        hi.peek();

        int peeking = hi.peek();
        int getSize = hi.size();
        assertEquals(2, getSize);
        assertEquals(1, peeking);


    }


}