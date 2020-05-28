package com.sb.uiuui.webservice.domain.posts;

import com.sb.uiuui.webservice.domain.BaseTimeEntity; 

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

 
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@Entity 
public class Posts extends BaseTimeEntity {
    @Id
	@GeneratedValue
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    } 
    /*
    public class Builder{
        @Id
    	@GeneratedValue(strategy=GenerationType.IDENTITY)
        private Long id;

        @Column(length = 500, nullable = false)
        private String title;

        @Column(columnDefinition = "TEXT", nullable = false)
        private String content;

        private String author;

        public void id(Long id) {
        	this.id = id;
        }
        
        public void title(String title) {
        	this.title = title;
        }
        
        public void content(String content) {
        	this.content = content;
        }
        
        public void author(String author) {
        	this.author = author;
        }
    }*/
    
}
