package com.example.weather;

import com.example.weather.Models.NewsHeadlines;

import java.util.List;

public interface OnFecthDataListener<NewsApiResponse> {

    void onFecthData(List<NewsHeadlines> list, String message);
    void onError(String message);
}
