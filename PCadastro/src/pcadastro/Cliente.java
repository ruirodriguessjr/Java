/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pcadastro;




import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



/**
 *
 * @author aluno
 */
public class Cliente extends Pessoa {
    private int id;
    private Date data;
    private String rg;
    
       
    
    public Cliente(int id, String data, String rg, String nome, String cpf) throws ParseException {
        super(nome, cpf);
        this.id = id;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");         
        this.data = formato.parse(data);;
        this.rg = rg;
    }

    public Cliente() throws ParseException {
        rg = "00.000.000-0";
        id = 1;
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");         
        data = formato.parse("01/01/1900");
            
    }
   
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
        
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
    
    
    
}
