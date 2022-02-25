package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {
   
       
   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String u= scanner.nextLine();
        String p= scanner.nextLine();
        if(u.equals("HuyHoang")&& p.equals("2021")){
            System.out.println("dung");
        }else {
            System.out.println("sai");
        }
        // TODO code application logic here
    }
   
}
