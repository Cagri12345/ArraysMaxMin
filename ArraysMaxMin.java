package Arrays;
//Dizideki Elemanların Max ve Min Değerlerini Bulan Program
public class ArraysMaxMin {
    public static void main(String[] args) {

        // Dizi tanımlanır ve başlangıç değerleri atanır
        int[] list = {56, 34, 1, 8, 101, -2, -33};

        // İlk değer olarak dizinin ilk elemanı atanır
        int min = list[0];
        int max = list[0];

        // Dizinin tüm elemanlarını kontrol eden döngü
        for(int i = 0 ; i < list.length ; i++){
            // Mevcut eleman minimum değerden küçükse, minimum değeri güncelle
            if(i < min){
                min = i;
            }
            // Mevcut eleman maksimum değerden büyükse, maksimum değeri güncelle
            if (i > max ) {
                max = i;
            }
        }

        // Minimum ve maksimum değerler ekrana yazdırılır
        System.out.println("Minimum değer: " + min);
        System.out.println("Maximum değer: " + max);

    }
}
