package com.hazelcast.samples.spring.data.migration;

import com.hazelcast.core.MapLoader;
import com.hazelcast.samples.spring.data.migration.model.DailyAccumulatorEntity;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.Collection;
import java.util.Map;

public class DailyAccumulatorEntityLoader implements ApplicationContextAware, MapLoader<Long, DailyAccumulatorEntity> {

    @Override
    public DailyAccumulatorEntity load(Long aLong) {
        return null;
    }

    @Override
    public Map<Long, DailyAccumulatorEntity> loadAll(Collection<Long> collection) {
        return null;
    }

    @Override
    public Iterable<Long> loadAllKeys() {
        return null;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }

}
