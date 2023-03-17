public class vehicle {
    // behicle number 

    private int vehicleNo;
    private vehicleType vehicleType;

    private parking_spot parking_spot;


    // getter and setters 
    public int getvehicleNo(){
        return vehicleNo;
    }
    public void setvehicleNo(int vehicleNo) {
        this.vehicleNo = vehicleNo;
    }
    public vehicleType getvehicleType () {
        return vehicleType;
    }
    
    public void setvehicleType (vehicleType VehicleType){
        this.vehicleType = VehicleType;
    }
    
    public parking_spot getparking_spot() {
        return parking_spot;
    }
    public void setparkingSpot(parking_spot parking_spot) {
        this.parking_spot = parking_spot;
    }

}
