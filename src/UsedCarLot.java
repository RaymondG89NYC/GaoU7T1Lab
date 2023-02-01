import java.util.ArrayList;
public class UsedCarLot {
    private ArrayList<Car> inventory = new ArrayList<Car>();
    public UsedCarLot(){
       inventory = new ArrayList<Car>();
    }
    public ArrayList<Car> getInventory(){
        return inventory;
    }
    public void addCar(Car car){
        inventory.add(car);
    }
    public boolean swap(int one, int two){
        if(one < inventory.size() && two < inventory.size()) {
            Car temp = inventory.get(one);
            inventory.set(one,inventory.get(two));
            inventory.set(two, temp);
            return true;
        }
        return false;
    }
    public void addCar(int indexToAdd, Car carToAdd)
    {
        inventory.add(indexToAdd, carToAdd);
    }
    public Car sellCarShift(int indexOfCarToSell)
    {
        return inventory.remove(indexOfCarToSell);
    }
    public Car sellCarNoShift(int indexOfCarToSell)
    {
        return inventory.set(indexOfCarToSell, null);
    }
    public void moveCar(int indexOfCarToMove, int destinationIndex)
    {
        Car car = inventory.remove(indexOfCarToMove);
        inventory.add(destinationIndex, car);
    }




}
