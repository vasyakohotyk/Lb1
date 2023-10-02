public class Item {
    private String name;
    private double weight;
    private double size;

    public Item(String name, double weight, double size) {
        this.name = name;
        this.weight = weight;
        this.size = size;
    }

    // Геттери і сеттери для полів name, weight, size
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
        // Встановлюємо обмеження ваги і розміру відправлення залежно від способу доставки
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

    // Метод для додавання посилки до відправлення
    public void addItem(Item item) {
        // Перевіряємо, чи не перевищені обмеження ваги і розміру
        if (item.getWeight() <= maxWeightLimit && item.getSize() <= maxSizeLimit) {
            // Додаємо посилку до відправлення
            // Додайте логіку для додавання посилки до масиву items тут
        } else {
            System.out.println("Посилка не відповідає обмеженням по розміру або вазі.");
        }
    }

    // Метод для скасування відправлення
    public void cancelShipment() {
        // Додайте логіку скасування відправлення тут
    }

    // Геттери і сеттери для полів items, deliveryMethod
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

    // Геттери і сеттери для полів name, address
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

    // Геттер і сеттер для поля address
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

    // Геттер і сеттер для поля address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}

class DeliveryService {
    // Масиви для збереження адрес відділень доставки і відправлень
    private DeparturePoint[] departurePoints;
    private ReceivePoint[] receivePoints;
    private Shipment[] shipments;

    public DeliveryService() {
        this.departurePoints = new DeparturePoint[10];
        this.receivePoints = new ReceivePoint[10];
        this.shipments = new Shipment[100];
    }

    // Метод для створення відправлення
    public void createShipment(Customer customer, Item[] items, String deliveryMethod) {
        Shipment shipment = new Shipment(deliveryMethod);
        shipment.setItems(items);
        // Додаємо відправлення до масиву shipments
        // Додайте логіку для додавання відправлення тут
    }

    // Метод для доставки велокур'єром
    public void deliverByBicycleCourier(Customer customer, Item[] items) {
        // Створюємо відправлення для велокур'єра
        Shipment shipment = new Shipment("велокур’єр");
        shipment.setItems(items);
        // Додаємо відправлення до масиву shipments
        // Додайте логіку для доставки велокур'єром тут
    }

    // Інші методи і логіка для управління сервісом
}

