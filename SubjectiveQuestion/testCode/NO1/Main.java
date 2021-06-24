public class Main{
    public static void main(String[] args) {
        TestException test = new TestException();
        try{
            test.func3();
        } catch (CheckException e) {
            System.out.println(e.toString());
        }

        System.out.println("Over");
    }
}