package com.ishaan.project.model;

import javax.persistence.*;

@Entity
public class Posts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String username;
    private String colName;
    private String sem;
    private String branch;
    private String caption;
    private String subject;
    private String unit;
    private int noOfLikes;
    private int noOfComments;
    private boolean liked;

    @Lob
    @Column(length = 1000)
    private byte[] fileByte;
    private String fileType;

    @Lob
    @Column(length = 1000)
    private byte[] picByte;
    private String firstName;
    private String lastName;
    private boolean Bookmarked;

    public Posts(int id, String username, String colName, String sem, String branch, String caption, String subject, String unit, int noOfLikes, int noOfComments, boolean liked, byte[] fileByte, String fileType, byte[] picByte, String firstName, String lastName, boolean Bookmarked) {
        this.id = id;
        this.username = username;
        this.colName = colName;
        this.sem = sem;
        this.branch = branch;
        this.caption = caption;
        this.subject = subject;
        this.unit = unit;
        this.noOfLikes = noOfLikes;
        this.noOfComments = noOfComments;
        this.liked = liked;
        this.fileByte = fileByte;
        this.fileType = fileType;
        this.picByte = picByte;
        this.firstName = firstName;
        this.lastName = lastName;
        this.Bookmarked = Bookmarked;
    }

    public Posts() {

    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public byte[] getFileByte() {
        return fileByte;
    }

    public void setFileByte(byte[] fileByte) {
        this.fileByte = fileByte;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getColName() {
        return colName;
    }

    public void setColName(String colName) {
        this.colName = colName;
    }

    public String getSem() {
        return sem;
    }

    public void setSem(String sem) {
        this.sem = sem;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getNoOfLikes() {
        return noOfLikes;
    }

    public void setNoOfLikes(int noOfLikes) {
        this.noOfLikes = noOfLikes;
    }

    public int getNoOfComments() {
        return noOfComments;
    }

    public void setNoOfComments(int noOfComments) {
        this.noOfComments = noOfComments;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public byte[] getPicByte() {
        return picByte;
    }

    public void setPicByte(byte[] picByte) {
        this.picByte = picByte;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public boolean isLiked() {
        return liked;
    }

    public void setLiked(boolean liked) {
        this.liked = liked;
    }

    public boolean isBookmarked() {
        return Bookmarked;
    }

    public void setBookmarked(boolean bookmarked) {
        Bookmarked = bookmarked;
    }
}
