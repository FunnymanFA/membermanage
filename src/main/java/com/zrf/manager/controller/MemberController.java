package com.zrf.manager.controller;

import com.zrf.manager.entity.Member;
import com.zrf.manager.service.MemberService;
import com.zrf.manager.utils.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/admin/member")
public class MemberController {
    @Resource
    MemberService memberService;


    @GetMapping("/list")
    public ResponseEntity<List<Member>> select(Member member,int page,int size){
        try {
            List<Member> memberList = new ArrayList<>();
            memberList = memberService.selectAll(member,page,size);
            return ResponseEntity.success(memberList);
        } catch (Exception e) {
            return ResponseEntity.error();
        }

    }


    @PostMapping("/add")
    public ResponseEntity<Integer> insert(Member member){
        try {
            int count = 0;
            count = memberService.insert(member);
            return ResponseEntity.success(count);
        } catch (Exception e) {
            return ResponseEntity.error();
        }

    }

    @PutMapping("/update")
    public ResponseEntity<Integer> update(Member member){
        try {
            int count = 0;
            count = memberService.update(member);
            return ResponseEntity.success(count);
        } catch (Exception e) {
            return ResponseEntity.error();
        }

    }

    @DeleteMapping("/delete")
    public ResponseEntity<Integer> delete(int memberId){
        try {
            int count = 0;
            count = memberService.delete(memberId);
            return ResponseEntity.success(count);
        } catch (Exception e) {
            return ResponseEntity.error();
        }

    }

    @PutMapping
    public ResponseEntity<Integer> active(int memberId){
        try {
            int count = 0;
            count = memberService.active(memberId);
            return ResponseEntity.success(count);
        } catch (Exception e) {
            return ResponseEntity.error();
        }
    }

    @DeleteMapping("/deleteBatch")
    public ResponseEntity<Integer> deleteBatch(List<Integer> ids){
        try {
            int count = 0;
            count = memberService.deleteBatch(ids);
            return ResponseEntity.success(count);
        } catch (Exception e) {
            return ResponseEntity.error();
        }

    }
}
