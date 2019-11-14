//Student Class

import java.util.Collections;

class L15 {

    static class Student{
        private int regNo, marks[], total;
        private String name;

        Student(int regNo, String name, int[] marks) {
            this.regNo = regNo;
            this.name = name;
            this.marks = marks;
            for(int i : marks)
                total += i;
        }

        void printTotal(){
            System.out.println(name + " : " + total + "/500");
        }
    }

    public static void main(String args[]){
        Student students[] = {
                new Student(1, "Adam", new int[] {99, 75, 80, 70, 66})
                , new Student(2, "Bob", new int[] {70, 70, 66, 80, 85})
                , new Student(3, "Charles", new int[] {70, 70, 75, 80, 70})
                , new Student(4, "Dennis", new int[] {75, 80, 70, 80, 85})
                , new Student(5, "El", new int[] {70, 80, 85, 80, 85})
        };
        for(Student student : students)
            student.printTotal();
    }
}