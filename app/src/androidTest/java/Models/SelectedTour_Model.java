package Models;

import android.graphics.Bitmap;

// This class is the Selected Tour model()
public class SelectedTour_Model {

    // Declaration of variables ()
    public Bitmap TourLogo;
    public String TourName;

    // The code below is a constructor that will take two arguments ()
    public SelectedTour_Model(Bitmap tourLogo, String tourName) {
        TourLogo = tourLogo;
        TourName = tourName;
    }

    // The following are setters and getters for the tour name and tour logo variables  ()
    // get city tour logo method ()
    public Bitmap getTourLogo() {
        return TourLogo;
    }

    // set tour logo method ()
    public void setTourLogo(Bitmap tourLogo) {
        TourLogo = tourLogo;
    }

    // get tour name method ()
    public String getTourName() {
        return TourName;
    }

    // set tour name method ()
    public void setTourName(String tourName) {
        TourName = tourName;
    }
}
