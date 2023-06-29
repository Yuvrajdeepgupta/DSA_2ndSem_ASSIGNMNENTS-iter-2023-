public class PROG_6 
{
    public static void main(String[] args) 
    {
        Box<String> stringBox = new Box<>("Hello");
        Box<String> anotherStringBox = stringBox;

        stringBox.setContents("World");
        System.out.println(stringBox.getContents()); 
        System.out.println(anotherStringBox.getContents()); 

        Box<Integer> integerBox = new Box<>(10);
        Box<Integer> anotherIntegerBox = integerBox;

        integerBox.setContents(20);
        System.out.println(integerBox.getContents()); 
        System.out.println(anotherIntegerBox.getContents()); 

        Box<Object> objectBox = new Box<>();
        Box<Object> anotherObjectBox = objectBox;

        objectBox.setContents("Java");
        System.out.println(objectBox.getContents()); 
        System.out.println(anotherObjectBox.getContents()); 

        objectBox.setContents(42);
        System.out.println(objectBox.getContents()); 
        System.out.println(anotherObjectBox.getContents()); 
    }
}

class Box<T> 
{
    private T contents;

    public Box() 
    {}//default

    public Box(T contents) 
    {
        this.contents = contents;
    }

    public T getContents()
    {
        return contents;
    }

    public void setContents(T contents) 
    {
        this.contents = contents;
    }
}
