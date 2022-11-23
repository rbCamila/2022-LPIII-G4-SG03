package pkg11_actividad04;
import java.util.Arrays;
public class Bag<T> {
    private T[] list;
    private int count;   

    public Bag(int n){
        this.list = (T[]) new Object[n];
        this.count = 0;
    }

    public void add(T obj) throws Exception{
        try{
            list[count] = obj;
            count++;
        }catch(Exception a){
            System.out.println("la Bolsa esta llena");
        } 
    }

    @Override
    public String toString() {
        return "Bag{" +
                "list=" + Arrays.toString(list) +
                '}';
    }
}
