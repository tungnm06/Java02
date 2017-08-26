/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ss1;

import java.util.ArrayList;

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
        //        for(Student student:listStudent){
        //           System.out.println(student.getName());
        //     }
         listStudent.remove(0);
        Student st = listStudent.get(0);
        System.out.println(st.getName());
        
    }

}
