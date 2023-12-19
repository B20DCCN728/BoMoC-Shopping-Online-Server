package com.example.bomoc.model.product.feedback;

import java.time.LocalDateTime;

public class Comment {

	FeedBack feedBack;
	private int ID;
	private String content;
	private LocalDateTime createdAt;
	private int parentCommentId;

}