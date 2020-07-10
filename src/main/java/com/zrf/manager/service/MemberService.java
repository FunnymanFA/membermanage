package com.zrf.manager.service;

import com.zrf.manager.entity.Member;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MemberService {
    List<Member> selectAll(Member member,int page,int size);

    int insert(Member member);

    int update(Member member);

    int delete(int memberId);

    int active(int memberId);

    int deleteBatch(List<Integer> ids);
}
