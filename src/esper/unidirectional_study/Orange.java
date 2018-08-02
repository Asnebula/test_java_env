package esper.unidirectional_study;

/**
 * @author by Wangshuo5 on 2018/5/21
 */
public class Orange {
    private int price;

    public String getOname() {
        return Oname;
    }

    public void setOname(String oname) {
        Oname = oname;
    }

    private String Oname;


    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Orange price=" + price;
    }
}
