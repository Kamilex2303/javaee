package pl.kstasiak.domain;

public class RustyNail {
    private String producer;
    private String dateOfProduction;
    private double howLong;
    private String comments;

    public RustyNail(String producer, String dateOfProduction, double howLong, String comments) {
        this.producer = producer;
        this.dateOfProduction = dateOfProduction;
        this.howLong = howLong;
        this.comments = comments;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String name) {
        this.producer = name;
    }

    public String getDateOfProduction() {
        return dateOfProduction;
    }

    public void setDateOfProduction(String from) {
        this.dateOfProduction = from;
    }

    public double getHowLong() {
        return howLong;
    }

    public void setHowLong(double howLong) {
        this.howLong = howLong;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
