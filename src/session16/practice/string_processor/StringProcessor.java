package session16.practice.string_processor;
@FunctionalInterface
public interface StringProcessor {

    String process(String imput);

    default StringProcessor andThen(StringProcessor after) {
        return input -> after.process(this.process(input)); }
}
