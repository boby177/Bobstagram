package droidmentor.bobstagram.Friends;

public class Teman {
    private String nim;
    private String nama;
    private String kelas;
    private String telepon;
    private String email;
    private String sosmed;

    public Teman(String nim, String nama, String kelas, String telepon, String email, String sosmed) {
        this.nim     = nim;
        this.nama    = nama;
        this.kelas   = kelas;
        this.telepon = telepon;
        this.email   = email;
        this.sosmed  = sosmed;
    }
//NIM
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }
//Nama
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
//Kelas
    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }
//Telepon
    public String getTelepon() {
        return telepon;
    }

    public void setTelepon(String telepon) {
        this.telepon = telepon;
    }
//Email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
//Sosmed
    public String getSosmed() {
        return sosmed;
}

    public void setSosmed(String sosmed) {
        this.sosmed = sosmed;
    }
}
