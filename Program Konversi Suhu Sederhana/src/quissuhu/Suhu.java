/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quissuhu;

/**
 *
 * @author User
 */
public class Suhu {
    private String SuhuTF,CtFTF,CtRTF,RtFTF,FtRTF;
    
    public Suhu(String SuhuTF,String  CtFTF,String CtRTF,String RtFTF,String FtRTF){
        this.SuhuTF = SuhuTF;
        this.CtFTF  = CtFTF;
        this.CtRTF  = CtRTF;
        this.RtFTF  = RtFTF;
        this.FtRTF  = FtRTF;
    }
    public String getSuhuTF(){
        return SuhuTF;
    }
    public String getCtFTF(){
        return CtFTF;
    }
    public String getCtRTF(){
        return CtRTF;
    }
    public String getRtFTF(){
        return RtFTF;
    }
    public String getFtRTF(){
        return FtRTF;
    }
}
