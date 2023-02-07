package stringpackage;
//m.satya vara prasad
//210303125059
//22 division
public class String9 {
    //StringGetBytesExample
    public static void main(String args[]){
        String s1="SATYA";
        byte[] barr=s1.getBytes();
        for(int i=0;i<barr.length;i++){
            System.out.println(barr[i]);
        }
    }
}