import Generic.SampleGeneric;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class TestSample {

    @Test
    void testSomething() {
        SampleGeneric<String> sampleGeneric = new SampleGeneric<>("gilbert");
        assertThat(sampleGeneric.name)
                .as("name validation")
                .isEqualTo("gilbert");
    }
}
