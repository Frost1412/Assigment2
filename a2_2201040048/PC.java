package Assi2.a2_2201040048;

import utils.NotPossibleException;

public class PC {
    private String model;
    private int year;
    private String manufacturer;
    private Set<String> comps;

    public PC(String model, int year, String manufacturer, Set<String> comps) {
        if(validateModel(model.trim())) {
            this.model = model.trim();
        } else {
            throw new NotPossibleException("Invalid Model");}

        if(validateYear(year)) {
            this.year = year;
        } else {
            throw new NotPossibleException("Invalid Year");
        }
        if(validateManufacturer(manufacturer.trim())) {
            this.manufacturer = manufacturer.trim();

        } else {
            throw new NotPossibleException("Invalid Manufacturer");
        }
        this.comps = comps;


    }

    public boolean validateModel(String model) {
        return !model.isEmpty() && model.length() <= 20;
    }
    public boolean validateYear(int year) {
        return year >= 1984;
    }
    public boolean validateManufacturer(String manufacturer) {
        return !manufacturer.isEmpty() && manufacturer.length() <= 15;
    }




    public boolean setModel(String model) {
        if(validateModel(model.trim())) {
            this.model = model.trim();
            return true;
        } else {
            throw new NotPossibleException("Invalid model");
        }
    }
    //    public void setComps(Set<String> comps) {
//        this.comps = comps;
//    }
    public boolean addComp(String comp) {
        this.comps.insert(comp);
        return true;
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
        return String.format("PC<%s, %d, %s, ",this.getModel(),this.getYear(),this.getManufacturer()) + this.getComps() + ">";

    }



    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        PC pc = (PC) obj;
        return this.year == pc.year
                && this.getModel().equals(pc.getModel())
                && this.getManufacturer().equals(pc.getManufacturer())
                && this.getComps().equals(pc.getComps());
    }
















}
