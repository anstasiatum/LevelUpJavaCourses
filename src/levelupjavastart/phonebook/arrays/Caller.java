package levelupjavastart.phonebook.arrays;


import java.util.Objects;
import java.util.Random;

public class Caller {
    private static final Random RANDOM = new Random();

    private String fullName;
    private String phoneNumber;
    private Caller[] contacts;
    private Operator operator;
    private ConnectionType connectionType;

    public static Caller callerBuilder() {
        Caller caller = new Caller();

        StringBuilder randomFirstName = new StringBuilder(5);
        StringBuilder randomSecondName = new StringBuilder(9);
        for (int i = 0; i < RANDOM.nextInt(5, 10); i++) {
            int randomLimitedInt = RANDOM.nextInt(97, 123);
            randomFirstName.append((char) randomLimitedInt);
        }
        for (int i = 0; i < RANDOM.nextInt(4, 7); i++) {
            int randomLimitedInt = RANDOM.nextInt(97, 123);
            randomSecondName.append((char) randomLimitedInt);
        }
        caller.fullName = randomFirstName + " " + randomSecondName;

        int phoneNumberPostfix = RANDOM.nextInt(9999999);
        String phoneNumberStringPostfix = String.format("%07d", phoneNumberPostfix);

        caller.operator = Operator.values()[RANDOM.nextInt(0, Operator.values().length - 1)];
        String phoneNumberPrefix = caller.operator.getCodes()[RANDOM.nextInt(0, caller.operator.getCodes().length - 1)];

        caller.phoneNumber = phoneNumberPrefix + phoneNumberStringPostfix;

        caller.connectionType = RANDOM.nextBoolean() ? ConnectionType.LANDLINE : ConnectionType.MOBILE;

        return caller;
    }

    public static Caller[] callersWithContactsBuilder(int callerNumber, int contactNumber) {
        Caller[] callersWithContacts = new Caller[callerNumber];
        Caller[] callers = new Caller[callerNumber];
        for (int i = 0; i < callerNumber; i++) {
            callers[i] = callerBuilder();
        }

        for (int k = 0; k < callerNumber; k++) {
            Caller[] contacts = new Caller[contactNumber];
            int in = 0;
            while (in < contactNumber) {
                Caller contact = callers[RANDOM.nextInt(0, callerNumber - 1)];
                if (contact != callers[k]) {
                    contacts[in] = contact;
                    in++;
                }
            }
            callersWithContacts[k] = callers[k];
            callersWithContacts[k].setContacts(contacts);
        }
        return callersWithContacts;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Caller[] getContacts() {
        return contacts;
    }

    public void setContacts(Caller[] contacts) {
        this.contacts = contacts;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public ConnectionType getConnectionType() {
        return connectionType;
    }

    public void setConnectionType(ConnectionType connectionType) {
        this.connectionType = connectionType;
    }

    @Override
    public String toString() {
        return "Caller{" +
                "fullName='" + fullName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", contacts=" + contacts.length +
                ", operator=" + operator +
                ", connectionType=" + connectionType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Caller caller = (Caller) o;
        return Objects.equals(fullName, caller.fullName) && Objects.equals(phoneNumber, caller.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, phoneNumber);
    }
}
