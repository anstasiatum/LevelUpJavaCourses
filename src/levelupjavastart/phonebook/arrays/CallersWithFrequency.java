package levelupjavastart.phonebook.arrays;

public class CallersWithFrequency {
    private String callerNumber;
    private long frequency;

    public String getCallerNumber() {
        return callerNumber;
    }

    public void setCallerNumber(String callerNumber) {
        this.callerNumber = callerNumber;
    }

    public long getFrequency() {
        return frequency;
    }

    public void setFrequency(long frequency) {
        this.frequency = frequency;
    }

    public CallersWithFrequency(String callerNumber, long frequency) {
        this.callerNumber = callerNumber;
        this.frequency = frequency;
    }
}
