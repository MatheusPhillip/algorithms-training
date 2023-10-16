package Types;

public class Pessoa {
    private int idadePrimitiva;
    private Integer idadeObject;
    
    
    public Pessoa(int idadePrimitiva, Integer idadeObject) {
        this.idadePrimitiva = idadePrimitiva;
        this.idadeObject = idadeObject;
    }


    public int getIdadePrimitiva() {
        return idadePrimitiva;
    }


    public void setIdadePrimitiva(int idadePrimitiva) {
        this.idadePrimitiva = idadePrimitiva;
    }


    public Integer getIdadeObject() {
        return idadeObject;
    }


    public void setIdadeObject(Integer idadeObject) {
        this.idadeObject = idadeObject;
    }
    

    
}
