package data_gym;

public class Member {
    private String idMember;
    private String nama;
    private String noHp;
    private String jenisMembership;
    private String status;

    public Member(String idMember, String nama, String noHp, String jenisMembership, String status) {
        this.idMember = idMember;
        this.nama = nama;
        this.noHp = noHp;
        this.jenisMembership = jenisMembership;
        this.status = status;
    }

    public String getIdMember() {
        return idMember; 
    }

    public String getNama() {
        return nama;
    }

    public String getNoHp() {
        return noHp;
    }

    public String getJenisMembership() {
        return jenisMembership;
    }

    public String getStatus() {
        return status;
    }

    public void setIdMember(String idMember) {
        this.idMember = idMember;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNoHp(String noHp) {
        this.noHp = noHp;
    }

    public void setJenisMembership(String jenisMembership) {
        this.jenisMembership = jenisMembership;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public void tampilkanInfo() {
        System.out.println("ID: " + idMember + " | Nama: " + nama + " | HP: " + noHp
                + " | Membership: " + jenisMembership + " | Status: " + status);
    }
}