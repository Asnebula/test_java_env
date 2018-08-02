package esper.esper_2.POJO_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author by Wangshuo5 on 2018/4/12
 */
public class Person_2 {
    String name;
    int age;
    List<Child> children=new ArrayList<>();
    Map<String, Integer> phones=new HashMap<>();
    Address address;


    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    public List<Child> getChildren() {
        return children;
    }

    /*Overload*/
    public Child getChildren(int index)
    {
        return children.get(index);
    }


    public Map<String, Integer> getPhones()
    {
        return phones;
    }

    public Address getAddress()
    {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setChildren(List<Child> children) {
        this.children = children;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    // 此方法用于phones属性的更新
    public void setPhones(String name, Integer number){
        phones.put(name, number);
    }
}




