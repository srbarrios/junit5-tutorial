package junit5tutorial;

import org.junit.jupiter.params.provider.Arguments;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ParamProvider {

    static List<String> sourceString() {
        return Arrays.asList("tomato", "carrot", "cabbage");
    }

    static List<Arguments> sourceList_StringDouble(){
        return Arrays.asList(arguments("tomato", 2.0),arguments("carrot", 5.0),arguments("cabbage", 3.0));
    }
}
