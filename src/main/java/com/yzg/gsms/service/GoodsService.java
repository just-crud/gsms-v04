package com.yzg.gsms.service;

import com.yzg.gsms.entity.Goods;

public interface GoodsService {

    void add(Goods goods);

    Goods get(String id);

    void update(Goods goods);

    void delete(String id);

    void logicalDelete(Goods goods);
}
