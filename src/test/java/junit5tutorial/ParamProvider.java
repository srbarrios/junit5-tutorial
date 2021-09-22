package junit5tutorial;

import org.junit.jupiter.params.provider.Arguments;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ParamProvider {

    static List<String> sourceString() {
        return Arrays.asList("cat", "parrot", "dog");
    }

    static List<Arguments> sourceList_StringDouble(){
        return Arrays.asList(arguments("cat", 2.0),arguments("parrot", 5.0),arguments("dog", 3.0));
    }
}
