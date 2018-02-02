package br.com.escola.cursos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.escola.bean.Cursos;

public class Modelo {
	
	public List<Cursos> listarCursos(){
		List<Cursos> lst = new ArrayList<Cursos>();
		
		Connection con = null;
		PreparedStatement pst = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/escola","root","");
			
			String consulta = "select cursos.nomecursos, areas.nomearea, dias.dia, horarios.hora, periodo.periodo  from listacursos inner join cursos on listacursos.fkcursos = cursos.idcursos inner join areas on listacursos.fkarea = areas.idarea inner join dias on listacursos.fkdias = dias.iddias inner join horarios on listacursos.fkhorario = horarios.idhorario inner join periodo on listacursos.fkperiodo = periodo.idperiodo";
			
			pst = con.prepareStatement(consulta);
			
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				Cursos cs = new Cursos(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5));
				lst.add(cs);
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return lst;
	}

}
