package visitor;

public class Item implements Element {

    private String name;

    Item(String name){
        this.name = name;
    }

    String getName(){
        return name;
    }

    @Override
    public void accept(Visitor vistor) {
        vistor.visit(this);
    }
}
