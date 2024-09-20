public class Student {
    String name;
    String regno;
    Date dob;

    Student(String name, String regno, Date dob) {
        this.name = name;
        this.regno = regno;
        this.dob = dob;
    }
        
    @Override
    public String toString() {
        // Include 'dob' in the output
        return String.format("%-20s %s  %s", name, regno, dob);
    }

    @Override
    public boolean equals(Object o) {
        
        Student temp = (Student) o;
        // Comparing the name and regno for equality
        return temp.name.equals(this.name) && temp.regno.equals(this.regno);
    }
}
