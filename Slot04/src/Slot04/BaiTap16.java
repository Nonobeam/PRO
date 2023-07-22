/**
 * Thao tác về chuỗi
 * @author hunagroup
 */
public class BaiTap16 {
    public static void main(String [] agrs){     
        String myChuoi = "Hello;world;student;FPTU;TP.HCM";
        
        String [] mangTuVung = myChuoi.split(";");
        
        for(String s : mangTuVung){
            System.out.println(s);
        }
    }
}
