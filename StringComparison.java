public class StringComparison {
    public static void main(String args[]){

        String sentence = "My name is Darshana";
        String name = sentence.substring(11,18);
        System.out.println(name);

        String studentName1 = "Tony";
        String studentName2 = "Tony";

        if(studentName1 == studentName2 )
            System.out.println("String is same");
        else
            System.out.println("String is different");

    }

}
