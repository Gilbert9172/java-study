package Generic.put_get;

import java.util.ArrayList;
import java.util.List;

public class RunPutGetEx2 {
    public static void main(String[] args) {
        List<? extends Fruit> fruitList = new ArrayList<>();
        //fruitList.add(new Kiwi("kiwi"));
        fruitList.add(null);
    }


}
