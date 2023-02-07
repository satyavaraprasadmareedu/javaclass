package stringpackage;
//m.satya vara prasad
//210303125059
//22 division
public class String19 {
    // SplitExample{
    public static void main(String args[]){
        String s1="java string split method by javatpoint";
        String[] words=s1.split("\\s");

        for(String w:words){
            System.out.println(w);
        }
    }
}