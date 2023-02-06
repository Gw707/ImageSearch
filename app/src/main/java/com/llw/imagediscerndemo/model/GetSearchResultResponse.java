package com.llw.imagediscerndemo.model;

import java.util.List;

public class GetSearchResultResponse {
    private List<ResultBean> result;

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean{

        private double score;
        private String brief;
        private String cont_sign;

        @Override
        public String toString() {
            return "GetSearchResultResponse{" +
                    "score=" + score +
                    ", brief='" + brief + '\'' +
                    ", cont_sign='" + cont_sign + '\'' +
                    '}';
        }

        public double getScore() {
            return score;
        }

        public void setScore(double score) {
            this.score = score;
        }

        public String getBrief() {
            return brief;
        }

        public void setBrief(String brief) {
            this.brief = brief;
        }

        public String getCont_sign() {
            return cont_sign;
        }

        public void setCont_sign(String cont_sign) {
            this.cont_sign = cont_sign;
        }
    }
}
