package data_gym;

public class GymEquipment {
    private String idAlat;
    private String namaAlat;
    private String merek;
    private String kondisi;

    public GymEquipment(String idAlat, String namaAlat, String merek, String kondisi) {
        this.idAlat = idAlat;
        this.namaAlat = namaAlat;
        this.merek = merek;
        this.kondisi = kondisi;
    }

    public String getIdAlat() {
        return idAlat;
    }

    public String getNamaAlat() {
        return namaAlat;
    }

    public String getMerek() {
        return merek;
    }

    public String getKondisi() {
        return kondisi;
    }

    public void setIdAlat(String idAlat) {
        this.idAlat = idAlat;
    }

    public void setNamaAlat(String namaAlat) {
        this.namaAlat = namaAlat;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public void setKondisi(String kondisi) {
        this.kondisi = kondisi;
    }
    
    public void tampilkanInfo() {
        System.out.println("ID: " + idAlat + " | Nama: " + namaAlat + " | Merek: " + merek + " | Kondisi: " + kondisi + " | Tipe: Umum");
    }
}
