import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class test {

    // -------- FEET TESTS --------

    @Test
    void testFeetEquality_SameValue() {
        MainApp.Feet f1 = new MainApp.Feet(1.0);
        MainApp.Feet f2 = new MainApp.Feet(1.0);

        assertTrue(f1.equals(f2));
    }

    @Test
    void testFeetEquality_DifferentValue() {
        MainApp.Feet f1 = new MainApp.Feet(1.0);
        MainApp.Feet f2 = new MainApp.Feet(2.0);

        assertFalse(f1.equals(f2));
    }

    @Test
    void testFeetEquality_NullComparison() {
        MainApp.Feet f1 = new MainApp.Feet(1.0);

        assertFalse(f1.equals(null));
    }

    @Test
    void testFeetEquality_DifferentClass() {
        MainApp.Feet f1 = new MainApp.Feet(1.0);

        assertFalse(f1.equals("test"));
    }

    @Test
    void testFeetEquality_SameReference() {
        MainApp.Feet f1 = new MainApp.Feet(1.0);

        assertTrue(f1.equals(f1));
    }

    // -------- INCHES TESTS --------

    @Test
    void testInchesEquality_SameValue() {
        MainApp.Inches i1 = new MainApp.Inches(1.0);
        MainApp.Inches i2 = new MainApp.Inches(1.0);

        assertTrue(i1.equals(i2));
    }

    @Test
    void testInchesEquality_DifferentValue() {
        MainApp.Inches i1 = new MainApp.Inches(1.0);
        MainApp.Inches i2 = new MainApp.Inches(2.0);

        assertFalse(i1.equals(i2));
    }

    @Test
    void testInchesEquality_NullComparison() {
        MainApp.Inches i1 = new MainApp.Inches(1.0);

        assertFalse(i1.equals(null));
    }

    @Test
    void testInchesEquality_DifferentClass() {
        MainApp.Inches i1 = new MainApp.Inches(1.0);

        assertFalse(i1.equals(10));
    }

    @Test
    void testInchesEquality_SameReference() {
        MainApp.Inches i1 = new MainApp.Inches(1.0);

        assertTrue(i1.equals(i1));
    }
}