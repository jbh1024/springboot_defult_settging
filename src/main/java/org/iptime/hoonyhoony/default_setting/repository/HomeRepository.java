package org.iptime.hoonyhoony.default_setting.repository;

import org.iptime.hoonyhoony.default_setting.repository.entity.DefaultEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeRepository extends JpaRepository<DefaultEntity, Long> {

}
