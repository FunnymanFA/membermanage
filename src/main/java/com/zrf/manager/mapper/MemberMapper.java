package com.zrf.manager.mapper;

import com.zrf.manager.entity.Member;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MemberMapper {
    List<Member> selectAll(@Param("member") Member member,@Param("limit") int limit,@Param("offset") int offset);

    int insert(@Param("member") Member member);

    int update(@Param("member") Member member);

    int delete(@Param("memberId") int memberId);

    int active(@Param("memberId") int memberId);

    int deleteBatch(@Param("ids") List<Integer> ids);




}
