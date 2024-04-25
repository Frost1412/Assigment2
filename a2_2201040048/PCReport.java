package Assi2.a2_2201040048;


public class PCReport {
    public String displayReport(PC[] objs) {

        StringBuilder sb = new StringBuilder();
        String troll = "---------------------------------------------------------------------------------------------------";
        sb.append(troll).append("\n");
        sb.append(String.format("%" + (99 + 13) / 2 + "s%n", "PCPROG REPORT"));
        sb.append(troll).append("\n");
        for (int i = 0; i < objs.length; i++) {
            //create a string of components that follow the format [comp1, com2, com3, com4]
            StringBuilder components = new StringBuilder();
            if (objs[i].getComps().isEmpty()) {
                components.append("[]");
            } else {
                components.append("[");

                for (int j = 0 ; j < objs[i].getComps().size();j++) {
                    String comp = objs[i].getComps().getElements().get(j);
                    components.append(comp);
                    if(j != objs[i].getComps().size()-1){
                        components.append(", ");
                    }

                    if (components.length() > 47) {
                        components = new StringBuilder(components.substring(0, 47));
                        components.append("...]");
                        break;
                    }
                }
                if (components.length() <= 47) {
                    components.append("]");

                }
            }
            sb.append(String.format("%3d %20s %6d %15s %s %n", i+1, objs[i].getModel(), objs[i].getYear(),objs[i].getManufacturer(),components));
        }
        sb.append(troll);
        return sb.toString();
    }
}