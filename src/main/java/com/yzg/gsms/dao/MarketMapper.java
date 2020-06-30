package com.yzg.gsms.dao;

import com.yzg.gsms.entity.Market;

public interface MarketMapper {
    void insert(Market market);
    Market get(String id);
    void update(Market market);
    void delete(String id);
    void logicalDelete(Market market);
}
