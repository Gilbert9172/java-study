package Generic;

public class SampleGeneric<T> {
    public T name;

    public SampleGeneric() {

    }

    public SampleGeneric(T name) {
        this.name = name;
    }

    public static void main(String[] args) {
        SampleGeneric<String> sampleString = new SampleGeneric<>("gilbert");
        System.out.println(sampleString.name);
    }
}
