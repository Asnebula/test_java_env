package esper.esper_2.POJO_1;

import java.util.List;
import java.util.Map;

/**
 * @author by Wangshuo5 on 2018/4/12
 */
public class Person_1 {
    String name="ws";
    int age;
    List<Child> children;
    Map<String, Integer> phones;
    Address address;

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public List<Child> getChildren()
    {
        return children;
    }

    public Map<String, Integer> getPhones()
    {
        return phones;
    }

    public Address getAddress()
    {
        return address;
    }

   /* public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setChildren(List<Child111> children) {
        this.children = children;
    }

    public void setPhones(String name,Integer number) {
//        this.phones = phones;
        phones.put(name,number);
    }

    public void setAddress(Address address) {
        this.address = address;
    }*/
}


