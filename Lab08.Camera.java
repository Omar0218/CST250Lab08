
package lab08;

public class Camera {
    
    private String address;
    private String firstApproach;
    private String secondApproach;
    private String goLiveDate;
    private double latitude;
    private double longitude;

    public Camera(String address, String firstApproach, String secondApproach, String goLiveDate, double latitude, double longitude) {
        this.address = address;
        this.firstApproach = firstApproach;
        this.secondApproach = secondApproach;
        this.goLiveDate = goLiveDate;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFirstApproach() {
        return firstApproach;
    }

    public void setFirstApproach(String firstApproach) {
        this.firstApproach = firstApproach;
    }

    public String getSecondApproach() {
        return secondApproach;
    }

    public void setSecondApproach(String secondApproach) {
        this.secondApproach = secondApproach;
    }

    public String getGoLiveDate() {
        return goLiveDate;
    }

    public void setGoLiveDate(String goLiveDate) {
        this.goLiveDate = goLiveDate;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    
    public void display(){
        System.out.println("Camera is located at: " + this.address);
        System.out.println("Installed on: " + this.goLiveDate);
    }
    
    public double getDistanceTo(double latitude, double longitude){
        double distance;
        
        double a = this.latitude - latitude; //* this.distPerLat(this.latitude);
        double b = this.longitude - longitude; //* this.distPerLng(this.longitude);
        
        distance = Math.sqrt(a*a + b*b);
        
        return distance;
    }
    
//    private double distPerLng(double lng){
//        return 
//    }
//    
//    private double distPerLat(double lat){
//        return 
//    }
    
    
}
