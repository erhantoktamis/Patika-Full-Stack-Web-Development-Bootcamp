import java.util.Scanner;
import java.util.ArrayList;
public class Phone extends Product implements Operation {
    private static int id=1;
    private static ArrayList<Phone> phoneList = new ArrayList<>();
    private int camera;
    private int batteryCapacity;
    private String color;
    public Phone(int id, String name, double price, double discountRate, int stock, String brandName, String screenSize, int ram, String memory, int camera, int batteryCapacity, String color) {
        super(id, name, price, discountRate, stock, brandName, screenSize, ram, memory);
        this.setCamera(camera);
        this.setBatteryCapacity(batteryCapacity);
        this.setColor(color);
    }
    public Phone() {
    }
boolean isRunning = true;
    @java.lang.Override
    public void runMenu() {
        while(isRunning) {
            System.out.println("Telefon Yönetim Paneli");
            System.out.println("1- Telefon ekleme \n" +
                    "2- Telefon Silme \n" +
                    "3- İd ye göre filtreleme \n" +
                    "4- Markaya göre filtreleme \n" +
                    "5- Telefon Listeleme \n" +
                    "0- Çıkış Yap");
            System.out.println("Yapmak istediğiniz İşlemi Seçiniz");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            // switch case
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    deleteProduct();
                    break;
                case 3:
                    filterByProductId();
                    break;
                case 4:
                    filterByProductBrand();
                    break;
                case 5:
                    showProductList();
                    break;
                case 0:
                    System.out.println("Çıkış Yapıldı");
                    isRunning=false;
                    break;
                default:
                    System.out.println("Hatalı değer girdiniz");
            }
        }
    }
    @java.lang.Override
    public void showProductList() {
        if (phoneList.isEmpty()) {
            System.out.println("Telefon listesi boş.");
        } else {
            System.out.println("Telefon Listesi:");
            System.out.println("----------------------------------------------------------------------------------------------------");
            System.out.printf("| %-3s | %-30s | %-9s | %-9s | %-7s | %-9s | %-9s | %-6s | %-9s | %-9s | %-9s |\n",
                    "ID", "Ürün Adı", "Fiyat", "İndirim", "Stok", "Marka", "Ekran", "RAM", "Depolama", "Kamera", "Pil Kapasitesi", "Renk");
            System.out.println("----------------------------------------------------------------------------------------------------");

            for (Phone phone : phoneList) {
                System.out.printf("| %-3s | %-30s | %-9s | %-9s | %-7s | %-9s | %-9s | %-6s | %-9s | %-9s | %-9s |\n",
                        phone.getId(), phone.getName(), phone.getPrice(), phone.getDiscountRate(),
                        phone.getStock(), phone.getBrandName(), phone.getScreenSize(),
                        phone.getRam(), phone.getMemory(), phone.getCamera(), phone.getBatteryCapacity(), phone.getColor());
            }
            System.out.println("----------------------------------------------------------------------------------------------------");
        }
    }

    @java.lang.Override
    public void addProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Telefon detaylarını giriniz:");
        System.out.println("Ürün Adı: ");
        String name = scanner.next();
        System.out.println("Fiyat: ");
        double price = scanner.nextDouble();
        System.out.println("İndirim Oranı: ");
        double discountRate = scanner.nextDouble();
        System.out.println("Stok: ");
        int stock = scanner.nextInt();
        System.out.println("Marka Adı: ");
        String brandName = scanner.next();
        System.out.println("Ekran boyutu: ");
        String screenSize = scanner.next();
        System.out.println("RAM: ");
        int ram = scanner.nextInt();
        System.out.println("Memory: ");
        String memory = scanner.next();
        System.out.println("Camera: ");
        int camera = scanner.nextInt();
        System.out.println("Batarya kapasitesi: ");
        int battertCapacity = scanner.nextInt();
        System.out.println("Renk: ");
        String color = scanner.next();
       Phone phone = new Phone(id, name, price, discountRate, stock, brandName, screenSize, ram, memory, camera, batteryCapacity, color);
        phoneList.add(phone);
        System.out.println("Telefon başarılı şekilde eklendi.");
    }

    @java.lang.Override
    public void deleteProduct() {
        if (phoneList.isEmpty()) {
            System.out.println("Telefon listesi boş, silme işlemi gerçekleşemedi.");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Silmek istediğiniz telefonun ID sini gir : ");
        int phoneIdToDelete = scanner.nextInt();
        // Belirtilen id ye sahip telefonuu bulmak için bulmak için notebookList üzerinde döngü kullanıldı
        boolean phoneFound = false;
        for (Phone phone : phoneList) {
            if (phone.getId() == phoneIdToDelete) {
                phoneList.remove(phone);
                System.out.println("Telefon başarılı bir şekilde silindi.");
                phoneFound = true;
                break;
            }
        }
        if (!phoneFound) {
            System.out.println("ID değerine sahip phone bulunamadı: " + phoneIdToDelete);
        }
    }

    @java.lang.Override
    public void filterByProductId() {
        if (phoneList.isEmpty()) {
            System.out.println("Telefon listesi boş silme işleme işlemi gerçekleşemedi.");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Id giriniz:");
        int productId = scanner.nextInt();
        System.out.println("Id ye göre filtrelendi:");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.printf("| %-3s | %-30s | %-9s | %-9s | %-7s | %-9s | %-9s | %-6s | %-9s | %-9s | %-9s |\n",
                "ID", "Ürün Adı", "Fiyat", "İndirim", "Stok", "Marka", "Ekran", "RAM", "Depolama", "Kamera", "Pil Kapasitesi", "Renk");
        System.out.println("----------------------------------------------------------------------------------------------------");
        for (Phone phone : phoneList) {
            if (phone.getId() == productId) {
                System.out.printf("| %-3s | %-30s | %-9s | %-9s | %-7s | %-9s | %-9s | %-6s | %-9s | %-9s | %-9s |\n",
                       phone.getId(),  phone.getName(),  phone.getPrice(),  phone.getDiscountRate(),
                        phone.getStock(),  phone.getBrandName(),  phone.getScreenSize(),
                        phone.getRam(),  phone.getMemory(),  phone.getCamera(), phone.getBatteryCapacity(), phone.getColor());
                return;  // Assuming only one notebook can have a specific ID
            }
        }

        System.out.println("ID ye ait telefon bulunamadı: " + productId);
    }

    @java.lang.Override
    public void filterByProductBrand() {
        if (phoneList.isEmpty()) {
            System.out.println("Telefon listesi boş silme işleme işlemi gerçekleşemedi.");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Marka giriniz:");
        String productBrandName= scanner.next();
        System.out.println("Markaya ye göre filtrelendi:");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.printf("| %-3s | %-30s | %-9s | %-9s | %-7s | %-9s | %-9s | %-6s | %-9s | %-9s | %-9s |\n",
                "ID", "Ürün Adı", "Fiyat", "İndirim", "Stok", "Marka", "Ekran", "RAM", "Depolama", "Kamera", "Pil Kapasitesi", "Renk");
        System.out.println("----------------------------------------------------------------------------------------------------");
        for (Phone phone : phoneList) {
            if (phone.getBrandName() == productBrandName) {
                System.out.printf("| %-3s | %-30s | %-9s | %-9s | %-7s | %-9s | %-9s | %-6s | %-9s | %-9s | %-9s |\n",
                        phone.getId(),  phone.getName(),  phone.getPrice(),  phone.getDiscountRate(),
                        phone.getStock(),  phone.getBrandName(),  phone.getScreenSize(),
                        phone.getRam(),  phone.getMemory(),  phone.getCamera(), phone.getBatteryCapacity(), phone.getColor());
                return;
            }
        }

        System.out.println("Marka ya ait telefon bulunamadı: " + productBrandName);
    }

    public int getCamera() {
        return camera;
    }

    public void setCamera(int camera) {
        this.camera = camera;
    }

    public int getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
