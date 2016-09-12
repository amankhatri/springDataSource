package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSourceUtils;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("offersDao")
public class OffersDAO {

	private NamedParameterJdbcTemplate jdbc;

	
//	public OffersDAO() {
//		System.out.println("In here");
//	}

	@Autowired
	public void setDataSource(DataSource jdbc) {
		System.out.println("something here");
		this.jdbc = new NamedParameterJdbcTemplate(jdbc);
	}

	public List<Offer> getOffers() {

		System.out.println("Inside GetOffers");
		return jdbc.query("select * from users", new RowMapper<Offer>() {

			public Offer mapRow(ResultSet rs, int rowNum) throws SQLException {
				Offer offer = new Offer();

				offer.setId(rs.getInt("id"));
				offer.setName(rs.getString("name"));
				return offer;
			}

		});
	}
	
//	public boolean update(Offer offer) {
//		BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(offer);
//		
//		return jdbc.update("update users set name=:name, text=:text, email=:email where id=:id", params) == 1;
//	}
//	
	public void create(Offer offer) {
		
		BeanPropertySqlParameterSource params = new BeanPropertySqlParameterSource(offer);
		//jdbc.up
		jdbc.update("insert into offers (name, id) values (:name, :id)", params);
	}
	
	@Transactional
	public int[] create(List<Offer> offers) {
		
		SqlParameterSource[] params = SqlParameterSourceUtils.createBatch(offers.toArray());
		
		return jdbc.batchUpdate("insert into offers (id, name, text, email) values (:id, :name, :text, :email)", params);
	}
	
	public boolean delete(int id) {
		MapSqlParameterSource params = new MapSqlParameterSource("id", id);
		
		return jdbc.update("delete from offers where id=:id", params) == 1;
	}

	public Offer getOffer(int id) {

		MapSqlParameterSource params = new MapSqlParameterSource();
		params.addValue("id", id);

		return jdbc.queryForObject("select * from users where id=:id", params,
				new RowMapper<Offer>() {

					public Offer mapRow(ResultSet rs, int rowNum)
							throws SQLException {
						Offer offer = new Offer();

						offer.setId(rs.getInt("id"));
						offer.setName(rs.getString("name"));
						return offer;
					}

				});
	}
	
}
