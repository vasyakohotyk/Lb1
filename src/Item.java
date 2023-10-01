public class Item {
    private String name;
    private double weight;
    private double size;

    public Item(String name, double weight, double size) {
        this.name = name;
        this.weight = weight;
        this.size = size;
    }

   
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}

class Shipment {
    private Item[] items;
    private String deliveryMethod;
    private double maxWeightLimit;
    private double maxSizeLimit;

    public Shipment(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
        this.items = new Item[10];
        if (deliveryMethod.equals("вантажівка")) {
            maxWeightLimit = 100.0;
            maxSizeLimit = 200.0;
        } else if (deliveryMethod.equals("потяг")) {
            maxWeightLimit = 50.0;
            maxSizeLimit = 150.0;
        } else if (deliveryMethod.equals("бус")) {
            maxWeightLimit = 30.0;
            maxSizeLimit = 100.0;
        } else if (deliveryMethod.equals("велокур’єр")) {
            maxWeightLimit = 5.0;
            maxSizeLimit = 50.0;
        }
    }

    public void addItem(Item item) {
        if (item.getWeight() <= maxWeightLimit && item.getSize() <= maxSizeLimit) {
            items[itemCount] = item;
            itemCount++;
        } else {
            System.out.println("Посилка не відповідає обмеженням по розміру або вазі.");
        }
    }

    public void cancelShipment() {
       items = null;
    }

    public Item[] getItems() {
        return items;
    }

    public void setItems(Item[] items) {
        this.items = items;
    }

    public String getDeliveryMethod() {
        return deliveryMethod;
    }

    public void setDeliveryMethod(String deliveryMethod) {
        this.deliveryMethod = deliveryMethod;
    }
}

class Customer {
    private String name;
    private String address;

    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

class ReceivePoint {
    private String address;

    public ReceivePoint(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

class DeparturePoint {
    private String address;

    public DeparturePoint(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

class DeliveryService {
    private DeparturePoint[] departurePoints;
    private ReceivePoint[] receivePoints;
    private Shipment[] shipments;

    public DeliveryService() {
        this.departurePoints = new DeparturePoint[10];
        this.receivePoints = new ReceivePoint[10];
        this.shipments = new Shipment[100];
    }

    public void createShipment(Customer customer, Item[] items, String deliveryMethod) {
        Shipment shipment = new Shipment(deliveryMethod);
        shipment.setItems(items);
        
    }

    public void deliverByBicycleCourier(Customer customer, Item[] items) {
        Shipment shipment = new Shipment("велокур’єр");
        shipment.setItems(items);
        
    }

}

