package ra.run;

import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("**********************QUẢN LÝ HỌC VIỆN*******************");
            System.out.println("1. Quản lý lớp");
            System.out.println("2. Quản lý sinh viên");
            System.out.println("3.Thoát");
            System.out.println("sự lựa chon của bạn:");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    QuanLylh(sc);
                    break;

                case 2:
                    QuanLysv(sc);
                    break;

                case 3:
                    System.exit(0);
                default:
                    System.out.println(" hay nhap tu 1-3 ");
            }
        } while (true);
    }

    public static void QuanLylh(Scanner sc) {
        boolean check = true;

        do {
            System.out.println("**********************QUẢN LÝ LỚP HỌC********************");
            System.out.println("1. Thêm mới lớp học");
            System.out.println("2. Cập nhật thông tin lớp học");
            System.out.println("3. Hiển thị thông tin lớp học");
            System.out.println("4. Thống kê các lớp học đang hoạt động (ClassStatus = true)");
            System.out.println("5. Tìm kiếm lớp học theo tên lớp học");
            System.out.println("6. Thoát");
            System.out.println("lựa chọn cảu bạn: ");

            int choice1 = Integer.parseInt(sc.nextLine());

            switch (choice1) {
                case 1:

                    break;
                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 6:
                    check = false;
                    break;

                case 7:
                default:
                    System.out.println("hãy nhập từ 1-6");

            }


        } while (check);
    }
    public static void QuanLysv(Scanner sc){
        boolean checksv = true;

        do {
            System.out.println("***********************QUẢN LÝ SINH VIÊN*********************");
            System.out.println("1. Thêm mới sinh viên");
            System.out.println("2. Cập nhật thông tin sinh viên");
            System.out.println("3. Hiển thị thông tin sinh viên");
            System.out.println("4. Tính điểm trung bình");
            System.out.println("5. Xếp loại sinh viên");
            System.out.println("6. Sắp xếp sinh viên theo điểm trung bình tăng dần");
            System.out.println("7. Tìm kiếm sinh viên theo tên sinh viên");
            System.out.println("8. Thống kê số sinh viên đạt loại giỏi, khá, trung bình và yếu");
            System.out.println("9. Thống kê các sinh viên Pass qua các môn học");
            System.out.println("10.Thoát");
            System.out.println("lựa chọn của bạn:");

            int choice2 = Integer.parseInt(sc.nextLine());

            switch (choice2){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    checksv = false;
                    break;
                default:
                    System.out.println("vui long chon tu 1-10");

            }
        }while (checksv);
    }
}


