import java.util.*;

public class CollectionMethods {
    public static void main(String[] args) {
        // Custom ArrayList using StudentObject
        ArrayList <StudentObject> arrayList = new ArrayList<StudentObject>();
        arrayList.add(new StudentObject("Pranav",21,40126404));
        arrayList.add(new StudentObject("John",22, 54545454));
        arrayList.add(new StudentObject("Ramesh",23,45454545));
        arrayList.add(new StudentObject("Sanjay",24,78787878));
        for(StudentObject x : arrayList){
            printObject(x);
            System.out.println();
        }

        //Custom Set using StudentObject
        HashSet <StudentObject> st = new HashSet<StudentObject>();
        st.add(new StudentObject("Pranav",21,40126404));
        st.add(new StudentObject("Pranav",21,40126404));
        st.add(new StudentObject("Ramesh",23,45454545));
        st.add(new StudentObject("Sanjay",24,78787878));
        for(StudentObject x : st){
            printObject(x);
            System.out.println();
            // Repeated Elements not removed as two object with same attributes are different
        }

        // Set using primitive data type
        HashSet<Integer> integerSet = new HashSet<>();
        integerSet.add(21);
        integerSet.add(21);
        integerSet.add(22);
        integerSet.add(23);

        System.out.println(integerSet);
        // Repeated Elements will be removed here as we are working with primitive data types

        // Map using Custom DataType
        HashMap <StudentObject,ArrayList<String>> subjects = new HashMap<>();
        //ArrayLists of subjects
        ArrayList <String> arr1 = new ArrayList<>(),arr2 = new ArrayList<>(),arr3 = new ArrayList<>();
        arr1.add("Maths");arr1.add("Chemistry");
        arr2.add("Maths");arr2.add("Physics");
        arr3.add("Maths");arr3.add("Biology");
        subjects.put(new StudentObject("Pranav",21,40126404),arr1);
        subjects.put(new StudentObject("Ramesh",23,45454545),arr2);
        subjects.put(new StudentObject("Sanjay",24,78787878),arr3);

        for(Map.Entry<StudentObject,ArrayList<String>> mapEntry : subjects.entrySet()){
            System.out.println("Key : " + mapEntry.getKey() + " Value : " + mapEntry.getValue());
        }

        // 7.1
        // Sorting using Comaparable is done in Student.java
        // Collections.sort() can be used to sort Lists using Primitive Data Types

        ArrayList <Integer> unsortedList = new ArrayList<>();
        unsortedList.add(20);unsortedList.add(10);unsortedList.add(40);unsortedList.add(30);
        Collections.sort(unsortedList);

        System.out.println(unsortedList);


    }
    public static void printObject(StudentObject obj){
        System.out.println("Name : " + obj.name);
        System.out.println("Roll No. : " + obj.rollNumber);
        System.out.println("Phone Number : " + obj.phoneNumber);
    }
}
