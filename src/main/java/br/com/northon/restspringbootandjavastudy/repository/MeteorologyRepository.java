package br.com.northon.restspringbootandjavastudy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.northon.restspringbootandjavastudy.repository.entity.MeteorologyEntity;

@Repository
public interface MeteorologyRepository extends JpaRepository<MeteorologyEntity, Long> {}
