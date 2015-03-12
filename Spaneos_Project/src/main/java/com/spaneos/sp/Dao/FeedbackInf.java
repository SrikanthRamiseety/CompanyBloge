package com.spaneos.sp.Dao;

import java.util.List;

import com.spaneos.sp.pojo.Feedback;

public interface FeedbackInf {
boolean addFeedback(Feedback feedback);
List<Feedback> getAllFeedback();

}
