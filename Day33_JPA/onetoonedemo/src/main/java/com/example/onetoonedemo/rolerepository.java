package com.example.onetoonedemo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface rolerepository extends JpaRepository<Role, Integer>{

    

}
rolerepository repo = context.getBean(rolerepository.class);

roleEntity pants = new MerchandiseEntity(
"Pair of Pants", BigDecimal.ONE);
pants = repo.save(pants)