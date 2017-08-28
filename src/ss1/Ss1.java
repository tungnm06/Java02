/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ss1;

import java.util.ArrayList;
import java.util.Scanner;

/*
 *String names = " Nam, Truong, Dung, Danh, Tung, Khanh, Linh, Dong, Chien, Truong2, Ngoc, Toản, Toàn";
        String[] arrayName = names.split(",");
        for (int i = 0; i < arrayName.length; i++) {
            System.out.println(i + 1 + ". " + arrayName[i].trim());
            System.out.println("KaKa");
 * @author Administrator
 */
public class Ss1 {

    public static void main(String[] args) {
        Student student01 = new Student();
        student01.setName("Truong");
        student01.setEmail("truong@gmail.com");
        student01.setBirthday("22/12/1995");
        Student student02 = new Student();
        student02.setName("Hung");
        student02.setEmail("Hung@gmail.com");
        student02.setBirthday("22/12/1996");

        ArrayList<Student> listStudent = new ArrayList<>();
        listStudent.add(student01);
        listStudent.add(student02);
        Student student03 = new Student();
        student03.setName("Dung");
        student03.setEmail("Dung@gmail.com");
        student03.setBirthday("22/12/1994");
        listStudent.add(student03);
        //   System.out.println("Danh sách sinh viên :");
        // for (Student student : listStudent) {
        //      System.out.println(student.getName());
        //    System.out.println(student.getBirthday());
        //    System.out.println(student.getEmail());
        //         }
        // listStudent.remove(0);
        // Student st = listStudent.get(0);
        // System.out.println(st.getName());
        System.out.println("------Menu console------");
        System.out.println("1-Hiển thị danh sách sinh viên;");
        System.out.println("2-Thêm mới sinh viên;");
        System.out.println("3-Sửa sinh viên;");
        System.out.println("4-Xóa sinh viên");
        System.out.println("5-Thoát");
        System.out.println("Mời bạn lựa chọn :");
        Scanner scanner = new Scanner(System.in);
        int select = scanner.nextInt();
        switch (select) {
            case 1:
                System.out.println("Bạn đã chọn hiển thị danh sách sinh viên");
                break;
            case 2:
                System.out.println("Bạn đã chọn chức năng thêm mới sinh viên");
                break;
            case 3:
                System.out.println("Bạn đã chọn chức năng sửa thông tin sinh viên");
                break;
            case 4:
                System.out.println("Bạn đã chọn chức năng xóa sinh viên");
                break;
            case 5:
                System.out.println("Bạn đã chọn thoát ra");
                break;
            default: System.out.println("Nhập sai rồi nhập lại đi"); break;

        }
    }
   
    
}
