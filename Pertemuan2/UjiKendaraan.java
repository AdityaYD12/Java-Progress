class ujiKendaraan {
    public static void main(String[] a)
    {
        System.out.print("Hondi : ");
        kendaraan hondi = new kendaraan();
        System.out.println(hondi.getprintnoRangka());
        System.out.println(hondi.getprintroda());

        System.out.print("Sisuka : ");
        kendaraan sizuka = new kendaraan("SZK001", 2);
        System.out.println(sizuka.getprintnoRangka());
        System.out.println(sizuka.getprintroda());
    }
}
