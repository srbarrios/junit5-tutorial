package junit5tutorial;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.DisabledIf;
import org.junit.jupiter.api.condition.DisabledIfSystemProperty;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.OS;

import java.sql.Date;
import java.time.DayOfWeek;
import java.time.LocalDateTime;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class DisableTests {

    @Test
    @Disabled(value = "Disabled for demo of @Disabled annotation")
    void firstMethod(){
        System.out.println("This is the first test method");
    }

    @Test
    @DisabledOnOs(value = OS.LINUX, disabledReason = "Disabled for Linux OS")
    void secondMethod(){
        System.out.println("This is the second test method");
    }

    @Test
    @DisabledIfSystemProperty(named = "env", matches = "production", disabledReason = "Disabled by the value on a property")
    void thirdMethod(){
        System.out.println("This is the third test method");
    }

    @Test
    @DisabledIf(value = "provider", disabledReason = "Disabled by the result of method provider")
    void fourthMethod(){
        System.out.println("This is the third test method");
    }

    boolean provider(){
        return LocalDateTime.now().getDayOfWeek().equals(DayOfWeek.WEDNESDAY);
    }
}
