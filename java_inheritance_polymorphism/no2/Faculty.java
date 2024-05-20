package java_inheritance_polymorphism.no2;

public class Faculty extends Employee {
    
    private int jamKerja;
    private String pangkat;

    public Faculty(String nama, String alamat, String nomorTelepon, 
        String email, String kantor, double gaji, MyDate tanggalDipekerjakan, int jamKerja, String pangkat) {
        super(nama, alamat, nomorTelepon, email, kantor, gaji, tanggalDipekerjakan);
        this.jamKerja = jamKerja;
        this.pangkat = pangkat;
    }

    @Override
    public String toString() {
        return "Class: Faculty \nNama: " + getNama() + "\nAlamat: " + getAlamat() 
                + "\nNo Telepon: " + getNomorTelepon() + "\nEmail: " + getEmail()
                + "\nKantor: " + getKantor() + "\nGaji: " + getGaji() + "\nTanggal DIpekerjakan: " + getTanggalDipekerjakan()
                + "\nJam Kerja: " + jamKerja + "\nPangkat: " + pangkat;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public String getPangkat() {
        return pangkat;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }

    public void setPangkat(String pangkat) {
        this.pangkat = pangkat;
    }
}

