import java.util.*;

public class StringBuildePrac {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);
        // find character
        System.out.println(sb.charAt(0));

        // set character
        sb.setCharAt(0,'P');
        System.out.println(sb);

        // Insert character
        sb.insert(0,'S');
        System.out.println(sb);


        String name = "TonyStark";
        System.out.println(name.substring(0, 4));

        if(new String("Tony") == new String("Tony")) {
            System.out.println("They are the same string");
        } else {
            System.out.println("They are different strings");
        }

    }
}
