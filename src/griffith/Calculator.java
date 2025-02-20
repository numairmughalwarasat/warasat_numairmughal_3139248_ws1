package griffith;

public class Calculator {

    // Method to return the maximum grade
    public int gradesMax(int[] grades) {
        if (grades == null) throw new NullPointerException();
        int max = grades[0];
        for (int grade : grades) {
            if (grade > max) {
                max = grade;
            }
        }
        return max;
    }

    // Method to return the total sum of grades
    public int gradesTotal(int[] grades) {
        if (grades == null) throw new NullPointerException();
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return total;
    }

    // Method to return the average of grades
    public double gradesAverage(int[] grades) {
        if (grades == null) throw new NullPointerException();
        int total = gradesTotal(grades);
        return (double) total / grades.length;
    }
}
