package smartPark;

import java.util.HashSet;
import java.util.Set;

public class Array_Checker {

  public static String[] findDuplicates(String[] names) {
    // Create a set to store the names that have already been processed
    Set<String> processedNames = new HashSet<>();

    // Create an array to count the number of times each name appears
    int[] nameCounts = new int[names.length];
    for (int i = 0; i < names.length; i++) {
      if (processedNames.contains(names[i])) {
        continue; // skip over names that have already been processed
      }
      processedNames.add(names[i]);
      nameCounts[i] = 0;
      for (int j = i + 1; j < names.length; j++) {
        if (names[i].equalsIgnoreCase(names[j])) {
          nameCounts[i]++;
          nameCounts[j]--; // decrement the count for the duplicate
        }
      }
    }

    // Create the output array
    String[] output = new String[processedNames.size()];
    int i = 0;
    for (int j = 0; j < names.length; j++) {
      if (nameCounts[j] > 0) {
        if (i < output.length) {
          output[i] = names[j] + " is repeated " + nameCounts[j] + " times";
          i++;
        }
      } else {
        if (nameCounts[j] == 0) {
          if (i < output.length) {
            output[i] = names[j] + " is repeated 0 times";
            i++;
            processedNames.add(names[j]);
            nameCounts[j] = 1;
          }
        }
      }
    }
    return output;
  }

  public static void main(String[] args) {
    String[] names = {"Atyab", "Fatima", "Saeed", "Abdullah", "Malak", "Fatima", "Daniyal", "Atyab", "Abdullah", "Abdullah"};
    String[] duplicates = findDuplicates(names);
    for (String duplicate : duplicates) {
      System.out.println(duplicate);
    }
  }
}

