package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.Tema;
import net.proteanit.sql.DbUtils;

public class TemaData {

    Conexao con;

    public boolean Incluir(Tema obTema) throws Exception {
        con = new Conexao();
        String tema = null;
        String SQL1 = "select * from tema where nome = ?";
        PreparedStatement ps1 = con.getConexao().prepareStatement(SQL1);
        ps1.setString(1, obTema.getTema());
        ResultSet rs = ps1.executeQuery();
        while (rs.next()) {
            tema = rs.getString("tema");
        }

        if (obTema.getTema().equals(tema)) {
            JOptionPane.showMessageDialog(null, "Tema já cadastrado!");
            return false;

        } else {
            String SQL2 = "insert into tema values (?)";
            PreparedStatement ps2 = con.getConexao().prepareStatement(SQL2);
            ps2.setString(1, obTema.getTema());
            if (ps2.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }

        }
    }

    public Tema Pesquisar(String tema) throws Exception {
        con = new Conexao();
        Tema obTema = null;
        String SQL = "select * from tema where nome like ?";
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);
        ps.setString(1, tema);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            obTema = new Tema();
            obTema.setTema(rs.getString("nome"));

        }
        return obTema;
    }

    public boolean Editar(Tema obTema) throws Exception {
        con = new Conexao();
        String SQL = "update tema set nome = ? where cod_tema = ?";
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);
        ps.setString(1, obTema.getTema());
        ps.setInt(2, obTema.getCodigoTema());
        if (ps.executeUpdate() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void listarTemas() {
        try {
            con = new Conexao();
            String SQL = "select cod_tema as 'Código' , nome as 'Tema' from tema";
            PreparedStatement ps = con.getConexao().prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            ViewAdm.FrmCadastroTemaAdm.tblTema.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro.getMessage());
        }
    }

    public void pesquisarTema() {
        try {
            con = new Conexao();
            String SQL = "select cod_tema as 'Código', nome as 'Tema' from tema where nome like ?";
            PreparedStatement ps = con.getConexao().prepareStatement(SQL);
            ps.setString(1, ViewAdm.FrmCadastroPerguntaAdm.txtPesquisa.getText() + "%");
            ResultSet rs = ps.executeQuery();
            ViewAdm.FrmCadastroTemaAdm.tblTema.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro.getMessage());
        }
    }

    public boolean Excluir(int ID) throws Exception {
        con = new Conexao();
        String SQL = "delete from tema where cod_tema = ?";
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);
        ps.setInt(1, ID);
        if (ps.executeUpdate() > 0) {
            return true;
        } else {
            return false;
        }
    }

}
