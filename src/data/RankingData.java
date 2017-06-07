package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class RankingData {

    Conexao con;

    public void listarRanking(String tema) {
        try {
            con = new Conexao();
            String SQL = "select TOP 10 u.usuario as 'Usuario' , count(ir.acertou) as 'Acertos' , r.data as 'Data' , r.hora as 'hora', t.nome as 'Tema' from usuario u inner join registro r on u.cod_usu = r.cod_usu inner join item_registro_pergunta ir on r.cod_reg = ir.cod_reg inner join perguntas p on p.cod_perg = ir.cod_perg inner join tema t on t.cod_tema = p.cod_tema where t.nome = ? and ir.acertou = 1 group by u.usuario, r.data, r.hora, t.nome order by count(ir.acertou) desc" ;
            PreparedStatement ps = con.getConexao().prepareStatement(SQL);
            ps.setString(1, tema);
            ResultSet rs = ps.executeQuery();
            quiz.FrmRank.tblRanking.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro: " + erro.getMessage());
        }

    }
}
