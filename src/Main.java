public class Main {

  public static void main(String[] args) {

    CarFactory newProduceCar = new CarFactory();
    TaxiFactory newProduceTaxi = new TaxiFactory();
    ElectricCarFactory newProduceElectricCar = new ElectricCarFactory();

    Car carAlpha = newProduceCar.produceCar();
    Car carNinja = newProduceTaxi.produceCar();
    Car carCybertruck = newProduceElectricCar.produceCar();
    Car carGtr = newProduceCar.produceCar();


    System.out.println(
        "車牌號碼" + carAlpha.getCarId() + "\n"
            + "引擎號碼" + carAlpha.getEngineId() + "\n"
            + "車身顏色" + carAlpha.getColor() + "\n");
    System.out.println(
        "車牌號碼" + carNinja.getCarId() + "\n"
            + "引擎號碼" + carNinja.getEngineId() + "\n"
            + "車身顏色" + carNinja.getColor() + "\n");
    System.out.println(
        "車牌號碼" + carCybertruck.getCarId() + "\n"
            + "引擎號碼" + carCybertruck.getEngineId() + "\n"
            + "車身顏色" + carCybertruck.getColor() + "\n");
    System.out.println(
        "車牌號碼" + carGtr.getCarId() + "\n"
            + "引擎號碼" + carGtr.getEngineId() + "\n"
            + "車身顏色" + carGtr.getColor() + "\n");



    System.out.println("Car生產數量"+newProduceCar.getProducedCars());
    System.out.println("Taxi生產數量"+newProduceTaxi.getProducedCars());
    System.out.println("ElectricCar生產數量"+newProduceElectricCar.getProducedCars()+"\n");

    System.out.println("更新車牌"+newProduceCar.updateCarId(carAlpha, "CCC-9966"));
    System.out.println("更新車牌"+newProduceTaxi.updateCarId(carNinja, "TAB-7788"));
    System.out.println("更新車牌"+newProduceElectricCar.updateCarId(carCybertruck, "ESC-0101")+"\n");

    System.out.println("更新車牌"+newProduceCar.updateCarId(carAlpha, "AAA-1122"));
    System.out.println("更新車牌"+newProduceTaxi.updateCarId(carNinja, "YAA-5656"));
    System.out.println("更新車牌"+newProduceElectricCar.updateCarId(carCybertruck, "PIP-9527")+"\n");


    System.out.println("更新顏色"+newProduceCar.updateCarColor(carAlpha, "White"));
    System.out.println("更新顏色"+newProduceElectricCar.updateCarColor(carCybertruck, "Black"));
    System.out.println("更新顏色"+newProduceCar.updateCarColor(carGtr, "Yellow"));
    System.out.println("更新顏色"+newProduceElectricCar.updateCarColor(carCybertruck, "Red"));

  }
}