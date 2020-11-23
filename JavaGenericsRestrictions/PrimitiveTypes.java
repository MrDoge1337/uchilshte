package JavaGenericsRestrictions;

public class PrimitiveTypes <I, C>{
    private I integer;
    private C character;

    public PrimitiveTypes(I integer, C character){
        this.integer = integer;
        this.character = character;
    }

    public static void main(String[] args) {
        //PrimitiveTypes <int, char> primitiveTypes = new PrimitiveTypes<>(1, 'a');

        PrimitiveTypes <Integer, Character> primitiveTypes = new PrimitiveTypes<>(1, 'a');
    }
}
