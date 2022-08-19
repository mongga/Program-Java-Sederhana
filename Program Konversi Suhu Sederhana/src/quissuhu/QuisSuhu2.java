/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quissuhu;

/**
 *
 * @author User
 */
public class QuisSuhu2 extends Quissuhu {
    double ReamurtoFahrenheit(double r){
        return(2.25*r)+32;
    }
    double FahrenheittoReamur(double f){
        return(0.444444444)*(f-32);
    }
}
