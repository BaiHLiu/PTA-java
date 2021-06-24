public class TestException {
    public TestException(){
        
    }
    public void func1() throws CheckException {
        throw new CheckException("checked exception");
    }

    public void func2() {
        throw new UncheckException("unchecked exception");
    }

    public void func3() throws CheckException {
        func1();
    }
}
