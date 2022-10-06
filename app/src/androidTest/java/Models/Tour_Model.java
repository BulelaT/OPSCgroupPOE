package Models;

import android.graphics.Bitmap;

// This class is the Tour model()
public class Tour_Model {

    // Declaration of variables ()
    public Bitmap TourImages;
    public String tourName;
    public String tourAddress;

    // The code below is a constructor that will take three arguments ()
    public Tour_Model(Bitmap tourImages, String tourName, String tourAddress) {
        TourImages = tourImages;
        this.tourName = tourName;
        this.tourAddress = tourAddress;
    }

    // The following are setters and getters for the tour name and tour address and tour image variables  ()
    // get  tour image method ()
    public Bitmap getTourImages() {
        return TourImages;
    }

    // set  tour image method ()
    public void setTourImages(Bitmap tourImages) {
        TourImages = tourImages;
    }

    // get  tour name method ()
    public String getTourName() {
        return tourName;
    }

    // set  tour name method ()
    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    // get tour address method ()
    public String getTourAddress() {
        return tourAddress;
    }

    // set tour address method ()
    public void setTourAddress(String tourAddress) {
        this.tourAddress = tourAddress;
    }
}
