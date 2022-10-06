package Models;

// This class is the City model()
public class City_Model {

    // Declaration of variables ()
    public String CityName;
    public String CountryName;

    // The code below is a constructor that will take two arguments ()
    public City_Model(String CityName, String countryName) {
        this.CityName = CityName;
        CountryName = countryName;
    }

    // The following are setters and getters for the city name and country name variables  ()
    // Get city name method ()
    public String getCityName() {
        return CityName;
    }

    // set city name method ()
    public void setCityName(String cityName) {
        CityName = cityName;
    }

    // Get country name method ()
    public String getCountryName() {
        return CountryName;
    }

    // set country name method ()
    public void setCountryName(String countryName) {
        CountryName = countryName;
    }
}
