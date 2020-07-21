package array.easy.duplicateremoval;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortedArrayDuplicateRemoveTest {
    SortedArrayDuplicateRemove obj;
    @BeforeEach
    void setUp() {
        obj = new SortedArrayDuplicateRemove();
    }

    @Test
    void removeDuplicates() {
        assertEquals(2, obj.removeDuplicates(new int[]{1,1,2}));
    }
}