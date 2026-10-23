import java.util.*;

public class Experiment12 {
    public static void main(String[] args) {

        // List
        List<String> students = new ArrayList<>();

        students.add("Arun");
        students.add("Priya");
        students.add("Kumar");
        students.add("Arun");

        System.out.println("Student List: " + students);

        // Set
        Set<String> courses = new HashSet<>();

        courses.add("Java");
        courses.add("Python");
        courses.add("C");
        courses.add("Java");

        System.out.println("Course Set: " + courses);

        // Map
        Map<Integer, String> studentsMap = new HashMap<>();

        studentsMap.put(101, "Arun");
        studentsMap.put(102, "Priya");
        studentsMap.put(103, "Kumar");

        System.out.println("Student Map:");

        for (Map.Entry<Integer, String> entry
                : studentsMap.entrySet()) {
            System.out.println(entry.getKey()
                    + " : " + entry.getValue());
        }

        // Queue
        Queue<String> queue = new LinkedList<>();

        queue.offer("Arun");
        queue.offer("Priya");
        queue.offer("Kumar");

        System.out.println("Queue before processing: " + queue);

        String processed = queue.poll();

        System.out.println("Processed student: " + processed);

        System.out.println("Queue after processing: " + queue);
    }
}