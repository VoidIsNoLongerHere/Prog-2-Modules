public class SingletonDemo {
    public static void main(String[] args) {
        ReportHeader reportHeader = ReportHeader.getInstance();
        reportHeader.printHeader(); // Using the new printHeader method

        // Write report
    }
}
