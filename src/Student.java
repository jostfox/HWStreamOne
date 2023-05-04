public abstract class Student {

    protected String name;
    protected Double rate;
    protected Boolean finished;
    protected String type;

    public String getName() {
        return name;
    }

    public Student(String name, Double rate, Boolean finished, String type) {
        this.name = name;
        this.rate = rate;
        this.finished = finished;
        this.type = type;
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

    public Boolean getFinished() {
        return finished;
    }

    public void setFinished(Boolean finished) {
        this.finished = finished;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rate=" + rate +
                ", finished=" + finished +
                ", type='" + type + '\'' +
                '}';
    }
}
