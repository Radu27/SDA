package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        StudentDetails student1 = new StudentDetails("Marian", "Gheorghe", new ArrayList<Double>(Arrays.asList(7.0, 9.0, 10.0)), new ArrayList<Double>(Arrays.asList(8.0, 10.0, 8.0)));
        StudentDetails student2 = new StudentDetails("Alexandra", "Stan", new ArrayList<Double>(Arrays.asList(5.0, 4.0, 6.5)), new ArrayList<Double>(Arrays.asList(6.0, 6.0, 8.0)));
        StudentDetails student3 = new StudentDetails("Ioana", "Ilie", new ArrayList<Double>(Arrays.asList(7.0, 10.0, 9.0)), new ArrayList<Double>(Arrays.asList(7.0, 9.0, 10.0)));
        StudentDetails student4 = new StudentDetails("Ionut", "Pandele", new ArrayList<Double>(Arrays.asList(8.0, 8.0, 8.0)), new ArrayList<Double>(Arrays.asList(7.0, 9.0, 7.0)));
        StudentDetails student5 = new StudentDetails("Silviu", "Nistor", new ArrayList<Double>(Arrays.asList(5.0, 5.0, 6.0)), new ArrayList<Double>(Arrays.asList(7.0, 9.0, 8.0)));
        StudentDetails student6 = new StudentDetails("Ilinca", "Dobre", new ArrayList<Double>(Arrays.asList(7.0, 10.0, 8.0)), new ArrayList<Double>(Arrays.asList(7.0, 9.0, 7.0)));
        StudentDetails student7 = new StudentDetails("Andreea", "Axinte", new ArrayList<Double>(Arrays.asList(4.0, 8.0, 6.0)), new ArrayList<Double>(Arrays.asList(7.0, 6.0, 7.0)));
        StudentDetails student8 = new StudentDetails("Ioana", "Tanase", new ArrayList<Double>(Arrays.asList(7.0, 9.0, 10.0)), new ArrayList<Double>(Arrays.asList(5.0, 8.0, 4.0)));
        StudentDetails student9 = new StudentDetails("Miruna", "Simion", new ArrayList<Double>(Arrays.asList(10.0, 9.0, 10.0)), new ArrayList<Double>(Arrays.asList(9.0, 9.0, 9.0)));
        StudentDetails student10 = new StudentDetails("Alexandru", "Macedon", new ArrayList<Double>(Arrays.asList(7.0, 9.0, 9.0)), new ArrayList<Double>(Arrays.asList(8.0, 9.0, 10.0)));

        HashMap<String, StudentDetails> student = new HashMap<>();

        student.put("5060508200059", student1);
        student.put("6050510410044", student2);
        student.put("6031221320014", student3);
        student.put("5020129040012", student4);
        student.put("5050404170011", student5);
        student.put("6061129160076", student6);
        student.put("6000509330093", student7);
        student.put("6101116400029", student8);
        student.put("6020415140013", student9);
        student.put("5100319240056", student10);

        LinkedHashMap<String, StudentDetails> studentLinked = new LinkedHashMap<>();
        studentLinked.put("5060508200059", student1);
        studentLinked.put("6050510410044", student2);
        studentLinked.put("6031221320014", student3);
        studentLinked.put("5020129040012", student4);
        studentLinked.put("5050404170011", student5);
        studentLinked.put("6061129160076", student6);
        studentLinked.put("6000509330093", student7);
        studentLinked.put("6101116400029", student8);
        studentLinked.put("6020415140013", student9);
        studentLinked.put("5100319240056", student10);

        System.out.println("Introduceti CNP-ul studentului: ");
        Scanner scan = new Scanner(System.in);
        String CNP = scan.nextLine();
        System.out.println(student.get(CNP));

        for (String key : student.keySet()) {
            System.out.println(key);
        }
        System.out.println();
        System.out.println(studentLinked.get(CNP));

        for (String key : studentLinked.keySet()) {
            System.out.println(key);
        }
        scan.close();
    }
}