package junit5tutorial;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class HamcrestAssertionsTests {

    @Test
    void assertThatTest(){
        Map<String, Integer> map = new HashMap<>();
        map.put("first", 1);
        map.put("second", 2);
        map.put("third", 3);
        assertThat(map, Matchers.hasKey("second"));
        assertThat(map, Matchers.hasValue(2));
    }

    @Test
    void assertForListTest(){
        List<Integer> list = Arrays.asList(1,5,6);
        assertThat(list, Matchers.hasItem(1));
        assertThat(list, Matchers.allOf(Matchers.hasItem(1), Matchers.hasItem(2)));
    }

    @Test
    void assertOthersTest(){
        List<Integer> list = Arrays.asList(1,5,6);
        assertThat(list, Matchers.isA(List.class));
        assertThat(list, Matchers.hasSize(2));
    }
}
