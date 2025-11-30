package CF.AgendaContatos.dao;

import CF.AgendaContatos.dao.Conexao;
import CF.AgendaContatos.model.Contato;
import java.sql.*;
import java.util.ArrayList;

public class ContatoDAO {

    public void inserir(Contato c) {
        String sql = "INSERT INTO tbContato (nomeContato, enderecoContato, telefoneContato, emailContato, sexoContato) VALUES (?,?,?,?,?)";

        try (Connection con = Conexao.conectar();
             PreparedStatement stm = con.prepareStatement(sql)) {

            stm.setString(1, c.getNome());
            stm.setString(2, c.getEndereco());
            stm.setString(3, c.getTelefone());
            stm.setString(4, c.getEmail());
            stm.setString(5, c.getSexo());
            stm.executeUpdate();

        } catch (Exception e) {
        }
    }

    public ArrayList<Contato> listar() {
        ArrayList<Contato> lista = new ArrayList<>();
        String sql = "SELECT * FROM tbContato";

        try (Connection con = Conexao.conectar();
             PreparedStatement stm = con.prepareStatement(sql);
             ResultSet rs = stm.executeQuery()) {

            while (rs.next()) {
                Contato c = new Contato();
                c.setId(rs.getInt("idContato"));
                c.setNome(rs.getString("nomeContato"));
                c.setEndereco(rs.getString("enderecoContato"));
                c.setTelefone(rs.getString("telefoneContato"));
                c.setEmail(rs.getString("emailContato"));
                c.setSexo(rs.getString("sexoContato"));
                lista.add(c);
            }
        } catch (Exception e) {
        }
        return lista;
    }
}