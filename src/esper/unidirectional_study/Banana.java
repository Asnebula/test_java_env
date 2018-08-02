package esper.unidirectional_study;

/**
 * @author by Wangshuo5 on 2018/5/21
 */
public class Banana {
    private int price;
    private String Bname;

    public String getBname() {
        return Bname;
    }

    public void setBname(String bname) {
        Bname = bname;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Banana price=" + price;
    }
}
