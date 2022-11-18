package copypastefile;

public class Cars {
    private String name;
    private String model;
    private  Integer year;

    public Cars(String name, String model, Integer year) {
        this.name = name;
        this.model = model;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "Cars{" + "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
