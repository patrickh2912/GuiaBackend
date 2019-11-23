package pe.edu.uni.fiis.poo.classuniweb.dao.datasource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public abstract class MyDatasource {

    @Autowired
    protected JdbcTemplate jdbcTemplate;
}
