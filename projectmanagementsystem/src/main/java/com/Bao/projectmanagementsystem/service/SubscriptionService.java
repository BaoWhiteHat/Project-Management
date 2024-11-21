package com.Bao.projectmanagementsystem.service;

import com.Bao.projectmanagementsystem.modal.PlanType;
import com.Bao.projectmanagementsystem.modal.Subscription;
import com.Bao.projectmanagementsystem.modal.User;

public interface SubscriptionService {

    Subscription createSubscription(User user);

    Subscription getUsersSubscription(Long userId) throws Exception;

    Subscription upgradeSubscription(Long userId, PlanType planType);

    boolean isValid(Subscription subscription);
}
