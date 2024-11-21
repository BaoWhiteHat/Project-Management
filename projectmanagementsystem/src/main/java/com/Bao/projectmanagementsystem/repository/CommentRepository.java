package com.Bao.projectmanagementsystem.repository;

import com.Bao.projectmanagementsystem.modal.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentRepository extends JpaRepository<Comment, Long> {

    List<Comment> findByIssueId(Long issueId);
}
