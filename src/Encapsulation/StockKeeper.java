package Encapsulation;

public class StockKeeper {
    private String name;

    public StockKeeper(String name) {
        this.name = name;
    }
    Album album=new Album();
    public void manageAlbum(Album album, String name, String artist, double price, int numberOfCopies)
    // Même code et différence de syntaxe ::: public void manageAlbum(Album album, String name, String artist, double price, int numberOfCopies)
    {
        this.album.setName(name);
        this.album.setArtist(artist);
        this.album.setPrice(price);
        this.album.setNumberOfCopies(numberOfCopies);

        System.out.println("Album managed by :"+ getName());
        System.out.println("::::::::::Album details::::::::::");
        System.out.println("Album name : " + this.album.getName());
        System.out.println("Album artist : " + this.album.getArtist());
        System.out.println("Album price : " + this.album.getPrice());
        System.out.println("Album number of copies : " + this.album.getNumberOfCopies());
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
