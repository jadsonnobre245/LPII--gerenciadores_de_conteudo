/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco.DAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import Banco.Conexao.ConFactory;
import Negocio.Imagem;
import Negocio.Texto;

/**
 *
 * @author Jadson Nobre
 */
public class ConteudoDAO {
    private Connection con;
    
    public ConteudoDAO(){}
    
    public boolean Inserir(Imagem imagem){
       this.con = new ConFactory().conectar();
       PreparedStatement stmt = null;
       String sql = "INSERT INTO db_gerenciador.conteudo(nome, assunto, coordenadaX, coordenadaY, tamanho, link, tipo_conteudo, arquivoimagem)VALUES(?, ?, ?, ?, ?, ?, ?, ?)"; 
        try {     
            stmt = con.prepareStatement(sql);

            stmt.setString(1, imagem.getNome());
            stmt.setString(2, imagem.getAssunto());        
            stmt.setInt(3, imagem.getPos().getCoordX());
            stmt.setInt(4, imagem.getPos().getCoordY());
            stmt.setFloat(5, imagem.getSize());
            stmt.setString(6, imagem.getLink());
            stmt.setString(7, "Imagem");
            stmt.setString(8, imagem.getFilename());
            
            stmt.executeUpdate(); //executa comando       
            stmt.close();
           
            
        }catch (SQLException u) {
            System.out.println( "Erro ao Inserir Imagem - ConteudoDAO.Inserir() - "+u);
            throw new RuntimeException(u);        
        }finally{
           ConFactory.closeConexao(con, stmt);
       }
        return true;
    }
    
    public boolean Inserir(Texto texto){
         this.con = new ConFactory().conectar();
       PreparedStatement stmt = null;
       String sql = "INSERT INTO db_gerenciador.conteudo(nome, assunto, coordenadaX, coordenadaY, tamanho, link, tipo_conteudo, titulo, descricao)VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)"; 
        try {     
            stmt = con.prepareStatement(sql);

            stmt.setString(1, texto.getNome());
            stmt.setString(2, texto.getAssunto());        
            stmt.setInt(3, texto.getPos().getCoordX());
            stmt.setInt(4, texto.getPos().getCoordY());
            stmt.setFloat(5, texto.getSize());
            stmt.setString(6, texto.getLink());
            stmt.setString(7, "Texto");
            stmt.setString(8, texto.getTitulo());
            stmt.setString(9, texto.getDescricao());
            
            stmt.executeUpdate(); //executa comando       
            stmt.close();
           
            
        }catch (SQLException u) {
            System.out.println( "Erro ao Inserir Texto - ConteudoDAO.Inserir() - "+u);
            throw new RuntimeException(u);        
        }finally{
           ConFactory.closeConexao(con, stmt);
       }
        return true;
    }
}
