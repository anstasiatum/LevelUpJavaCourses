package levelupjavastart.phonebook.collections;

import java.util.Set;

public enum Operator {
    MEGAFON(java.util.Set.of("902", "904", "035")),
    TELE_2(Set.of("905", "990", "921")),
    BELINE(Set.of("907", "920", "935")),
    MTC(Set.of("931", "991", "924"));

    private final Set<String> code;

    Operator(Set<String> code) {
        this.code = code;
    }

    public Set<String> getCode() {
        return code;
    }
}

