package Models;

import android.graphics.Bitmap;

// This class is the user landmark model()
public class UserLandmark_Model {

    // Declaration of variables ()
    public String LandmarkName;
    public String Location;
    public Bitmap LandmarkPic;

    // The code below is a constructor that will take three arguments ()
    public UserLandmark_Model(String landmarkName, String location, Bitmap landmarkPic) {
        LandmarkName = landmarkName;
        Location = location;
        LandmarkPic = landmarkPic;
    }

    // The following are setters and getters ()

    public String getLandmarkName() {
        return LandmarkName;
    }

    public void setLandmarkName(String landmarkName) {
        LandmarkName = landmarkName;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public Bitmap getLandmarkPic() {
        return LandmarkPic;
    }

    public void setLandmarkPic(Bitmap landmarkPic) {
        LandmarkPic = landmarkPic;
    }
}
