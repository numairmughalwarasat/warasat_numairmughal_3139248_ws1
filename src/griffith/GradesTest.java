package griffith;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class GradesTest {

    @Test
    void testGradesMax() {
        Grades grades = new Grades();
        
        // Test with positive grades
        assertEquals(95, grades.gradesMax(new int[]{90, 85, 95, 78}));
        
        // Test with negative grades
        assertEquals(0, grades.gradesMax(new int[]{-10, -20, -5, 0}));
        
        // Test with null array (expected to throw NullPointerException)
        assertThrows(NullPointerException.class, () -> grades.gradesMax(null));
    }

    @Test
    void testGradesTotal() {
        Grades grades = new Grades();
        
        // Test with positive grades
        assertEquals(350, grades.gradesTotal(new int[]{90, 85, 95, 80}));
        
        // Test with negative grades
        assertEquals(-35, grades.gradesTotal(new int[]{-10, -20, -5, 0}));
        
        // Test with null array (expected to throw NullPointerException)
        assertThrows(NullPointerException.class, () -> grades.gradesTotal(null));
    }

    @Test
    void testGradesAverage() {
        Grades grades = new Grades();
        
        // Test with positive grades
        assertEquals(87.5, grades.gradesAverage(new int[]{90, 85, 95, 80}), 0.01);
        
        // Test with negative grades
        assertEquals(-8.75, grades.gradesAverage(new int[]{-10, -20, -5, 0}), 0.01);
        
        // Test with null array (expect
    }}
