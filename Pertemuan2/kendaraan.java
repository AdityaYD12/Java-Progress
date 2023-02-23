class kendaraan {
    //properti
    private String noRangka;
    private int roda;

    //Konstruktor Default
    kendaraan()
    {
        noRangka = "N/A";
        roda = 0;
    }

    //Konstruktor Pembentuk
    kendaraan(String nRangka, int nroda)
    {
        noRangka = nRangka;
        roda = nroda;
    }

    //method
    String getprintnoRangka()
    {
        return noRangka;
    }

    int getprintroda()
    {
        return roda;
    }

    void setprintnoRangka(String nr)
    {
        noRangka = nr;
    }
    void setprintroda(int nroda)
    {
        roda = nroda;
    }
}
