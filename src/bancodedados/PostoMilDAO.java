/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancodedados;

import acao.PostoMilAcao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class PostoMilDAO {
    Connection connection = null;
	
	public PostoMilDAO() {
		connection = Conexao.Configurar();
	}
	
    public int inserir(PostoMilAcao posto) {
    	int id = 0;
    	String sql = "INSERT INTO posto (combustivel_nome, combustivel, litros, lanche, bebidas, acessorio, outros, total)" +
    	        "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    	
    	try {
    		PreparedStatement preparedStatement;
		preparedStatement = (PreparedStatement) connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);		
	    	preparedStatement.setString(1, posto.getNomeCombustivel());
                preparedStatement.setDouble(2, posto.getValorCombustivel());
	    	preparedStatement.setDouble(3, posto.getLitros());
	    	preparedStatement.setDouble(4, posto.getLanche());
                preparedStatement.setDouble(5, posto.getBebidas());
                preparedStatement.setDouble(6, posto.getAcessorios());
                preparedStatement.setDouble(7, posto.getOutros());
                preparedStatement.setDouble(8, posto.getValorTotal());
	    	preparedStatement.executeUpdate(); 
	    	
	    	connection.close();
    	} catch (SQLException e) {
			e.printStackTrace();
		}
    	
    	return id;
    }
    
}
