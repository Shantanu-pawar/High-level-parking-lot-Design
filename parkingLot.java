/*
description : 
a. parking lot
    parking spots 
        truck
        car
        bikes 

    situation : max no of spots available: 

    functionality :
        park vehicle
        unpark vehicle

 */
import java.util.*;

public class parkingLot{
  
        List<compactSpot> compactSpotList = new ArrayList<>();
        List <largeSpot > largeSpotsList = new ArrayList<>();
        List <bikeSpot> bikeSpotsList = new ArrayList <>();

        // expecting here how many small spot for small medium and large they have 
        int freeCompactSpot;
        int freeLargeCompactSpot;
        int freeBikeSpot;

        public parkingLot (int freeCompactSpot, 
        int freeLargeCompactSpot, int freeBikeSpot) {

            this.freeCompactSpot = freeCompactSpot;
            this.freeBikeSpot = freeBikeSpot;
            this.freeLargeCompactSpot = freeLargeCompactSpot;

        }

        // parkingvehicle

        public void parkingvehicle(vehicle vehicle){
            
            // so when you park vehicle you reduce the freespots 
            // and after unparked it you increase it

            System.out.println("we are about parked your vehicle :");

            if(vehicle.getvehicleType().equals(vehicleType.TRUCK)) {
                if(freeLargeCompactSpot > 0) {
                    parkYourLargeVehicle();
                }
                else {
                    System.out.println("sorry, all large slot's are full.!");
                }

            }

            else if(vehicle.getvehicleType().equals(vehicleType.CAR)) {  
                if(freeCompactSpot > 0)  parkYourCompactVehicle();
                else if(freeLargeCompactSpot > 0) parkYourLargeVehicle();
                
                else 
                    System.out.println("sorry,neither large or comact spots available.!");
            }
            
            else if(vehicle.getvehicleType().equals(vehicleType.BIKE)) { 

                if(freeBikeSpot > 0)  parkYourbike();
                else if(freeCompactSpot > 0)  parkYourCompactVehicle();
                else if(freeLargeCompactSpot > 0) parkYourLargeVehicle();
                
                else {
                    System.out.println("sorry, neigher large or compact slot are full.!");
                }

             }   
        }

         void parkYourLargeVehicle(vehicle vehicle) {
            largeSpot largeSpot = new largeSpot(parking_SpotType.valueOf());
            largeSpot.setFree(false);
            largeSpot.setvehicle(vehicle);
            vehicle.setparkingSpot(largeSpot);

            largeSpotsList.add(largeSpot);

            // everything is fine just print it
            System.out.println("we have successfully parked your" + vehicle.getvehicleType() +"vechcle.");

            freelargespot--;
        }

         void parkYourbike() {
            bikeSpot bikeSpot = new bikeSpot(parking_SpotType.BIKE);
            bikeSpot.setFree(false);
            bikeSpot.setvehicle(vehicle);
            vehicle.setparkingSpot(bikeSpot);

            bikeSpotsList.add(bikeSpot);

            // for bike spots 
            System.out.println("we have successfully parked your" + vehicle.getvehicleType() +"vechcle.");
            
            freeBikeSpot--;
        }

         void parkYourCompactVehicle() {
            compactSpot compactSpot = new compactSpot(parking_SpotType.car);
            compactSpot.setFree(false);
            compactSpot.setvehicle(vehicle);
            vehicle.setparkingSpot(compactSpot);

            compactSpotList.add(compactSpot);

            System.out.println("we have successfully parked your" + vehicle.getvehicleType() +"vechcle.");
            
            freeCompactSpot--;
        }
    
    // unparking vehicle
    public void unparkvehicle(vehicle vehicle) {
         System.out.println("we about to unpark your vehicle");
         parking_Spot parking_Spot = vehicle.getparking_spot();

         parking_Spot.setFree(true);

         if(vehicle.getvehicleType().equals(vehicleType.TRUCK)) {
            if(largeSpotsList.remove(vehicle)) {
                System.out.println("successfully removed vehicle.");
                freeLargeCompactSpot--;
            }
            else System.out.println("you don't have your vechicle parked at this parking lot");
         }
         
         if(vehicle.getvehicleType().equals(vehicleType.CAR)) {
            if(compactSpotList.remove(vehicle)) {
                System.out.println("successfully removed vehicle.");
                freeCompactSpot--;
            }
            else System.out.println("you don't have your vechicle parked at this parking lot");
         }

         
         if(vehicle.getvehicleType().equals(vehicleType.BIKE)) {
            if(bikeSpotsList.remove(vehicle)) {
                System.out.println("successfully removed vehicle.");
                freeBikeSpot--;
            }
            else System.out.println("you don't have your vechicle parked at this parking lot");
         }

    }
    
}
