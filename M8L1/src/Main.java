public class Main {
    public static void main(String[] args) {
        ReportHeader reportHeader = ReportHeader.getInstance();
        ReportFooter reportFooter = ReportFooter.getInstance();
        reportHeader.printHeader(); // Using the new printHeader method

        // Write report

        reportFooter.printHeader();
    }
}