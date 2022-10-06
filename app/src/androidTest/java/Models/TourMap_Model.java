package Models;

// This class is the tour map model()
public class TourMap_Model {

    // Declaration of variables ()
    public String Startpoint;
    public String EndPoint;
    public String Markers;
    public Double Distance;

    // The code below is a constructor that will take four arguments ()
    public TourMap_Model(String startpoint, String endPoint, String markers, Double distance) {
        Startpoint = startpoint;
        EndPoint = endPoint;
        Markers = markers;
        Distance = distance;
    }

    // The following are setters and getters ()

    public String getStartpoint() {
        return Startpoint;
    }

    public void setStartpoint(String startpoint) {
        Startpoint = startpoint;
    }

    public String getEndPoint() {
        return EndPoint;
    }

    public void setEndPoint(String endPoint) {
        EndPoint = endPoint;
    }

    public String getMarkers() {
        return Markers;
    }

    public void setMarkers(String markers) {
        Markers = markers;
    }

    public Double getDistance() {
        return Distance;
    }

    public void setDistance(Double distance) {
        Distance = distance;
    }
}
