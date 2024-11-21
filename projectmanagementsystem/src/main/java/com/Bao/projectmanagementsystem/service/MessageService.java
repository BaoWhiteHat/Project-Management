package com.Bao.projectmanagementsystem.service;

import com.Bao.projectmanagementsystem.modal.Message;

import java.util.List;

public interface MessageService {

    Message sendMessage(Long senderId, Long ChatId, String content) throws Exception;

    List<Message> getMessagesByProjectId(Long projectId) throws Exception;
}
