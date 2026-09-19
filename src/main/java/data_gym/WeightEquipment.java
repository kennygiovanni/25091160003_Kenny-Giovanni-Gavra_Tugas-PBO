package data_gym;

public class WeightEquipment extends GymEquipment {
    private double bebanMaks;  
    private String tipeBeban;  

    public WeightEquipment(String idAlat, String namaAlat, String merek, String kondisi, double bebanMaks, String tipeBeban) {
        super(idAlat, namaAlat, merek, kondisi);
        this.bebanMaks = bebanMaks;
        this.tipeBeban = tipeBeban;
    }

    public double getBebanMaks() {
        return bebanMaks;
    }

    public String getTipeBeban() {
        return tipeBeban;
    }

    public void setBebanMaks(double bebanMaks) {
        this.bebanMaks = bebanMaks;
    }

    public void setTipeBeban(String tipeBeban) {
        this.tipeBeban = tipeBeban;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("ID: " + getIdAlat() + " | Nama: " + getNamaAlat() + " | Merek: " + getMerek() + " | Kondisi: " + getKondisi() + " | Tipe: Beban (" + tipeBeban + ")" + " | Beban Maks: " + bebanMaks + " kg");   
    }
}

