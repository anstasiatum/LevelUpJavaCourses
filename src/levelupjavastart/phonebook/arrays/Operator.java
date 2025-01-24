package levelupjavastart.phonebook.arrays;

public enum Operator {
    MEGAFON(new String[]{"902", "904", "035"}),
    TELE_2(new String[]{"905", "990", "921"}),
    BELINE(new String[]{"907", "920", "935"}),
    MTC(new String[]{"931", "991", "924"});

    private final String[] code;

    Operator(String[] code) {
        this.code = code;
    }

    public String[] getCodes() {
        return code;
    }
}

