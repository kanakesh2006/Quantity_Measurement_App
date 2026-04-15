import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class test {

    //  Same value
    @Test
    void testEquality_SameValue() {
        MainApp.Feet f1 = new MainApp.Feet(1.0);
        MainApp.Feet f2 = new MainApp.Feet(1.0);

        assertTrue(f1.equals(f2));
    }

    //  Different values
    @Test
    void testEquality_DifferentValue() {
        MainApp.Feet f1 = new MainApp.Feet(1.0);
        MainApp.Feet f2 = new MainApp.Feet(2.0);

        assertFalse(f1.equals(f2));
    }

    //  Null comparison
    @Test
    void testEquality_NullComparison() {
        MainApp.Feet f1 = new MainApp.Feet(1.0);

        assertFalse(f1.equals(null));
    }

    //  Different type
    @Test
    void testEquality_DifferentClass() {
        MainApp.Feet f1 = new MainApp.Feet(1.0);

        assertFalse(f1.equals("1.0"));
    }

    //  Same reference
    @Test
    void testEquality_SameReference() {
        MainApp.Feet f1 = new MainApp.Feet(1.0);

        assertTrue(f1.equals(f1));
    }
}