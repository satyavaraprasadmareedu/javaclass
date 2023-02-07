package stringpackage;
//m.satya vara prasad
//210303125059
//22 division
public class String6 {
    //EqualsExample
    public static void main(String args[]) {
        String s1 = "satya";
        String s2 = "satya";
        String s3 = "SATYA";
        String s4 = "python";
        System.out.println(s1.equals(s2));//true because content and case is same
        System.out.println(s1.equals(s3));//false because case is not same
        System.out.println(s1.equals(s4));//false because content is not same
    }
}