package Heritage;

public class Product {
String name;
double price;
int numberOfCopies;
/*public void sellCopies()
{
    if (numberOfCopies > 0)
    {
        System.out.print("One album has sold !");
    }else
    {
        System.out.print("No more album available !");
    }
}*/
   /* public void OrderCopeis(int num)
    {
        numberOfCopies+=num;
    }*/
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
      public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        if(price > 0) {
            this.price = price;
        }
        else {
            this.price = 0.0;
        }
    }
    public int getNumberOfCopies() {
        return numberOfCopies;
    }
    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = Math.max(numberOfCopies, 0);
    }
}

