package java_inheritance_polymorphism.no2;

public class Staff extends Employee {
    private String gelar;
    
    public Staff(String nama, String alamat, String nomorTelepon, 
            String email, String kantor, double gaji, MyDate tanggalDipekerjakan, String gelar) {
        super(nama, alamat, nomorTelepon, email, kantor, gaji, tanggalDipekerjakan);
        this.gelar = gelar;
    }
    
    @Override
    public String toString() {
        return "Class: Staff \nNama: " + getNama() + "\nAlamat: " + getAlamat() 
                + "\nNo Telepon: " + getNomorTelepon() + "\nEmail: " + getEmail()
                + "\nKantor: " + getKantor() + "\nGaji: " + getGaji() + "\nTanggal DIpekerjakan: " + getTanggalDipekerjakan()
                + "\nGelar: " + gelar;
    }
    public String getGelar() {
        return gelar;
    }
    public void setGelar(String gelar) {
        this.gelar = gelar;
    }
}
