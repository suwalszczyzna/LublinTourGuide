package pl.com.suwala.lublintourguide;

public class Attraction {

    private String name;
    private String description;
    private String adress;
    private String priceLevel;
    private String phoneNumber;
    private String url;
    private int picture;

    public Attraction(String name, String description, String adress, String phoneNumber, String priceLevel, int picture) {
        this.name = name;
        this.description = description;
        this.adress = adress;
        this.phoneNumber = phoneNumber;
        this.priceLevel = priceLevel;
        this.picture = picture;
        this.url = "http://google.com/";
    }

    public Attraction(String name, String description, String adress, String phoneNumber, String priceLevel, String url, int picture) {
        this.name = name;
        this.description = description;
        this.adress = adress;
        this.priceLevel = priceLevel;
        this.phoneNumber = phoneNumber;
        this.url = url;
        this.picture = picture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPriceLevel() {
        return priceLevel;
    }

    public void setPriceLevel(String priceLevel) {
        this.priceLevel = priceLevel;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture(int picture) {
        this.picture = picture;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}

