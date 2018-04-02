package pl.com.suwala.lublintourguide;

public class Museum {

    private String museumName;
    private String museumHours;
    private String museumAddress;
    private String museumPhone;
    private int museumPicture;

    public Museum(String museumName, String museumHours, String museumAddress, String museumPhone, int museumPicture) {
        this.museumName = museumName;
        this.museumHours = museumHours;
        this.museumAddress = museumAddress;
        this.museumPhone = museumPhone;
        this.museumPicture = museumPicture;
    }

    public String getMuseumName() {
        return museumName;
    }

    public void setMuseumName(String museumName) {
        this.museumName = museumName;
    }

    public String getMuseumHours() {
        return museumHours;
    }

    public void setMuseumHours(String museumHours) {
        this.museumHours = museumHours;
    }

    public String getMuseumAddress() {
        return museumAddress;
    }

    public void setMuseumAddress(String museumAddress) {
        this.museumAddress = museumAddress;
    }

    public String getMuseumPhone() {
        return museumPhone;
    }

    public void setMuseumPhone(String museumPhone) {
        this.museumPhone = museumPhone;
    }

    public int getMuseumPicture() {
        return museumPicture;
    }

    public void setMuseumPicture(int museumPicture) {
        this.museumPicture = museumPicture;
    }
}
