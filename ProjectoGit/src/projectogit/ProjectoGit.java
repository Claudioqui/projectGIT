//@Claudioqui
package projectogit;

import java.util.Scanner;


public class ProjectoGit {
static Scanner keyboard = new Scanner (System.in);

    public static void main(String[] args) {
        //preguntar dni
        int dni=12345678;
        char letter = DNILetter(dni);
        System.out.println(dni+":"+letter);
        
        
}
    //funcion que recibe dni y devuelve la letra
    private static char DNILetter(int dni){
     char letter='T';
     String letters ="TRWEAGMYFPDXBNJZSQVHLCKE";
     int res=dni%23;
     letter= letters.charAt(res);
     return letter;
    }
}

