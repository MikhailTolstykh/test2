public class javaTest {
    public static void main(String[] args) {


        String a =" Aa";
        int ab =10;
        int asd =2;

        javaTest javaTest = new javaTest();
        try {
            javaTest.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }


    }
}
