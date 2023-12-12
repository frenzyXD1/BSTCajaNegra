import com.bst.BST;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BSTTestInsert {
    @Test
    void testInsertNullContent() {
        BST<Integer> tree = new BST<>();
        assertThrows(IllegalArgumentException.class, () -> {
            tree.insert(null, true);
        });
    }
    @Test
    void testInsertOutOfRangeContent() {
        BST<Integer> tree = new BST<>();
        assertThrows(IllegalArgumentException.class, () -> {
            tree.insert(3000, true);
        });
        assertThrows(IllegalArgumentException.class, () -> {
            tree.insert(-3000, true);
        });
    }
    @Test
    void testInsertValidContent() {
        BST<Integer> tree = new BST<>();
        assertDoesNotThrow(() -> {
            tree.insert(1000, true);
        });
    }
}