public class Latihan3 {
    
    public static void main(String[] args) {
        
        double gajiAndri = 1000000, gajiBudi = 5000000;
        double pajak, gajiBersih;
        
        if(gajiAndri==1000000){
            pajak = 0.03*gajiAndri;
            gajiBersih = gajiAndri - pajak;
            System.out.println("===== Andri =====");
            System.out.println("Gaji bersih : "+gajiBersih);
        }
        
        if(gajiBudi==5000000){
            pajak = 0.02*gajiBudi;
            gajiBersih = gajiBudi - pajak;
            System.out.println("===== Budi =====");
            System.out.println("Gaji bersih : "+gajiBersih);
        }
        
    }
    
}
