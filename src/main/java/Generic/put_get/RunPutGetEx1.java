package Generic.put_get;

import java.util.ArrayList;
import java.util.List;

public class RunPutGetEx1 {
    public static void main(String[] args) {
        List<? super Fruit> fruitList = new ArrayList<Food>();

        // 리스트에 객체 추가
        // fruitList.add(new Food());
        fruitList.add(new Fruit("fruit"));
        fruitList.add(new Apple("apple"));
        fruitList.add(new Banana("banana"));
        fruitList.add(new Kiwi("kiwi"));

        // 리스트의 요소 조회
        // Object secondElement = fruitList.get(1);
        // Apple apple = (Apple) secondElement;
        String name = null;
        if (!fruitList.isEmpty()) {
            for (Object fruit : fruitList) {
                switch (fruit.getClass().getName()) {
                    case "Generic.put_get.Apple" -> {
                        name = "apple";
                    }
                    case "Generic.put_get.Banana" -> {
                        name = "banana";
                    }
                    case "Generic.put_get.Kiwi" -> {
                        name = "kiwi";
                    }
                }
                System.out.println(name);
            }
        }
    }
}



