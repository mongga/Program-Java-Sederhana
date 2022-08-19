/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quissuhu;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class InputDataSuhu {
    ArrayList<Suhu> listsuhu;
    
    public InputDataSuhu(){
        listsuhu =new ArrayList();
    }
    public void InsertData (String SuhuTF,String CtFTF,String CtRTF,String RtFTF, String FtRTF){
        Suhu suhu = new Suhu (SuhuTF,CtFTF, CtRTF, RtFTF, FtRTF);
        listsuhu.add(suhu);
    }
    public ArrayList<Suhu> getAll(){
        return listsuhu;
    }
    public void deletedata(int index){
        listsuhu.remove(index);
    }
}
