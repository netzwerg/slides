package ch.netzwerg.javaslang;

import java.util.ArrayList;
import java.util.List;

public class Snippets {

    private static final String CONSTANT = "foo";
    private final List<String> state = new ArrayList<String>();

    // tag::input-output[]
    List<String> doSomething(List<String> list) {
        if (this.state.isEmpty()) {
            throw new IllegalStateException("Ouch...");
        }
        list.add(this.state.get(0));
        list.add(CONSTANT);
        return new ArrayList<String>(list);
    }
    // end::input-output[]

}
