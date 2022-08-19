/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumlatpert8;

/**
 *
 * @author Muhammad Syam F
 */
public class NilaiMhs2 extends NilaiMhs{
     
    String ket;
        char gradeMhs(){
            if (rata >=80)
                grade = 'A';
            else if (rata >=65)
                grade = 'B';
            else if (rata >= 56)
                grade = 'C';
            else if(rata >=40)
                grade = 'D';
            else
                grade = 'E';
            return grade;
        }
    String hasil(){
        if (rata >=56)
            ket = "Lulus";
        else
            ket = "Tidak Lulus";
        return ket;
    }
}
