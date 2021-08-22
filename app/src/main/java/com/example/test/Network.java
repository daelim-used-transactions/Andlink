package com.example.test;

import android.os.AsyncTask;

import java.util.Map;

public class Network extends AsyncTask<Map<String, String>,Integer,String> {
    /**
     * doInBackground 이전
     */
    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    /**
     * 실제로 등장하는 on 작업을 Thread로 처리
     *
     * @param
     * @return
     */
    @Override
    protected String doInBackground(Map<String, String>... maps) {

        // HTTP 요청 준비 작업
        HttpClient.Builder http = new HttpClient.Builder("POST", "http://172.16.1.14:8080/android2");

        //파라미터 전송
         http.addAllParameters(maps[0]);

        // HTTP 요청 전송
        HttpClient post = http.create();
        post.request();

        // 응답 상태코드 가져오기
        int statusCode = post.getHttpStatusCode();

        // 응답 본문
        String body = post.getBody();
        System.out.println("ㅎㅇㄹ1");
        return body;
    }

    /**
     * doInBackground 이후
     * @param s
     */
    @Override
    protected void onPostExecute(String s) {
        System.out.println("ㅎㅇㄹ2");
    }
}

