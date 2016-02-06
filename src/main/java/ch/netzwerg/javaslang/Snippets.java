package ch.netzwerg.javaslang;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("MismatchedQueryAndUpdateOfCollection")
public class Snippets {

    private static final String CONSTANT = "foo";
    private final List<String> state = new ArrayList<String>();
    private final List<String> moreState = new ArrayList<String>();

    // tag::input-output[]
    List<String> doSomething(List<String> list) {
        if (this.state.isEmpty() || list.isEmpty()) {
            throw new IllegalStateException("Ouch...");
        }

        list.add(this.state.get(0));
        list.add(CONSTANT);

        this.moreState.addAll(list);
        OtherClass.mutableStaticField = list;

        return new ArrayList<String>(list);
    }
    // end::input-output[]

    private static class OtherClass {
        static List<String> mutableStaticField;
    }

}
