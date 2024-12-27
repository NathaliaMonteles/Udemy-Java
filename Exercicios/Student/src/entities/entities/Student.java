package entities;

public class Student {
    public String name;
    public double firstGrade;
    public double secondGrade;
    public double thirdGrade;

    public double average() {
        return (firstGrade + secondGrade + thirdGrade);
    }

    @Override
    public String toString() {
        return name + ", Average Grade: " + String.format("%.2f", average());
    }

    public double missing() {
        return Math.abs(average() - 60.0);
    }
}

