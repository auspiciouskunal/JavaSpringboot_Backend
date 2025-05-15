public class PlanePolymorphism {
    public static void main(String[] args){
        CargoPlane cargoPlane = new CargoPlane();
        PassengerPlane passengerPlane = new PassengerPlane();
        FighterPlane fighterPlane = new FighterPlane();

        Airport airport = new Airport();
        airport.permit(cargoPlane);
        airport.permit(passengerPlane);
        airport.permit(fighterPlane);

    }
}
