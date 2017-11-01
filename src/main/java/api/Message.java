package api;

import javax.annotation.Nonnull;
import javax.annotation.meta.When;

public class Message {

    private final String greetingMessage = "Hello ";

    public String greet(String name) {
        return String.format("%s%s !!", greetingMessage, name);
    }

    /**
     *
     * This method illustrate how we can override default nullability for a method
     */
    @Nonnull(when = When.MAYBE)
    public String greet2(String name) {
        return String.format("%s%s !!", greetingMessage, name);
    }

    /**
     * This method illustrate how we can override default for a parameter
     */
    public String greet3(@Nonnull(when = When.MAYBE) String name) {
        return String.format("%s%s !!", greetingMessage, name);
    }

}
