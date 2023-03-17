public class parking_spot {
 
    // we need 3 types of parking spots 
    //  compact
    // large
    // bike

    // the things we know they are finite in number so we use enum for it
  

    private parking_SpotType type;
    private vehicle vehicle;
    private boolean free;


    // for deciding type of spot ?
    public parking_spot(parking_SpotType parkingSpot_type) {
    }

    // public parking
    // getters and setters
    public parking_SpotType getType() {
        return type;
    }

    public void setType(parking_SpotType type) {
        this.type = type;
    }

    public vehicle getVehicle() {
        return vehicle;
    }

    public void setvehicle(vehicle Vehicle) {
        this.vehicle  = Vehicle;
    }

    public boolean getfree(){
        return free;
    }

    public void setFree(boolean free) {
        this.free = free;
    }

}
