public class Intern implements Employee{
    private String name;
    private String position;
    private String universityAttended;

    public Intern(String name, String universityAttended) {
        this.name = name;
        this.universityAttended = universityAttended;
        this.position = "Intern";
    }

    @Override
    public void showEmployeeDetails() {
        System.out.printf("Intern: %s Position: %s University Attended: %s%n", name, position, universityAttended);
    }
}
