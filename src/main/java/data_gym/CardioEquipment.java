package data_gym;

public class CardioEquipment extends GymEquipment {
    private double kecepatanMaks; 
    private int durasiMaks;       

    public CardioEquipment(String idAlat, String namaAlat, String merek, String kondisi, double kecepatanMaks, int durasiMaks) {
        super(idAlat, namaAlat, merek, kondisi);
        this.kecepatanMaks = kecepatanMaks;
        this.durasiMaks = durasiMaks;
    }

    public double getKecepatanMaks() {
        return kecepatanMaks;
    }
    
     public int getDurasiMaks() {
        return durasiMaks;
    }
     
    public void setKecepatanMaks(double kecepatanMaks) {
        this.kecepatanMaks = kecepatanMaks;
    }

    public void setDurasiMaks(int durasiMaks) {
        this.durasiMaks = durasiMaks;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("ID: " + getIdAlat() + " | Nama: " + getNamaAlat() + " | Merek: " + getMerek() + " | Kondisi: " + getKondisi() + " | Tipe: Cardio" + " | Kecepatan Maks: " + kecepatanMaks + " km/jam" + " | Durasi Maks: " + durasiMaks + " menit");         
    }
}

