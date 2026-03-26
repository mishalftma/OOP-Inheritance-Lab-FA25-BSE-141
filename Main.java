public class Main {
    public static void main(String[] args) {

        Person p = new Person("Mishal", 20, "Female");
        System.out.println("Person:");
        p.displayInfo();

        System.out.println();

        Student s = new Student("Mishal", 20, "Female",
                "FA25-BSE-141", "BSSE", 4);

        System.out.println("Student:");
        s.displayInfo();
        s.study();
        System.out.println("Fee: " + s.calculateFee());

        System.out.println();

        GraduateStudent g = new GraduateStudent(
                "Mishal", 22, "Female",
                "FA25-BSE-141", "BSSE", 8,
                "AI in Education", "AI"
        );

        System.out.println("Graduate Student:");
        g.displayInfo();
        g.study();
        g.submitThesis();
        System.out.println("Fee: " + g.calculateFee());
    }
}