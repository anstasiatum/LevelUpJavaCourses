package levelupjavastart.phonebook.arrays;

import java.util.Arrays;

public class PhoneBookRunner {
    public static void main(String[] args) {
        int callerNumber = 30_000;
        int contactNumber = 10;
        int allContactsNumber = callerNumber * contactNumber;
        int frequencyThreshold = 20;
        int contactNumberCounter = 0;
        long start = System.currentTimeMillis();

        CallersWithFrequency[] numberFrequenciesArray = new CallersWithFrequency[callerNumber];
        Caller[] callerArray = Caller.callersWithContactsBuilder(callerNumber, contactNumber);

        String[] allContactNumbers = new String[allContactsNumber];

        for (int callerNumberCounterForArray = 0; callerNumberCounterForArray < callerNumber; callerNumberCounterForArray++) {
            for (int j = 0; j < contactNumber; j++) {
                allContactNumbers[contactNumberCounter] = callerArray[callerNumberCounterForArray].getContacts()[j].getPhoneNumber();
                contactNumberCounter++;
            }
        }

        for (int callerNumberCounterForFrequency = 0; callerNumberCounterForFrequency < callerNumber; callerNumberCounterForFrequency++) {
            String currentCallerPhoneNumber = callerArray[callerNumberCounterForFrequency].getPhoneNumber();
            long numberFrequency = Arrays.stream(allContactNumbers)
                    .filter(c -> c.equals(currentCallerPhoneNumber))
                    .count();
            numberFrequenciesArray[callerNumberCounterForFrequency] = new CallersWithFrequency(currentCallerPhoneNumber, numberFrequency);
        }
        for (int phoneNumberCounter = 0; phoneNumberCounter < callerNumber; phoneNumberCounter++) {
            long frequency = numberFrequenciesArray[phoneNumberCounter].getFrequency();
            if (frequency > frequencyThreshold) {
                System.out.println(numberFrequenciesArray[phoneNumberCounter].getCallerNumber());
            }
        }
        long finish = System.currentTimeMillis();
        System.out.println("--test--");
        System.out.println(start - finish);
    }
}