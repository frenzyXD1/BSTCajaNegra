import com.bst.BST;

import com.exceptions.BetweenLevelException;
import com.exceptions.DepthException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BSTTest {
    @Test
    void testPrintBetweenLevelInvalidRange() {
        BST<Integer> tree = new BST<>();
        assertDoesNotThrow(() -> {
            tree.insert(1000, true);
        });
        assertThrows(BetweenLevelException.class, () -> {
            tree.printBetweenLevel(2, 1);
        });
    }

    @Test
    void testPrintBetweenLevelOutOfRange() {
        BST<Integer> tree = new BST<>();
        assertDoesNotThrow(() -> {
            tree.insert(1000, true);
        });
        assertThrows(BetweenLevelException.class, () -> {
            tree.printBetweenLevel(0, 2);
        });
        assertThrows(BetweenLevelException.class, () -> {
            tree.printBetweenLevel(1, 2);
        });
    }

    @Test
    void testPrintBetweenLevelValidRange() {
        BST<Integer> tree = new BST<>();
        assertDoesNotThrow(() -> {
            tree.insert(1000, true);
        });
        assertDoesNotThrow(() -> {
            tree.printBetweenLevel(1, 1);
        });
    }

}