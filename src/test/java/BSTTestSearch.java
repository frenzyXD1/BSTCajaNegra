import com.bst.BST;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class BSTTestSearch {
    @Test
    void testSearchNonExistentContent() {
        BST<Integer> tree = new BST<>();
        assertDoesNotThrow(() -> {
            tree.insert(1000, true);
        });
        assertNull(tree.search(2000));
    }

    @Test
    void testSearchExiste() {
        BST<Integer> tree = new BST<>();
        assertDoesNotThrow(() -> {
            tree.insert(1000, true);
        });
        assertNotNull(tree.search(1000));
    }

}
