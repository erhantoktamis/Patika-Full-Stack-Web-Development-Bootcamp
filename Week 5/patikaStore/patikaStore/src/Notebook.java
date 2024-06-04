import java.util.ArrayList;
import java.util.Scanner;
public class Notebook extends Product implements Operation{
    private static int id=1;
    private static ArrayList<Notebook> notebookList = new ArrayList<>();
    public Notebook(String name, double price, double discountRate, int stock, String brandName, String screenSize, int ram, String memory) {
        super(id, name, price, discountRate, stock, brandName, screenSize, ram, memory);
    }
    public Notebook() {
    }
    boolean isRunning = true;
    @java.lang.Override
    public void runMenu() {
        while(isRunning) {
        System.out.println("Notebook Yönetim Paneli");
        System.out.println("1- Notebook ekleme \n" +
                "2- Notebook Silme \n" +
                "3- İd ye göre filtreleme \n" +
                "4- Markaya göre filtreleme \n" +
                "5- Notebook Listeleme \n" +
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
        if (notebookList.isEmpty()) {
            System.out.println("Notebook listesi boş.");
        } else {
            System.out.println("Notebook List:");
            System.out.println("----------------------------------------------------------------------------------------------------");
            System.out.printf("| %-3s | %-30s | %-9s | %-9s | %-7s | %-9s | %-9s | %-6s | %-9s |\n",
                    "ID", "Ürün Adı", "Fiyat", "İndirim", "Stok", "Marka", "Ekran", "RAM", "Depolama");
            System.out.println("----------------------------------------------------------------------------------------------------");

            for (Notebook notebook : notebookList) {
                System.out.printf("| %-3d | %-30s | %-9.2f | %-9.2f | %-7d | %-9s | %-9s | %-6d | %-9s |\n",
                        notebook.getId(), notebook.getName(), notebook.getPrice(), notebook.getDiscountRate(),
                        notebook.getStock(), notebook.getBrandName(), notebook.getScreenSize(),
                        notebook.getRam(), notebook.getMemory());
            }
            System.out.println("----------------------------------------------------------------------------------------------------");
        }
    }
    @java.lang.Override
    public void addProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Notebook detaylarını giriniz:");
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
        Notebook notebook = new Notebook(name, price, discountRate, stock, brandName, screenSize, ram, memory);
        notebookList.add(notebook);
        System.out.println("Notebook başarılı şekilde eklendi.");
    }
    @java.lang.Override
    public void deleteProduct() {
        if (notebookList.isEmpty()) {
            System.out.println("Notebook listesi boş.");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Silmek istediğiniz notebook un ID sini gir : ");
        int notebookIdToDelete = scanner.nextInt();
        // Belirtilen id ye sahip notebook u bulmak için bulmak için notebookList üzerinde döngü kullanıldı
        boolean notebookFound = false;
        for (Notebook notebook : notebookList) {
            if (notebook.getId() == notebookIdToDelete) {
                notebookList.remove(notebook);
                System.out.println("Notebook başarılı bir şekilde silindi.");
                notebookFound = true;
                break;
            }
        }
        if (!notebookFound) {
            System.out.println("ID değerine sahip notebook bulunamadı: " + notebookIdToDelete);
        }
    }
    @java.lang.Override
    public void filterByProductId() {
        if (notebookList.isEmpty()) {
            System.out.println("Notebook listesi boş. ");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("ID giriniz: ");
        int productId = scanner.nextInt();
        System.out.println("ID ye göre filtrelendi:");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.printf("| %-3s | %-30s | %-9s | %-9s | %-7s | %-9s | %-9s | %-6s | %-9s |\n",
                "ID", "Ürün Adı", "Fiyat", "İndirim", "Stok", "Marka", "Ekran", "RAM", "Depolama");
        System.out.println("----------------------------------------------------------------------------------------------------");
        for (Notebook notebook : notebookList) {
            if (notebook.getId() == productId) {
                System.out.printf("| %-3d | %-30s | %-9.2f | %-9.2f | %-7d | %-9s | %-9s | %-6d | %-9s |\n",
                        notebook.getId(), notebook.getName(), notebook.getPrice(), notebook.getDiscountRate(),
                        notebook.getStock(), notebook.getBrandName(), notebook.getScreenSize(),
                        notebook.getRam(), notebook.getMemory());
                return;
            }
        }

        System.out.println("ID ye ait notebook bulunamadı: " + productId);
    }
    @java.lang.Override
    public void filterByProductBrand() {
        if (notebookList.isEmpty()) {
            System.out.println("Notebook listesi boş.");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Markayı giriniz :");
        String brandName = scanner.next();
        System.out.println("Markaya göre filtrelendi:");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.printf("| %-3s | %-30s | %-9s | %-9s | %-7s | %-9s | %-9s | %-6s | %-9s |\n",
                "ID", "Ürün Adı", "Fiyat", "İndirim", "Stok", "Marka", "Ekran", "RAM", "Depolama");
        System.out.println("----------------------------------------------------------------------------------------------------");
        for (Notebook notebook : notebookList) {
            if (notebook.getBrandName().equalsIgnoreCase(brandName)) {
                System.out.printf("| %-3d | %-30s | %-9.2f | %-9.2f | %-7d | %-9s | %-9s | %-6d | %-9s |\n",
                        notebook.getId(), notebook.getName(), notebook.getPrice(), notebook.getDiscountRate(),
                        notebook.getStock(), notebook.getBrandName(), notebook.getScreenSize(),
                        notebook.getRam(), notebook.getMemory());
            }
        }
    }
}
