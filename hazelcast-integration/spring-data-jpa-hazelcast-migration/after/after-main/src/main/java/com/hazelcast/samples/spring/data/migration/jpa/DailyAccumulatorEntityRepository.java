package com.hazelcast.samples.spring.data.migration.jpa;

import com.hazelcast.samples.spring.data.migration.model.DailyAccumulatorEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface DailyAccumulatorEntityRepository extends CrudRepository<DailyAccumulatorEntity, Long> {

    @Query("SELECT n.id FROM DailyAccumulatorEntity n")
    Iterable<Long> findAllId();

}
