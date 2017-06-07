package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Pergunta;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class RespostaData {

    Date hoje;
    Pergunta objPerg;
    Conexao con;
    ArrayList<Pergunta> perguntas = new ArrayList<Pergunta>();

    public ArrayList getPergunta(String tema) throws Exception {
        objPerg = null;
        try {

            con = new Conexao();

            String SQL = "select TOP 10 p.cod_perg, p.pergunta, p.respostaA, p.respostaB, p.respostaC, p.resp_certa, t.nome as tema from perguntas p, tema t where p.cod_tema = t.cod_tema and t.nome = ? ORDER BY NEWID()";
            PreparedStatement ps = con.getConexao().prepareStatement(SQL);
            ps.setString(1, tema);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {

                objPerg = new Pergunta();
                objPerg.setCodigoPergunta(Integer.parseInt(rs.getString("cod_perg")));
                objPerg.setPergunta(rs.getString("pergunta"));
                objPerg.setRespostaA(rs.getString("respostaA"));
                objPerg.setRespostaB(rs.getString("respostaB"));
                objPerg.setRespostaC(rs.getString("respostaC"));
                objPerg.setRespostaCerta(rs.getString("resp_certa"));

                perguntas.add(objPerg);

            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro está no ArrayLis get Pergunta: " + erro.getMessage());
        }
        return perguntas;
    }

    public boolean inserirRegistro(int cod) throws Exception {
        try {
            con = new Conexao();
            String SQL = "insert into registro values (?,?,?)";
            PreparedStatement ps = con.getConexao().prepareStatement(SQL);
            ps.setString(1, this.getDateTime());
            ps.setString(2, this.getHourTime());
            ps.setInt(3, cod);
            if (ps.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro no respostaData: " + erro.getMessage());

        }

        return true;
    }

    public boolean inserirNoRegistroPergunta(int codPerg, int codReg, boolean acertou ) {
        try {
            con = new Conexao();
            String SQL = "insert into item_registro_pergunta values (?,?,?)";
            PreparedStatement ps = con.getConexao().prepareStatement(SQL);
            ps.setInt(1, codPerg);
            ps.setInt(2, codReg);
            ps.setBoolean(3, acertou);
            
            if (ps.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro no inserir registro: " + erro.getMessage());

        }
        return true;
    }
    
    
    public int retornaUltimoregistro (){
        int ultimoReg = 0;
        try {
            con = new Conexao();
            String SQL = "select max(cod_reg) from registro";
            PreparedStatement ps = con.getConexao().prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            
         while (rs.next()) {
                ultimoReg = rs.getInt("");
            } 

        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro no inserir registro: " + erro.getMessage());

        }
        return ultimoReg;
}
        
        
        
    

    public String getDateTime() {

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        java.util.Date date = new java.util.Date();
        return dateFormat.format(date);
    }

    public String getHourTime() {

        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        java.util.Date date = new java.util.Date();
        return dateFormat.format(date);
    }

}
