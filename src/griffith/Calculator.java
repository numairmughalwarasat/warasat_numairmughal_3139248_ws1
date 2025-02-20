package griffith;

public class Calculator {

    // Method to return the maximum grad
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
}
