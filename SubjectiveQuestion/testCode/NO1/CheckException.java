import java.io.IOException;

public class CheckException extends IOException{//继承于IOException是有检查的
    public CheckException(){
        super();
    }
    public CheckException(String msg){
        super(msg);
    }
}
