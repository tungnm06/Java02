/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ss1;

/**
 *
 * @author Administrator
 */
public class Ss1 {

    public static void main(String[] args) {
        String names = " Nam, Truong, Dung, Danh, Tung, Khanh, Linh, Dong, Chien, Truong2, Ngoc, Toản, Toàn";
        String[] arrayName = names.split(",");
        for (int i = 0; i < arrayName.length; i++) {
            System.out.println(i + 1 + ". " + arrayName[i].trim());
            System.out.println("KaKa");
        }
        
        

    }
}
