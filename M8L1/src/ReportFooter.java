public class ReportFooter {
    private static volatile ReportFooter instance;
    private String header;

    // Private constructor
    private ReportFooter() {
        // Code to initialize the header
        this.header = "Stuff";
    }

    // Public method to get instance
    public static ReportFooter getInstance() {
        if (instance == null) {
            synchronized (ReportFooter.class) {
                if (instance == null) {
                    instance = new ReportFooter();
                }
            }
        }
        return instance;
    }

    public String getHeader() {
        return this.header;
    }

    // New printHeader method
    public void printHeader() {
        System.out.println(this.header);
    }
}