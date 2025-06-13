package examplecollectionmap;
import java.util.Map;
/**
 * This program compares two sets of student grades (original and makeup).
 * It updates each student's grade to the higher score between the two tests.
 * Finally, it prints the final grades.
 */
public class FinalResults {
    public static void main(String[] args) {
        Map<String, Integer> originalGrades = TestResults.getOriginalGrades();
        Map<String, Integer> makeUpGrades = TestResults.getMakeUpGrades();

        for (String student : originalGrades.keySet()) {
            int originalScore = originalGrades.get(student);
            int makeupScore = makeUpGrades.getOrDefault(student, 0);

            if (makeupScore > originalScore) {
                originalGrades.put(student, makeupScore);
            }
        }

        System.out.println("Final Grades:");
        for (Map.Entry<String, Integer> entry : originalGrades.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
