
import java.util.*;

/**
 *
 * @author dawoud
 */
public class MyHashTable {

    // ATTRIBUTES
   
    public ArrayList<EmployeeInfo>[] buckets;
    private int numInHashTable;

    // CONSTRUCTOR
    public MyHashTable(int howManyBuckets) {
        // Instantiate an array to have an ArrayList as each element of the array.
        buckets = new ArrayList[howManyBuckets];

        // For each element in the array, instantiate its ArrayList.
        for (int i = 0; i < howManyBuckets; i++) {
            buckets[i] = new ArrayList<EmployeeInfo>();  
        }
        numInHashTable = 0;
    }

    // METHODS
    public void MakeBuckets(int numOfBuckets) {
        buckets = new ArrayList[numOfBuckets];
        for (int i = 0; i < numOfBuckets; i++) {
            buckets[i] = new ArrayList<EmployeeInfo>();
        }
    }

    public int CalculateBucket(int studentNumber) {
        return studentNumber % buckets.length;
    }

    public void AddToHashTable(EmployeeInfo studentToAdd) {
        int bucketToGo = CalculateBucket(studentToAdd.getEmpNum());

        if (buckets[bucketToGo].contains(studentToAdd)) {
            return;
        }
        buckets[bucketToGo].add(studentToAdd);
    }

    public EmployeeInfo removeFromTable(int studentNumber) {
        int bucketToGo = CalculateBucket(studentNumber);

        for (EmployeeInfo student : buckets[bucketToGo]) {
            if (student.getEmpNum() == studentNumber) {
                buckets[bucketToGo].remove(student);
                return student;
            }
        }
        return null;
    }

    public EmployeeInfo getFromTable(int studentNumber) {
        int bucketToGo = CalculateBucket(studentNumber);

        for (EmployeeInfo student : buckets[bucketToGo]) {
            if (student.getEmpNum() == studentNumber) {
                return student;
            }
        }
        return null;
    }

    public boolean isInTable(int studentNumber) {
        int bucketToGo = CalculateBucket(studentNumber);

        for (EmployeeInfo student : buckets[bucketToGo]) {
            if (student.getEmpNum() == studentNumber) {
                return true;
            }
        }
        return false;
    }

    public void displayTable() {
        for (int i = 0; i < buckets.length; i++) {
            System.out.print("Bucket " + i + ": ");
            if (buckets[i].size() == 0) {
                System.out.println("Empty");
            }
            for (int j = 0; j < buckets[i].size(); j++) {
                System.out.print(buckets[i].get(j).getEmpNum() + " ");
            }
            System.out.println();
        }
    }

    public int numOfEmployees() {
        int numEmployees = 0;
        for (int i = 0; i < buckets.length; i++) {
            for (int j = 0; j < buckets[i].size(); j++) {
                numEmployees++;
            }
        }
        return numEmployees;
    }

    public boolean addEmployee(EmployeeInfo theEmployee) {
        if (theEmployee == null) {
            return (false);
        } else {
            int targetBucket = CalculateBucket(theEmployee.getEmpNum());
            // Add the employee to the ArrayList for the targetBucket.
            boolean addStatus = buckets[targetBucket].add(theEmployee);
            numInHashTable++;
            return addStatus;
        }
    }
}
