/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: MyMapper
 * Author:   chenfz
 * Date:     2018/12/11 13:56
 * Description: 该接口不能被扫描到，否则会出错
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.chenfz.utils;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;
/**
 * 〈一句话功能简述〉<br>
 * 〈该接口不能被扫描到，否则会出错〉
 *
 * @author chenfz
 * @create 2018/12/11
 * @since 1.0.0
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}

