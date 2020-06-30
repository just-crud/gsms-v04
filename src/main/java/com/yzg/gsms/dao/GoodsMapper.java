package com.yzg.gsms.dao;

import com.yzg.gsms.entity.Goods;

public interface GoodsMapper {
    void insert(Goods goods);
    Goods get(String id);
    void update(Goods market);
    void delete(String id);
    void logicalDelete(Goods goods);
}
