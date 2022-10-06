package Models;

import android.graphics.Bitmap;

import java.util.List;

// This class is the Country model()
public class Country_Model {

    // Declaration of variables ()
    public List<City_Model> cityList;
    public String countryName;
    Bitmap countryFlag;

    // The code below is a constructor that will take two arguments ()
    public Country_Model(String countryName, Bitmap countryFlag) {
        this.countryName = countryName;
        this.countryFlag = countryFlag;
    }

    // The following are setters and getters for the country name and country flag variables  ()
    // Get country name method ()
    public String getCountryName() {
        return countryName;
    }

    // set country name method ()
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    // get country flag method ()
    public Bitmap getCountryFlag() {
        return countryFlag;
    }

    // set country flag method ()
    public void setCountryFlag(Bitmap countryFlag) {
        this.countryFlag = countryFlag;
    }
}
