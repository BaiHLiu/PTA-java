import java.io.IOException;

class CheckException extends IOException{//继承于IOException是有检查的
    public CheckException(){
        super();
    }
    public CheckException(String msg){
        super(msg);
    }
}

class UncheckException extends RuntimeException{//继承于RuntimeException是无检查的
    public UncheckException(){
        super();
    }
    public UncheckException(String msg){
        super(msg);
    }
}

class TestException {
    public TestException(){

    }
    public void func1() {
        throw new CheckException("checked exception");
    }

    public void func2() {
        throw new UncheckException("unchecked exception");
    }

    public void func3() throws CheckException {
        func1();
    }
}


public class Main{
    public static void main(String[] args) {
        TestException test = new TestException();
        try{
            test.func1();
        } catch (CheckException e) {
            System.out.println(e.toString());
        }

        System.out.println("Over");
    }
}