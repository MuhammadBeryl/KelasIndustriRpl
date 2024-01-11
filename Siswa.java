public class Siswa {
    public static void main(String[] args) {
        System.out.println("Semangat Belajar");
        Siswa s = new Siswa();
        s.tampilNama();
        System.out.println(s.usia(2007));
    }

    public void tampilNama(){
        String nama= "Beryl";
        System.out.println("Nama Siswa: "+nama);
    }

    public int usia(int tahunlahir){
        int usia=2024-tahunlahir;
        return usia;
    }
}
