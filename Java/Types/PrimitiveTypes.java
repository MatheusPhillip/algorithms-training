package Types;

public class PrimitiveTypes {

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa(10, 20);
        Pessoa pessoa2 = pessoa1;

        System.out.println(pessoa1.getIdadePrimitiva() + " e " + pessoa1.getIdadeObject());
        System.out.println(pessoa2.getIdadePrimitiva() + " e " + pessoa2.getIdadeObject());

        pessoa2.setIdadePrimitiva(11);
        pessoa2.setIdadeObject(21);

        System.out.println(pessoa1.getIdadePrimitiva() + " e " + pessoa1.getIdadeObject());
        System.out.println(pessoa2.getIdadePrimitiva() + " e " + pessoa2.getIdadeObject());

        int preco = 10;
        Integer precoObject = 20;

        int preco2 = preco;
        Integer precoObject2 = precoObject;

        preco2++;
        precoObject2++;

        System.out.println("preco: " + preco + " e preco2: " + preco2);
        System.out.println("precoObject: " + precoObject + " e precoObject2: " + precoObject2);
        

    }

    
}


 
