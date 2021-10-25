package com.example.marvelapp.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ComicData {



        private int limit;

        private int total;

        private int count;

        private List<Comic> results;

        public ComicData(int limit, int total, int count, List<Comic> results) {

            this.limit = limit;
            this.total = total;
            this.count = count;
            this.results = results;
        }

        public int getLimit() {
            return limit;
        }

        public void setLimit(int limit) {
            this.limit = limit;
        }

        public int getTotal() {
            return total;
        }

        public void setTotal(int total) {
            this.total = total;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public List<Comic> getComics() {
            return results;
        }

        public void setResults(List<Comic> results) {
            this.results = results;
        }
    }

//add hashcode


