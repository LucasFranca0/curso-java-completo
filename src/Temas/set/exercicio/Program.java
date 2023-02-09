package Temas.set.exercicio;

import Temas.set.exercicio.entities.Student;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Set<Student> a = new HashSet<>();
        Set<Student> b = new HashSet<>();
        Set<Student> c = new HashSet<>();
        System.out.print("How many students for course A? ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int courseA = scan.nextInt();
            a.add(new Student(courseA));
        }
        System.out.print("How many students for course B? ");
        n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int courseB = scan.nextInt();
            b.add(new Student(courseB));
        }
        System.out.print("How many students for course C? ");
        n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int courseC = scan.nextInt();
            c.add(new Student(courseC));
        }

        Set<Student> total = new HashSet<Student>(a);
        total.addAll(b);
        total.addAll(c);

        System.out.println("Total students: " + total.size());
    }
}
