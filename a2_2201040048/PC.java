package Assi2.a2_2201040048;

import utils.NotPossibleException;

public class PC {
    private String model;
    private int year;
    private String manufacturer;
    private Set<String> comps;

    public PC(String model, int year, String manufacturer, Set<String> comps) {
        if(validateModel(model)) {
            this.model = model;
        } else {
            throw new NotPossibleException("Invalid Model");}

        if(validateYear(year)) {
            this.year = year;
        } else {
            throw new NotPossibleException("Invalid Year");
        }
        if(validateManufacturer(manufacturer)) {
            this.manufacturer = manufacturer;

        } else {
            throw new NotPossibleException("Invalid Manufacturer");
        }
        this.comps = comps;


    }

    public boolean validateModel(String model) {
        return model.length() <= 20;
    }
    public boolean validateYear(int year) {
        return year >= 1984;
    }
    public boolean validateManufacturer(String manufacturer) {
        return manufacturer.length() <= 15;
    }




    public void setModel(String model) {
        if(validateModel(model)) {
            this.model = model;
        } else {
            throw new NotPossibleException("Invalid model");
        }
    }
//    public void setComps(Set<String> comps) {
//        this.comps = comps;
//    }
    public void addComp(String comp) {
        this.comps.insert(comp);
    }
    public void setYear(int year) {
        if(validateYear(year)) {
            this.year = year;
        } else {
            throw new NotPossibleException("Invalid year");
        }
    }
    public void setManufacturer(String manufacturer) {
        if(validateManufacturer(manufacturer)) {
            this.manufacturer = manufacturer;
        } else {
            throw new NotPossibleException("Invalid manufacturer");
        }
    }


    public String getModel() {
        return this.model;
    }
    public int getYear() {
        return this.year;
    }
    public String getManufacturer() {
        return this.manufacturer;
    }
    public Set<String> getComps(){
        return this.comps;
    }


    @Override
    public String toString() {
        StringBuilder components = new StringBuilder();
        if (this.comps.isEmpty()) {
            components.append("[]");
        } else {
            components.append("[");

            for (String comp : getComps().getElements()) {
                components.append(comp).append(", ");

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

        return String.format("%20s %6d %15s %s", this.model, this.year, this.manufacturer, components.toString());

    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        PC pc = (PC) obj;
        return this.year == pc.year
                && this.model.equals(pc.model)
                && this.manufacturer.equals(pc.manufacturer)
                && this.comps.equals(pc.comps);
    }
















}
