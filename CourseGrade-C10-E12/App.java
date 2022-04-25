import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static ArrayList<GradeBook> gb = new ArrayList<GradeBook>();
    static int[] testScores = { 0, 0, 0, 0, 0 };
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        initGradeBook();
        getGrades();
        showGrades();
    }

    // initialize the content of the gradebook...
    public static void initGradeBook() {
        GradeBook Ven = new GradeBook(1, "Ven", 0);
        GradeBook Win = new GradeBook(2, "Erwin", 0);
        GradeBook Ian = new GradeBook(3, "Ian", 0);
        GradeBook Jap = new GradeBook(4, "Japs", 0);
        GradeBook Jay = new GradeBook(5, "Jay", 0);

        gb.add(Ven);
        gb.add(Win);
        gb.add(Ian);
        gb.add(Jap);
        gb.add(Jay);

        // for test printing only...
        // for (GradeBook g : gb) {
        // System.out.println(g.getStudNum() + g.getStudName());
        // }
    }

    public static void getGrades() {
        int score = 0;
        int j = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.println("INSTRUCTIONS : Input test score for Test " + i + " : ");
            score = sc.nextInt();

            testScores[j] = score;
            j++;
        }

        testAve(testScores[0], testScores[1], testScores[2], testScores[3], testScores[4]);

        // for test print only...
        // for (int k = 0; k <= 5; k++) {
        //     System.out.println(testScores[k]);
        // }
    }

    // display the grades for the class...
    public static void showGrades() {
        System.out.printf("%15s %15s %15s \n", "STUDENTS NUMBER", "NAME", "GRADE");
        for (GradeBook g : gb) {
            System.out.printf("%15s %15s %15s \n", g.getStudNum(), g.getStudName(), g.getGrades());
        }
    }

    public static double testAve(double score1, double score2, double score3, double score4, double score5) {
        double totalScore = score1 + score2 + score3 + score4 + score5;
        double testAve = totalScore/5; 
        return testAve;
    }
}
