package listeners;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.api.extension.TestWatcher;

import java.util.Optional;

public class Listener implements TestWatcher {
    @Override
    public void testDisabled(ExtensionContext context, Optional<String> reason) {
        System.out.println("---------------------------------------------");
        System.out.println("This test was disabled: " + context.getTestMethod().get().getName() + " with reason: " + reason.get());
    }

    @Override
    public void testSuccessful(ExtensionContext context) {
        System.out.println("---------------------------------------------");
        System.out.println("This test passed: " + context.getTestMethod().get().getName());
    }

    @Override
    public void testAborted(ExtensionContext context, Throwable cause) {
        System.out.println("---------------------------------------------");
        System.out.println("This test was aborted: " + context.getTestMethod().get().getName() + " due to " + cause.getMessage());
    }

    @Override
    public void testFailed(ExtensionContext context, Throwable cause) {
        System.out.println("---------------------------------------------");
        System.out.println("This test failed: " + context.getTestMethod().get().getName() + " due to: " + cause.getMessage());
    }
}
