package ra.entity;

public  class Student implements IStudentManagement{
    private String studenId;
    private String studentName;
    private int age;
    private boolean sex;
    private String classStuden;
    private float[] listMarkJavaScript;
    private  float[] listMarkJavaCore;
    private  float[] ListMarkJavaWeb;
    private  float avgMark;
    private String gpa;
    private Boolean StudentStatus;

    public Student(String studenId, String studentName, int age, boolean sex, String classStuden, float[] listMarkJavaScript, float[] listMarkJavaCore, float[] listMarkJavaWeb, float avgMark, String gpa, Boolean studentStatus) {
        this.studenId = studenId;
        this.studentName = studentName;
        this.age = age;
        this.sex = sex;
        this.classStuden = classStuden;
        this.listMarkJavaScript = listMarkJavaScript;
        this.listMarkJavaCore = listMarkJavaCore;
        ListMarkJavaWeb = listMarkJavaWeb;
        this.avgMark = avgMark;
        this.gpa = gpa;
        StudentStatus = studentStatus;
    }

    public String getStudenId() {
        return studenId;
    }

    public void setStudenId(String studenId) {
        this.studenId = studenId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getClassStuden() {
        return classStuden;
    }

    public void setClassStuden(String classStuden) {
        this.classStuden = classStuden;
    }

    public float[] getListMarkJavaScript() {
        return listMarkJavaScript;
    }

    public void setListMarkJavaScript(float[] listMarkJavaScript) {
        this.listMarkJavaScript = listMarkJavaScript;
    }

    public float[] getListMarkJavaCore() {
        return listMarkJavaCore;
    }

    public void setListMarkJavaCore(float[] listMarkJavaCore) {
        this.listMarkJavaCore = listMarkJavaCore;
    }

    public float[] getListMarkJavaWeb() {
        return ListMarkJavaWeb;
    }

    public void setListMarkJavaWeb(float[] listMarkJavaWeb) {
        ListMarkJavaWeb = listMarkJavaWeb;
    }

    public float getAvgMark() {
        return avgMark;
    }

    public void setAvgMark(float avgMark) {
        this.avgMark = avgMark;
    }

    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }

    public Boolean getStudentStatus() {
        return StudentStatus;
    }

    public void setStudentStatus(Boolean studentStatus) {
        StudentStatus = studentStatus;
    }

    @Override
    public void inputData() {

    }

    @Override
    public void displayData() {

    }
}
