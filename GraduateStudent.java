class GraduateStudent extends Student {
    private String thesisTitle;
    private String researchArea;

    public GraduateStudent(String name, int age, String gender,
                           String regNo, String program, int semester,
                           String thesisTitle, String researchArea) {

        super(name, age, gender, regNo, program, semester);
        this.thesisTitle = thesisTitle;
        this.researchArea = researchArea;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Thesis: " + thesisTitle);
        System.out.println("Research Area: " + researchArea);
    }

    public void submitThesis() {
        System.out.println("Thesis submitted");
    }

    public double calculateFee() {
        return super.calculateFee() + 50000;
    }

    public String toString() {
        return super.toString() + " " + thesisTitle;
    }
}