package com.ssm.example.mapper;

import com.ssm.example.po.ItemsCustom;
import com.ssm.example.po.ItemsQueryVo;

import java.util.List;

/**
 * <p>
 * Title: ItemsMapperCustom
 * </p>
 * <p>
 * Description:商品自定义mapper
 * </p>
 * <p>
 * Company: www.itcast.com
 * </p>
 *
 * @author Tyler Yin
 * @version 1.0
 * @date 2015-3-20下午3:00:53
 */
public interface ItemsMapperCustom {
    // 商品查询列表
    public List<ItemsCustom> findItemsList(ItemsQueryVo itemsQueryVo)
            throws Exception;

}
