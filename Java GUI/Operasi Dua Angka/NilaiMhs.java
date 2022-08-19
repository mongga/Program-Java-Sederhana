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
public class NilaiMhs {
    double tm, uas, uts,rata; char grade;
    double nilaiRata(){
    rata = (tm+uts+uas)/3;
    return rata;
    }
}
