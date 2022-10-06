package Models;

// This class is the settings model()
public class Settings_Model {

    // Declaration of variables ()
    public Double Measurement;
    public String TypeOfLandmark;

    // The code below is a constructor that will take two arguments ()
    public Settings_Model(Double measurement, String typeOfLandmark) {
        Measurement = measurement;
        TypeOfLandmark = typeOfLandmark;
    }

    // The following are setters and getters ()

    public Double getMeasurement() {
        return Measurement;
    }

    public void setMeasurement(Double measurement) {
        Measurement = measurement;
    }

    public String getTypeOfLandmark() {
        return TypeOfLandmark;
    }

    public void setTypeOfLandmark(String typeOfLandmark) {
        TypeOfLandmark = typeOfLandmark;
    }
}
