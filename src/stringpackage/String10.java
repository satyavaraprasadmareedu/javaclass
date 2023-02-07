package stringpackage;
//m.satya vara prasad
//210303125059
//22 division
public class String10 {
    //StringGetCharsExample
    public static void main(String args[]){
        String str = new String("hello javatpoint how r u");
        char[] ch = new char[10];
        try{
            str.getChars(6, 16, ch, 0);
            System.out.println(ch);
        }catch(Exception ex){System.out.println(ex);}
    }
}