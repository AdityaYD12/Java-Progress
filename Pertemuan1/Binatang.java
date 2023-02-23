class Binatang {
    //Property
    int kaki;
    String jenis;

    //Method Konstruktor (Memberi nilai Default)
    Binatang()
    {
        kaki = 2;
        jenis = "Mamalia";
    }

    //Method Biasa
    void PrintKaki()
    {
        System.out.println("Jumlah Kaki = "+ kaki);
    }
    void setKaki(int kakibaru)
    {
        kaki = kakibaru;
    }

    void PrintJenis()
    {
        System.out.println("Jenis = "+ jenis);
    }
    void setJenis(String jenisbaru)
    {
        jenis = jenisbaru;
    }

    //Main Code
    public static void main(String[] args) {
        Binatang anjingGuguk = new Binatang();
        anjingGuguk.PrintKaki();
        anjingGuguk.setKaki(4);
        anjingGuguk.PrintKaki();
        anjingGuguk.PrintJenis();
        anjingGuguk.setJenis("Mamalia");
        anjingGuguk.PrintJenis();

        Binatang ulerRenang = new Binatang();
        ulerRenang.PrintKaki();
        ulerRenang.setKaki(0);
        ulerRenang.PrintKaki();

    }
}
