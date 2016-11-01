/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facepalm.model;

import com.google.gson.annotations.SerializedName;
import com.sun.xml.internal.ws.developer.Serialization;
import java.util.ArrayList;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Thông tin người dùng
 * @author TungHH
 */
public class User {
    
    
    @SerializedName("id")    
    private String _id;

    @SerializedName("name")
    private String _name;
    
    @SerializedName("about")
    private String _about;

    @SerializedName("birthday")    
    private String _birthday;

    @SerializedName("email")
    private String _email;
    
    @SerializedName("gender")
    private String _gender;
    
    @SerializedName("quotes")
    private String _quotes;
    
    @SerializedName("cover")
    private Cover _cover;
    
    @SerializedName("albums")
    private UserAlbum _albumId;              

    @SerializedName("likes")
    private UserPageLike _pagelikes;
    
    @SerializedName("feed")
    private UserFeed _feed;
    
    public static String buildFieldsParams(){
        // để sau bỏ vô cái list cho dễ
        return "about,name,id,birthday,email,gender,quotes,cover,albums,likes,feed";
    }
    
    /**
     * @return the _id
     */
    public String getId() {
        return _id;
    }

    /**
     * @return the _name
     */
    public String getName() {
        return _name;
    }

    /**
     * @return the _about
     */
    public String getAbout() {
        return _about;
    }

    /**
     * @return the _birthday
     */
    public String getBirthday() {
        return _birthday;
    }

    /**
     * @return the _email
     */
    public String getEmail() {
        return _email;
    }

    /**
     * @return the _gender
     */
    public String getGender() {
        return _gender;
    }

    /**
     * @return the _quotes
     */
    public String getQuotes() {
        return _quotes;
    }

    /**
     * @return the _cover
     */
    public Cover getCover() {
        return _cover;
    }

    /**
     * @return the _albumId
     */
    public UserAlbum getAlbumId() {
        return _albumId;
    }

    /**
     * @return the _pagelikes
     */
    public UserPageLike getPagelikes() {
        return _pagelikes;
    }

    /**
     * @return the _feed
     */
    public UserFeed getFeed() {
        return _feed;
    }

    
    private class Cover{
        @SerializedName("id")
        private String _id;
        
        @SerializedName("offset_y")
        private int _offsetY;
        
        @SerializedName("source")
        private String _source;
    }
    
    /**
     * Lớp chứa danh sách các trang người dùng like
     */
    private class UserPageLike{
        @SerializedName("data")
        private ArrayList<PageLike> _likes;
        
        @SerializedName("paging")
        private Paging _paging;
    }
    
    /**
     * Lớp chứa danh sách các album
     */
    private class UserAlbum{
        @SerializedName("data")
        private ArrayList<Album> _albums;
        
        @SerializedName("paging")
        private Paging _paging;
    }
    
    /**
     * Lớp chứa danh sách các bài feed của ngừoi dùng
     */
    private class UserFeed{
        @SerializedName("data")
        private ArrayList<Feed> _feeds;
        
        @SerializedName("paging")
        private Paging _paging;
    }
    
    private class Paging{
        
        @SerializedName("cursors")            
        private Cursor cursor;
        
        private class Cursor{
            @SerializedName("before")            
            private String before;
            
            @SerializedName("after")            
            private String after;
        }
    }
    
            
}
