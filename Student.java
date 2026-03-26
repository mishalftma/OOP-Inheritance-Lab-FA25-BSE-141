class Student extends Person {
    private String regNo;
    private String program;
    private int semester;

    public Student(String name, int age, String gender,
                   String regNo, String program, int semester) {
        super(name, age, gender);
        this.regNo = regNo;
        this.program = program;
        this.semester = semester;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("Reg No: " + regNo);
        System.out.println("Program: " + program);
        System.out.println("Semester: " + semester);
    }

    public void study() {
        System.out.println("Studying...");
    }

    public double calculateFee() {
        return semester * 20000;
    }

    public String toString() {
        return super.toString() + " " + regNo + " " + program;
    }
}