public class PCReport {
    private static final int COLUMN = 100;
    private static final String LINE = "---------------------------------------------------------------------------------------------------";
    private static final String HEADER = "PC REPORT";
    public String displayReport(PC[] objs) {
        String report = "";
        report += LINE + "\n";
        report += String.format("%" + ((COLUMN - HEADER.length()) / 2 + HEADER.length()) + "s \n", HEADER);
        report += LINE + "\n";

        StringBuilder reportBuilder = new StringBuilder(report);
        for (int i = 0; i < objs.length; i++) {
            String index = String.valueOf(objs[i].getComps().getElements());
            int length = index.length();

            if (length <= 50){
                reportBuilder.append(String.format("%3s %20s %6d %15s %-50s\n", i + 1, objs[i].getModel(),
                        objs[i].getYear(), objs[i].getManufacturer(), objs[i].getComps().getElements()));

            } else {
                String e = index.substring(0, 47) + "...]";
                reportBuilder.append(String.format("%3s %20s %6d %15s %-50s\n", i + 1, objs[i].getModel(),
                        objs[i].getYear(), objs[i].getManufacturer(), objs[i].getComps().getElements()));
            }
        }
        report = reportBuilder.toString();
        report += LINE;

        return report;
    }
}
