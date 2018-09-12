public class PenjualanPengembalian{
    public static void main(String[] args){
        int barang1 = 1000;
        int barang2 = 2000;
        int barang3 = 3000;
        int barang4 = 4000;
        int barang5 = 5500;
        int bayar = 20000;
        int total = (barang1 + barang2 + barang3 + barang4 + barang5);
        int kembalian = (bayar - total);

        float total2 = total;
        System.out.println("Harga total sebelum implisit = " + total);
        System.out.println("Harga total setelah implisit = " + total2);

        byte kembalian2 = (byte) kembalian;
        System.out.println("Kembalian sebelum eksplisit = " + kembalian);
        System.out.println("Kembalian setelah eksplisit = " + kembalian2);

        
    }
}