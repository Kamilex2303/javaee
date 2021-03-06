package kstasiak.javaee.kolokwium1.domain;

public class Survey {
    private String from;
    private String to;
    private String frequency;
    private String description;
    private int id;

    public Survey(int id,String from, String to, String frequency, String description) {
    	this.id = id;
        this.from = from;
        this.to = to;
        this.frequency = frequency;
        this.description = description;
    }
    
   public int getId() {
	   return id;
   }
   
   public void setId(int id) {
	   this.id = id;
   }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
