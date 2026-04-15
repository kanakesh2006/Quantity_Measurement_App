import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class test {

    //  Feet to Feet
    @Test
    void testEquality_FeetToFeet_SameValue() {
        MainApp.Length l1 = new MainApp.Length(1.0, MainApp.LengthUnit.FEET);
        MainApp.Length l2 = new MainApp.Length(1.0, MainApp.LengthUnit.FEET);

        assertTrue(l1.equals(l2));
    }

    //  Inches to Inches
    @Test
    void testEquality_InchToInch_SameValue() {
        MainApp.Length l1 = new MainApp.Length(1.0, MainApp.LengthUnit.INCHES);
        MainApp.Length l2 = new MainApp.Length(1.0, MainApp.LengthUnit.INCHES);

        assertTrue(l1.equals(l2));
    }

    //  Cross-unit equality (MOST IMPORTANT)
    @Test
    void testEquality_FeetToInches_EquivalentValue() {
        MainApp.Length l1 = new MainApp.Length(1.0, MainApp.LengthUnit.FEET);
        MainApp.Length l2 = new MainApp.Length(12.0, MainApp.LengthUnit.INCHES);

        assertTrue(l1.equals(l2));
    }

    //  Reverse check (symmetry)
    @Test
    void testEquality_InchesToFeet_EquivalentValue() {
        MainApp.Length l1 = new MainApp.Length(12.0, MainApp.LengthUnit.INCHES);
        MainApp.Length l2 = new MainApp.Length(1.0, MainApp.LengthUnit.FEET);

        assertTrue(l1.equals(l2));
    }

    //  Different values
    @Test
    void testEquality_DifferentValues() {
        MainApp.Length l1 = new MainApp.Length(1.0, MainApp.LengthUnit.FEET);
        MainApp.Length l2 = new MainApp.Length(2.0, MainApp.LengthUnit.FEET);

        assertFalse(l1.equals(l2));
    }

    //  Null comparison
    @Test
    void testEquality_NullComparison() {
        MainApp.Length l1 = new MainApp.Length(1.0, MainApp.LengthUnit.FEET);

        assertFalse(l1.equals(null));
    }

    //  Invalid unit
    @Test
    void testEquality_NullUnit() {
        assertThrows(IllegalArgumentException.class, () -> {
            new MainApp.Length(1.0, null);
        });
    }

    //  Same reference
    @Test
    void testEquality_SameReference() {
        MainApp.Length l1 = new MainApp.Length(1.0, MainApp.LengthUnit.FEET);

        assertTrue(l1.equals(l1));
    }
}