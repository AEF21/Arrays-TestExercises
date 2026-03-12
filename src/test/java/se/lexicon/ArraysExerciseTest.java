package se.lexicon;



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

    class ArraysExercisesTest {

        @Test
        void testIndexOf_FindsExistingValue() {
            String[] array = {"Pass", "Ticket", "Destination", "Money"};
            int result = ArraysExercises.indexOf(array, "Ticket");

            assertEquals(1, result, "Should return index 1 for 'Ticket'");
        }

        @Test
        void testIndexOf_ReturnsMinusOneForMissingValue() {
            String[] array = {"Pass", "Ticket", "Destination", "Money"};
            int result = ArraysExercises.indexOf(array, "Family");

            assertEquals(-1, result, "Should return -1 when value is not found");
        }

        @Test
        void testIndexOf_FirstElementMatch() {
            String[] array = {"Paris", "London", "New York"};
            int result = ArraysExercises.indexOf(array, "Paris");

            assertEquals(0, result, "Should return 0 for first element");
        }

        @Test
        void testIndexOf_LastElementMatch() {
            String[] array = {"Paris", "London", "New York"};
            int result = ArraysExercises.indexOf(array, "New York");

            assertEquals(2, result, "Should return last index when matching last element");
        }

        @Test
        void testIndexOf_EmptyArray() {
            String[] array = {};
            int result = ArraysExercises.indexOf(array, "Anything");

            assertEquals(-1, result, "Empty array should always return -1");
        }
    }


