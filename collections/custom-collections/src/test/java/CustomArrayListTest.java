import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomArrayListTest {
    CustomArrayList<Integer> arrayList;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        arrayList = new CustomArrayList<Integer>();
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        arrayList = null;
    }

    @org.junit.jupiter.api.Test
    void add() {
        boolean result = arrayList.add(4);
        assertTrue(result);
    }

    @org.junit.jupiter.api.Test
    void testAdd() {
        assertThrows(IndexOutOfBoundsException.class, () -> arrayList.add(11, 3));
    }

    @org.junit.jupiter.api.Test
    void testAdd_Shifted_Element() {
        arrayList.add(0, 5);
        arrayList.add(1, 3);
        arrayList.add(2,4);
        arrayList.add(1,8);
        assert(arrayList.get(0) == 5);
        assert(arrayList.get(1) == 8);
        assert(arrayList.get(2) == 3);
        assert(arrayList.get(3) == 4);
    }

    @org.junit.jupiter.api.Test
    void addAll() {
    }

    @org.junit.jupiter.api.Test
    void clear() {
    }

    @org.junit.jupiter.api.Test
    void contains() {
    }

    @org.junit.jupiter.api.Test
    void indexOf() {
    }

    @org.junit.jupiter.api.Test
    void isEmpty() {
    }

    @org.junit.jupiter.api.Test
    void remove() {
    }

    @org.junit.jupiter.api.Test
    void size() {
    }
}