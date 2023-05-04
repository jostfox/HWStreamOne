public class ProjectStudent {

    private String name;
    private Double rate;
    private String type;

    public ProjectStudent(String name, Double rate, String type) {
        this.name = name;
        this.rate = rate;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "ProjectStudent{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", type='" + type + '\'' +
                '}';
    }
}
