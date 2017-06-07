package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.Pergunta;
import net.proteanit.sql.DbUtils;
import ViewAdm.FrmCadastroPerguntaAdm;

public class PerguntasData {

    Conexao con;

    public boolean Incluir(Pergunta obPerg) throws Exception {
        con = new Conexao();
        String pergunta = null;
        String SQL1 = "select * from perguntas where pergunta = ?";
        PreparedStatement ps1 = con.getConexao().prepareStatement(SQL1);
        ps1.setString(1, obPerg.getPergunta());
        ResultSet rs = ps1.executeQuery();
        while (rs.next()) {
            pergunta = rs.getString("pergunta");
        }

        if (obPerg.getPergunta().equals(pergunta)) {
            JOptionPane.showMessageDialog(null, "Pergunta já cadastrada!");
            return false;

        } else {
            String SQL2 = "insert into perguntas values (?,?,?,?,?,?)";
            PreparedStatement ps2 = con.getConexao().prepareStatement(SQL2);
            ps2.setString(1, obPerg.getPergunta());
            ps2.setString(2, obPerg.getRespostaA());
            ps2.setString(3, obPerg.getRespostaB());
            ps2.setString(4, obPerg.getRespostaC());
            ps2.setString(5, obPerg.getRespostaCerta());
            ps2.setInt(6, obPerg.getTema());
            if (ps2.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }

        }
    }

    public Pergunta Pesquisar(String pergunta) throws Exception {
        con = new Conexao();
        Pergunta obPerg = null;
        String SQL = "select * from perguntas where pergunta like ?";
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);
        ps.setString(1, pergunta);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            obPerg = new Pergunta();
            obPerg.setRespostaA(rs.getString("respostaA"));
            obPerg.setRespostaB(rs.getString("respostaB"));
            obPerg.setRespostaC(rs.getString("respostaC"));
            obPerg.setRespostaCerta(rs.getString("resp_certa"));
            obPerg.setTema(rs.getInt("cod_tema"));

        }
        return obPerg;
    }

    public boolean Editar(Pergunta obPerg) throws Exception {
        con = new Conexao();
        String SQL = "update perguntas set pergunta = ?, respostaA = ?, respostaB = ?, respostaC = ?, resp_certa = ?, cod_tema = ? where cod_perg = ?";
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);
        ps.setString(1, obPerg.getPergunta());
        ps.setString(2, obPerg.getRespostaA());
        ps.setString(3, obPerg.getRespostaB());
        ps.setString(4, obPerg.getRespostaC());
        ps.setString(5, obPerg.getRespostaCerta());
        ps.setInt(6, obPerg.getTema());
        ps.setInt(7, obPerg.getCodigoPergunta());
        if (ps.executeUpdate() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void listarPerguntas() {
        try {
            con = new Conexao();
            String SQL = "select cod_perg as 'Código' , pergunta as 'Pergunta', respostaA as 'Resposta A' , respostaB as 'Resposta B', respostaC as 'Resposta C', resp_certa as 'Resposta Certa' , tema.nome as 'Tema' from perguntas inner join tema on tema.cod_tema=perguntas.cod_tema";
            PreparedStatement ps = con.getConexao().prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            ViewAdm.FrmCadastroPerguntaAdm.tblPerguntas.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro.getMessage());
        }
    }

    public void pesquisarPergunta() {
        try {
            con = new Conexao();
            String SQL = "select cod_perg as 'Código' , pergunta as 'Pergunta', respostaA as 'Resposta A' , respostaB as 'Resposta B', respostaC as 'Resposta C', resp_certa as 'Resposta Certa' , tema.nome as 'Tema' from perguntas inner join tema on tema.cod_tema=perguntas.cod_tema where pergunta like ?";
            PreparedStatement ps = con.getConexao().prepareStatement(SQL);
            ps.setString(1, ViewAdm.FrmCadastroPerguntaAdm.txtPesquisa.getText() + "%");
            ResultSet rs = ps.executeQuery();
            ViewAdm.FrmCadastroPerguntaAdm.tblPerguntas.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro.getMessage());
        }
    }
     public void pesquisarPerguntaPorTema() {
        try {
            con = new Conexao();
            String SQL = "select cod_perg as 'Código' , pergunta as 'Pergunta', respostaA as 'Resposta A' , respostaB as 'Resposta B', respostaC as 'Resposta C', resp_certa as 'Resposta Certa' , tema.nome as 'Tema' from perguntas inner join tema on tema.cod_tema=perguntas.cod_tema where tema.nome like ?";
            PreparedStatement ps = con.getConexao().prepareStatement(SQL);
            ps.setString(1, ViewAdm.FrmCadastroPerguntaAdm.cmbTemaPesquisa.getSelectedItem()+ "%");
           
            ResultSet rs = ps.executeQuery();
            ViewAdm.FrmCadastroPerguntaAdm.tblPerguntas.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro.getMessage());
        }
    }
    

    public boolean Excluir(int ID) throws Exception {
        con = new Conexao();
        String SQL = "delete from perguntas where cod_perg = ?";
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);
        ps.setInt(1, ID);
        if (ps.executeUpdate() > 0) {
            return true;
        } else {
            return false;
        }
    }

}
