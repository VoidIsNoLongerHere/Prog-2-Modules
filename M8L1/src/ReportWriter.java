public class ReportWriter {
    private ReportHeader header;
    private ReportFooter footer;

    public ReportWriter(){
        this.footer = ReportFooter.getInstance();
        this.header = ReportHeader.getInstance();
    }

    public void printReport(String body){
        header.printHeader();
        System.out.println(body);
        footer.printFooter();


    }
}
