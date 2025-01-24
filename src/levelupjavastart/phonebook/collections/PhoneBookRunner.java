package levelupjavastart.phonebook.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PhoneBookRunner {
    public static void main(String[] args) {
        int callerNumber = 30_000;
        int contactNumber = 10;
        int frequencyThreshold = 20;
        long start = System.currentTimeMillis();

        Map<String, Integer> numberFrequencyMap = new HashMap<>(callerNumber);
        Set<Caller> callerSet = Caller.callersWithContactsBuilder(callerNumber, contactNumber).keySet();
        Iterator<Caller> gatherContactsIterator = callerSet.iterator();


        List<String> allContactNumbers = new ArrayList<>(callerNumber * contactNumber);

        while (gatherContactsIterator.hasNext()) {
            List<String> phoneNumbers = gatherContactsIterator.next().getContacts().stream()
                    .map(Caller::getPhoneNumber)
                    .toList();
            allContactNumbers.addAll(phoneNumbers);
        }
        Iterator<Caller> getOccurencesIterator = callerSet.iterator();
        while (getOccurencesIterator.hasNext()) {
            String currentCallerNumber = getOccurencesIterator.next().getPhoneNumber();
            int frequency = Collections.frequency(allContactNumbers, currentCallerNumber);
            numberFrequencyMap.put(currentCallerNumber, frequency);
        }
        for (Map.Entry<String, Integer> entry : numberFrequencyMap.entrySet()) {
            Integer value = entry.getValue();
            if (value > frequencyThreshold) {
                System.out.println(entry.getKey());
            }
        }
        long finish = System.currentTimeMillis();
        System.out.println("--test--");
        System.out.println(start - finish);
    }
}