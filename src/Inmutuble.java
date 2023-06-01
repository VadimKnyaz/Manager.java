public final class Inmutuble {
    private final int a;
    private final int b;


    public Inmutuble(int a,int b){
        this.a=a;
        this.b=b;
    }

    @Override
    public String toString(){
        return a+" "+b;
    }



}
//48. Немутируемая строка. Объяснить, почему класс string является немутируемым.
//КОнтракт иквелс хэшкод с развернутыми примерами