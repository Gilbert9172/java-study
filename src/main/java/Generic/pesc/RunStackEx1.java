package Generic.pesc;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class RunStackEx1 {

    public static void main(String[] args) {
        StackEx1<Number> numberStack = new StackEx1<>();
        List<Integer> integers = new ArrayList<>(List.of(1,2,3,4));
        numberStack.pushAll(integers);
        Collection<Object> objects = new ArrayList<>();
        numberStack.popAll(objects);
    }
}
