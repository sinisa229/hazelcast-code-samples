package com.hazelcast.samples.spring.data.migration;

import com.hazelcast.core.MapLoader;
import com.hazelcast.samples.spring.data.migration.jpa.DailyAccumulatorEntityRepository;
import com.hazelcast.samples.spring.data.migration.model.DailyAccumulatorEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Component
@Slf4j
public class DailyAccumulatorEntityLoader implements MapLoader<Long, DailyAccumulatorEntity> {

    private DailyAccumulatorEntityRepository dailyAccumulatorEntityRepository;

    public DailyAccumulatorEntityLoader(final DailyAccumulatorEntityRepository dailyAccumulatorEntityRepository) {
        this.dailyAccumulatorEntityRepository = dailyAccumulatorEntityRepository;
    }

    @Override
    public DailyAccumulatorEntity load(Long id) {
        return dailyAccumulatorEntityRepository.findOne(id);
    }

    @Override
    public Map<Long, DailyAccumulatorEntity> loadAll(Collection<Long> keys) {
        Map<Long, DailyAccumulatorEntity> result = new HashMap<>();
        for (Long key : keys) {
            DailyAccumulatorEntity noun = this.load(key);
            if (noun != null) {
                result.put(key, noun);
            }
        }
        return result;
    }

    @Override
    public Iterable<Long> loadAllKeys() {
        return dailyAccumulatorEntityRepository.findAllId();
    }

}
