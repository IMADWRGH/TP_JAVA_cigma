package Heritage;
public class StockKeeper {
    private final String  name;

    public StockKeeper(String name) {
        this.name = name;
    }
    Album album =new Album();
    public void manageAlbum(Album album, String name, String artist, double price, int numberOfCopies)
    {
        this.album=album;
        this.album.setName(name);
        this.album.setArtist(artist);
        this.album.setPrice(price);
        this.album.setNumberOfCopies(numberOfCopies);

        System.out.println("Album managed by :" + getName());
        System.out.println("::::::::::Album details::::::::::");
        System.out.println("Album name : " + this.album.getName());
        System.out.println("Album artist : " + this.album.getArtist());
        System.out.println("Album price : " + this.album.getPrice());
        System.out.println("Album number of copies : " + this.album.getNumberOfCopies());
    }

    Movie movie = new Movie();

    public void manageMovie(Movie movie, String name, String director, double price, int numberOfCopies) {
        this.movie = movie;
        this.movie.setName(name);
        this.movie.setDirector(director);
        this.movie.setPrice(price);
        this.movie.setNumberOfCopies(numberOfCopies);

        System.out.println("Album managed by :" + getName());
        System.out.println("::::::::::Album details::::::::::");
        System.out.println("Album name : " + this.movie.getName());
        System.out.println("Album artist : " + this.movie.getDirector());
        System.out.println("Album price : " + this.movie.getPrice());
        System.out.println("Album number of copies : " + this.movie.getNumberOfCopies());
    }

    public String getName() {
        return name;
    }

   /* public void setName(String name) {
        this.name = name;
    }*/

    public static void main(String[] args) {
        StockKeeper johnDoe = new StockKeeper("John Doe");
        johnDoe.manageAlbum(new Album(), "Slippery When Wet", "Bon Jovi", 1000.00, 50);
        johnDoe.manageMovie(new Movie(), "Avatar", "imad ", 2000.00, 500);
    }
    }



