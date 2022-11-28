package pkg11_ejercicio02;
import java.util.ArrayList;
public class Dictionary <K, V> {
    private final ArrayList<OrderedPair> lista;
    public Dictionary(){
        this.lista = new ArrayList<>();
    }

    public void add(K key, V value){
        OrderedPair<K, V> obj = new OrderedPair<K,V>(key,value);
        lista.add(obj);
    }

    public boolean delete(K key){
        for(int i=0; i<lista.size() ; i++){
            if(key.equals(lista.get(i).getKey())){
                lista.remove(lista.get(i));
                return true;
            }
        }
        return false;
    }

    public Object getValue(K key) throws ObjectNoExist{
        try {
            for(int i=0; i<lista.size() ; i++){
                if(key.equals(lista.get(i).getKey()))
                    return lista.get(i).getValue();
            }
        } catch (Exception e) {
            throw new ObjectNoExist("El Objecto no existe");
        }
        return null;
    }

    @Override
    public String toString() {
        return "  >>>Contenido Diccionario <<<\n"+                
                "\ndiccionario=" + lista +
                '}';
    }
}
