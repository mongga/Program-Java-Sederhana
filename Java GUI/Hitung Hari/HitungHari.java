/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lenovo
 */
public class HitungHari {
    String bulan, hasil;
    int tahun;
    
    String hitung(){
        switch(bulan){
            case "Januari" :
            case "Maret" :
            case "Mei" :
            case "Juli" :
            case "Agustus" :
            case "Oktober" :
            case "Desember" :
                hasil = "Jumlah Hari Pada Tahun "+tahun+" bulan "+bulan+" adalah 31 Hari";
                break;
            case "April" :
            case "Juni" :
            case "September" :
            case "November" :
                hasil = "Jumlah Hari Pada Tahun "+tahun+" bulan "+bulan+" adalah 30 Hari";                
                break;
            case "Februari" :
                if(tahun % 400 == 0 || tahun % 4 == 0 && tahun % 100 != 0){
                    hasil = "Jumlah Hari Pada Tahun "+tahun+" bulan "+bulan+" adalah 29 Hari";
                }else{
                    hasil = "Jumlah Hari Pada Tahun "+tahun+" bulan "+bulan+" adalah 28 Hari";
                }
                break;
            default :
                hasil = "Data Yang Anda Masukan Salah";
        }
        return hasil;
    }
}
