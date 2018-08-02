package esper.esper_2.POJO_2;

/**
 * @author by Wangshuo5 on 2018/4/13
 */
public class Child
{
    String name;
    int gender;

    public String getName() {
        return name;
    }

    public int getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return this.name;
    }
}