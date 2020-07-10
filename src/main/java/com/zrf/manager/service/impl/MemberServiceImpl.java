package com.zrf.manager.service.impl;

import com.zrf.manager.entity.Member;
import com.zrf.manager.mapper.MemberMapper;
import com.zrf.manager.service.MemberService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class MemberServiceImpl implements MemberService {
    @Resource
    MemberMapper memberMapper;

    @Override
    public List<Member> selectAll(Member member,int page,int size) {
        List<Member> members = new ArrayList<>();
        int limit = (page-1) * size;
        members = memberMapper.selectAll(member,limit,size);
        return members;
    }


    @Override
    public int insert(Member member) {
        int count = 0;
        count = memberMapper.insert(member);
        return count;
    }

    @Override
    public int update(Member member) {
        int count = 0;
        count = memberMapper.update(member);
        return count;
    }

    @Override
    public int delete(int memberId) {
        int count = 0 ;
        count = memberMapper.delete(memberId);
        return count;
    }

    @Override
    public int active(int memberId) {
        int count = 0 ;
        count = memberMapper.active(memberId);
        return count;
    }

    @Override
    public int deleteBatch(List<Integer> ids) {
        int count = 0 ;
        count = memberMapper.deleteBatch(ids);
        return count;
    }
}
