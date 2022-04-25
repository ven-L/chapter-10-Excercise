public class GradeBook {
    private int studNum;
    private String studName;
    private float grades;

    GradeBook(int studNum, String studName, float grades) {
        this.studNum = studNum;
        this.studName = studName;
        this.grades = grades;
    }

    /**
     * @return int return the studNum
     */
    public int getStudNum() {
        return studNum;
    }

    /**
     * @param studNum the studNum to set
     */
    public void setStudNum(int studNum) {
        this.studNum = studNum;
    }

    /**
     * @return String return the studName
     */
    public String getStudName() {
        return studName;
    }

    /**
     * @param studName the studName to set
     */
    public void setStudName(String studName) {
        this.studName = studName;
    }

    /**
     * @return float return the grades
     */
    public float getGrades() {
        return grades;
    }

    /**
     * @param grades the grades to set
     */
    public void setGrades(float grades) {
        this.grades = grades;
    }

}
