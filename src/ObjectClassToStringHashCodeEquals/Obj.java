package ObjectClassToStringHashCodeEquals;

public class Obj {
    private int num;

    public Obj(int num) {
        super();
        this.num = num;
    }

    @Override
    public int hashCode() {
        final int prime = 10;
        int result = 1 ;
        result = prime * result + num;
        return result;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Obj obj = (Obj) o;
        return num == obj.num;
    }

    @Override
    public String toString() {
        return "Obj{" + "num=" + num + '}';
    }
}
