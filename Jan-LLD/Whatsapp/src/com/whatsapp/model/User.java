package com.whatsapp.model;

import com.whatsapp.model.enums.UserStatus;

import java.time.LocalDateTime;
import java.util.List;

public class User {

    private String userId;
    private String phoneNumber;
    private String name;
    private String profilePhoto;

    private UserStatus status;
    private LocalDateTime lastSeenAt;

    private List<ChatParticipant> chats;

    public User(String userId,
                String phoneNumber,
                String name) {
        this.userId = userId;
        this.phoneNumber = phoneNumber;
        this.name = name;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProfilePhoto() {
        return profilePhoto;
    }

    public void setProfilePhoto(String profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    public UserStatus getStatus() {
        return status;
    }

    public void setStatus(UserStatus status) {
        this.status = status;
    }

    public LocalDateTime getLastSeenAt() {
        return lastSeenAt;
    }

    public void setLastSeenAt(LocalDateTime lastSeenAt) {
        this.lastSeenAt = lastSeenAt;
    }

    public List<ChatParticipant> getChats() {
        return chats;
    }

    public void setChats(List<ChatParticipant> chats) {
        this.chats = chats;
    }
}
