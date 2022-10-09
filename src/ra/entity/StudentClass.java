package ra.entity;

import java.util.Scanner;

public  class StudentClass implements IStudentManagement{
    private String classId;
    private  String className;
    private String descripTions;
    private int classStatu;
    private String ClassId;

    public StudentClass(String classId, String className, String descripTions, int classStatu, String classId1) {
        this.classId = classId;
        this.className = className;
        this.descripTions = descripTions;
        this.classStatu = classStatu;
        ClassId = classId1;
    }

    public String getClassId() {
        return classId;
    }

    public void setClassId(String classId) {
        this.classId = classId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getDescripTions() {
        return descripTions;
    }

    public void setDescripTions(String descripTions) {
        this.descripTions = descripTions;
    }

    public int getClassStatu() {
        return classStatu;
    }

    public void setClassStatu(int classStatu) {
        this.classStatu = classStatu;
    }

    @Override
    public void inputData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập thông tin lớp");
        System.out.println("mã lớp ");
        while (this.ClassId.trim().length()<=10){
            System.out.println("tên lớp tối đa 10 ký tự");
            this.className = sc.nextLine();
        }
        System.out.println("mô tả lớp");
        this.descripTions = sc.nextLine();
        System.out.println("trạng thái lớp");
        this.classStatu = Integer.parseInt(sc.nextLine());

    }

    @Override
    public void displayData() {

    }
}
