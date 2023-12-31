package com.example.bomoc.model.product.feedback;

import com.example.bomoc.model.product.feedback.FeedBack;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "Rating")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rating {

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
	@Column(name = "RatingValue")
	private int ratingValue;
	@Column(name = "CreatedAt")
	private LocalDateTime createdAt;

}