public class StudentCourses {

    private String[] courseCodes = { "C#", "ST", "ML", "DEVOPS", "MP" };
    private int[] marks = { 85, 72, 75, 62, 87 };

    public void displayStudentMarks() {
        System.out.println("Course names \t Marks Obtained");

        for (int i = 0; i < courseCodes.length; i++) {
                System.out.println(courseCodes[i] + "\t\t\t" + marks[i]);
        }
    }

}