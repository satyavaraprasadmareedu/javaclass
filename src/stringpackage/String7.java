package stringpackage;
//m.satya vara prasad
//210303125059
//22 division
public class String7 {
    //EqualsIgnoreCaseExample{

    public static void main(String args[]){
        String s1="satya";
        String s2="satya";
        String s3="SATYA";
        String s4="python";
        System.out.println(s1.equalsIgnoreCase(s2));//true because content and case both are same
        System.out.println(s1.equalsIgnoreCase(s3));//true because case is ignored
        System.out.println(s1.equalsIgnoreCase(s4));//false because content is not same
    }
}
