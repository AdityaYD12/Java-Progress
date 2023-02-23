public class Manusia {
    private String nama;
    private Boolean punyaTV;

    public Manusia()
    {
        nama = " ";
        punyaTV = false;
    }
    public Manusia(String newNama)
    {
        nama = newNama;
    }
    public String namaSaya()
    {
        return nama;
    }
    public void beliTV(TV tiviku)
    {
        punyaTV = true;
    }
    public void jualSemuaTV()
    {
        punyaTV = false;
        
    }
    public Boolean cekTV()
    {
        return punyaTV;
    }
    


}
