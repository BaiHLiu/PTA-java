public class UncheckException extends RuntimeException{//继承于RuntimeException是无检查的
    public UncheckException(){
        super();
    }
    public UncheckException(String msg){
        super(msg);
    }
}
