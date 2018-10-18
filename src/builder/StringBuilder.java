package builder;

public class StringBuilder extends AbstractStringBuilder {

    public StringBuilder(){
        super(16);
    }

    @Override
    public String toString() {
        //create a copy,don't share the array
        return new String(value,0,count);
    }
}
