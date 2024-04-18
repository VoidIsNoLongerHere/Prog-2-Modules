public class ReportHeader {
    private static volatile ReportHeader instance;
    private String header;

    // Private constructor
    private ReportHeader() {
        // Code to initialize the header
        this.header = "ABC Programming Company\nSan Antonio Office\n210-837-1234\n\n";
    }

    // Public method to get instance
    public static ReportHeader getInstance() {
        if (instance == null) {
            synchronized (ReportHeader.class) {
                if (instance == null) {
                    instance = new ReportHeader();
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