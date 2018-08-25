package cloneObjectClass;

public class CEO implements  Cloneable{

    int id;
    String name;
    String lsat_name;

    public CEO(int id, String name, String lsat_name) {
        super();
        this.id = id;
        this.name = name;
        this.lsat_name = lsat_name;
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
