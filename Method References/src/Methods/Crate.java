package Methods;

public class Crate<T>{
    private  T Contents;
    public T emptyCrate(){
        return Contents;
    }

    public T packCrate(T Contents){
        return this.Contents = Contents;

    }
}
