import java.util.Objects;

public class Test1 {
    String v;
    String a;
    String c;

    public boolean Equals (Object o){
        if( o==this )return true;
        if (!(o instanceof Test1 ))return false;
        Test1 test1=(Test1) o;
        return Objects.equals( this.v , test1.v ) && Objects.equals(this.a ,test1.a)&& Objects.equals(this.c,test1.c);
    }
}
