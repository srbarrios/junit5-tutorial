package junit5tutorial;

import listeners.Listener;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

@ExtendWith(Listener.class)
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class WithListenerTests {

    @Test
    void successfulTest(){
    }

    @Test
    void failedTest(){
        assertTrue(false);
    }

    @Test
    @Disabled
    void disabledTest(){
    }

    @Test
    void abortedTest() {
        assumeTrue(false);
    }
}
