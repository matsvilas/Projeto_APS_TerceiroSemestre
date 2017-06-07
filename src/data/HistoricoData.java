package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class HistoricoData {

    Conexao con;

    public void listarPerguntas() {
        try {
            con = new Conexao();
            String SQL = "select u.nome as 'Nome' , r.hora as 'Hora', r.data as 'Data' , p.resp_certa as 'Correta' ,  ir.acertou as 'Acertou' ,t.nome 'Tema' from usuario u \n"
                    + "inner join registro r on u.cod_usu = r.cod_usu\n"
                    + "inner join item_registro_pergunta ir on ir.cod_reg = r.cod_reg\n"
                    + "inner join perguntas p on p.cod_perg = ir.cod_perg\n"
                    + "inner join tema t on t.cod_tema = p.cod_tema";
            PreparedStatement ps = con.getConexao().prepareStatement(SQL);
            ResultSet rs = ps.executeQuery();
            ViewAdm.FrmJogadas.tblJogadas.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro.getMessage());
        }
    }
}
