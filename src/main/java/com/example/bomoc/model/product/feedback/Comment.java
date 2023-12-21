package com.example.bomoc.model.product.feedback;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "Comment")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Comment {

	@OneToOne(
			fetch = FetchType.LAZY,
			optional = false,
			cascade = CascadeType.ALL,
			targetEntity = FeedBack.class
	)
	@JoinColumn(
			name = "FeedBackID",
			referencedColumnName = "ID"
	)
	private FeedBack feedBack;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int ID;
	@Column(name = "Content")
	private String content;
	@Column(name = "CreatedAt")
	private LocalDateTime createdAt;
	@Column(name = "ParentCommentId")
	private int parentCommentId;

}