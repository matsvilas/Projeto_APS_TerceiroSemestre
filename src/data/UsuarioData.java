package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import model.Usuarios;
import net.proteanit.sql.DbUtils;
import static ViewAdm.FrmCadastroUsuariosAdm.tblUsuarios;

public class UsuarioData {

    Conexao con;

    public boolean Incluir(Usuarios objUser) throws Exception {
        con = new Conexao();
        String usuario = null;
        String SQL1 = "select * from usuario where usuario = ?";
        PreparedStatement ps1 = con.getConexao().prepareStatement(SQL1);
        ps1.setString(1, objUser.getUsuario());
        ResultSet rs = ps1.executeQuery();
        while (rs.next()) {
            usuario = rs.getString("usuario");
        }

        if (objUser.getUsuario().equals(usuario)) {
            JOptionPane.showMessageDialog(null, "Usuário já cadastrado!");
            return false;

        } else {
            String SQL2 = "insert into usuario values (?,?,?)";
            PreparedStatement ps2 = con.getConexao().prepareStatement(SQL2);
            ps2.setString(1, objUser.getUsuario());
            ps2.setString(2, objUser.getNome());
            ps2.setString(3, objUser.getSenha());

            if (ps2.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    public boolean acessarSistema(String usuario, String senha) throws Exception {
        con = new Conexao();

        String nome = null;
        String SQL = "select nome, usuario, senha from usuario where usuario = ? and senha = ?";
        String SQL2 = "select cod_usu from usuario where usuario = ? and senha = ?";
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);
        ps.setString(1, usuario);
        ps.setString(2, senha);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            usuario = rs.getString("usuario");
            senha = rs.getString("senha");
            nome = rs.getString("nome");
        }
        if (nome == null) {
            return false;
        } else {
            return true;

        }

    }

    public int pegarCodUser(String usuario, String senha) throws Exception {

        con = new Conexao();
        int cod = 0;
        String SQL = "select cod_usu from usuario where usuario = ? and senha = ?";
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);
        ps.setString(1, usuario);
        ps.setString(2, senha);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {

            cod = rs.getInt("cod_usu");
            

        }
        return cod;
        
    }

    public String pegarNomeUser(String usuario, String senha) throws Exception {

        con = new Conexao();
        String nome = "";
        String SQL = "select nome from usuario where usuario = ? and senha = ?";
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);
        ps.setString(1, usuario);
        ps.setString(2, senha);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {

            nome = rs.getString("nome");

        }
        return nome;
    }
    
    
    
      public String pegarNomeUser(int cod) throws Exception {

        con = new Conexao();
        String nomee = "Administrador";
        String SQL = "select nome from usuario where cod_usu = ?";
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);
        ps.setInt(1, cod);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {

            nomee = rs.getString("nome");

        }
        return nomee;
    }

    public boolean Editar(Usuarios objUser) throws Exception {
        con = new Conexao();
        String usuario = null;
        String SQL1 = "select * from usuario where usuario = ?";
        PreparedStatement ps1 = con.getConexao().prepareStatement(SQL1);
        ps1.setString(1, objUser.getUsuario());
        ResultSet rs = ps1.executeQuery();
        while (rs.next()) {
            usuario = rs.getString("usuario");
        }

        if (objUser.getUsuario().equals(usuario)) {
            JOptionPane.showMessageDialog(null, "Usuário já cadastrado, não foi possível editar!");
            return false;

        } else {
            String SQL = "update usuario set usuario = ?, nome = ?, senha = ? where cod_usu = ?";
            PreparedStatement ps = con.getConexao().prepareStatement(SQL);
            ps.setString(1, objUser.getUsuario());
            ps.setString(2, objUser.getNome());
            ps.setString(3, objUser.getSenha());
            ps.setInt(4, objUser.getCodigo());

            if (ps.executeUpdate() > 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    public boolean Excluir(int ID) throws Exception {
        con = new Conexao();
        String SQL = "delete from usuario where cod_usu = ?";
        PreparedStatement ps = con.getConexao().prepareStatement(SQL);
        ps.setInt(1, ID);
        if (ps.executeUpdate() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public void listarUsuarios() {
        try {
            con = new Conexao();
            String SQL = "select cod_usu as 'Código', usuario as 'Usuário', nome as 'Nome', senha 'Senha' from usuario";
            PreparedStatement ps = con.getConexao().prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            ViewAdm.FrmCadastroUsuariosAdm.tblUsuarios.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro.getMessage());
        }
    }

    public void pesquisarUsuarios() {
        try {
            con = new Conexao();
            String SQL = "select cod_usu as 'Código', usuario as 'Usuário', nome as 'Nome', senha 'Senha' from usuario where usuario like ?";
            PreparedStatement ps = con.getConexao().prepareStatement(SQL);
            ps.setString(1, ViewAdm.FrmCadastroUsuariosAdm.txtPesquisa.getText() + "%");
            ResultSet rs = ps.executeQuery();
            tblUsuarios.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro.getMessage());
        }
    }
}
