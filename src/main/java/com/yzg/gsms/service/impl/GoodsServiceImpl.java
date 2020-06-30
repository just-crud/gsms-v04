package com.yzg.gsms.service.impl;

import com.yzg.gsms.dao.GoodsMapper;
import com.yzg.gsms.entity.Goods;
import com.yzg.gsms.service.GoodsService;
import org.springframework.stereotype.Service;
import org.springframework.util.IdGenerator;

import javax.annotation.Resource;

@Service
public class GoodsServiceImpl implements GoodsService {
    @Resource
    private IdGenerator idGenerator;
    @Resource
    private GoodsMapper goodsMapper;

    @Override
    public void add(Goods goods) {
        goodsMapper.insert(goods);
    }

    @Override
    public Goods get(String id) {
        return goodsMapper.get(id);
    }

    @Override
    public void update(Goods goods) {
        goodsMapper.update(goods);
    }

    @Override
    public void delete(String id) {
        goodsMapper.delete(id);
    }

    @Override
    public void logicalDelete(Goods goods) {
        goodsMapper.logicalDelete(goods);
    }
}
