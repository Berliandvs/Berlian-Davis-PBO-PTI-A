public class TestVehicle1 {
  public static void main(String[] args) {
    System.out.println("Creating a vehicle with a 10,000 kg maximumload.");
    Vehicle1 vehicle = new Vehicle1(10000);
        System.out.println("Add box #1 (500kg) : " +vehicle.addBox(500));
        //NO 2 (EROR) karena load bersifat private
        //NO 3A (tidak eror, karena sudah modifier sudah diganti menjadi public)
        System.out.println("Add load(100kg) : " + (vehicle.load=500));

        System.out.println("Add box #2 (250kg) : " +vehicle.addBox(250));
        System.out.println("Add box #3 (5000kg) : " +vehicle.addBox(5000));
        System.out.println("Add box #4 (4000kg) : " +vehicle.addBox(4000));

        //NO 3B (tidak eror, karena sudah modifier sudah diganti menjadi public)
        System.out.println("Add load(100kg) : " + (vehicle.load=500)); 

        System.out.println("Add box #5 (300kg) : " +vehicle.addBox(300));
        System.out.println("Vehicle load is "+ vehicle.getLoad() + "kg");
  }
}
