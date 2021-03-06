package cn.edu.nju.movietubeserver.dao;

import cn.edu.nju.movietubeserver.model.po.RateDetailPo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author dc
 * @date 2020/2/11 21:05
 */
@Mapper
@Repository
public interface RateDetailDao
{

    int insertOrUpdateRateDetail(@Param("rateDetailPo") RateDetailPo rateDetailPo);

    Integer getMyRateByMovieId(@Param("userId") Integer userId, @Param("movieId") Long movieId);

}
