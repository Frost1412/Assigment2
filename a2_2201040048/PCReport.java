package a2_2201040048;


public class PCReport {
    public String displayReport(PC[] objs) {
        StringBuilder sb = new StringBuilder();
        String troll = "---------------------------------------------------------------------------------------------------";
        sb.append(troll).append("\n");
        sb.append(String.format("%" + (99 + 13) / 2 + "s%n", "PCPROG REPORT"));
        sb.append(troll).append("\n");
        for (int i = 0; i < objs.length; i++) {
            sb.append(String.format("%3d %s%n", i+1, objs[i].toString()));
        }
        sb.append(troll);
        return sb.toString();
    }
}
